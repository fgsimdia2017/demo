package com.demo.utils;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author huangfeng
 * @Date 2023/11/15 13:54
 * @description
 * @Version 1.0
 */
@Slf4j
public class ChatGptTransferUtils {

    private static final int MAX_LENGTH = 8000;

    private static final int MAX_OFFSET = 200;

    private ChatGptTransferUtils() {
    }

    /**
     * 根据文本类型获取不同的分割的数据
     * @param text
     * @param textType
     * @return
     */
    public static List<String> getSplitTextList(String text,Integer textType){
    if (textType.equals("2")) {
        return splitText2Parts(text);
    }
    return htmlText2Parts(text);
}
    /**
     * 分段html文本为多段
     *
     * @param html
     * @return
     */
    public static List<String> htmlText2Parts(String html) {
        // 使用Jsoup解析HTML文档
        Document doc = Jsoup.parse("<h1></h1>" + html);
        // 获取所有的HTML元素
        Elements elements = doc.getAllElements();
        // 初始化段落列表
        List<String> sections = new ArrayList<>();
        // 初始化当前段落
        StringBuilder section = new StringBuilder();
        // 初始化当前段落的长度
        int sectionLength = 0;

        // 遍历所有的HTML元素
        for (Element element : elements) {
            // 如果元素是列表元素，那么将它的每一个列表项作为一个单独的部分
            if (element.tagName().equals("ul") || element.tagName().equals("ol")) {
                Elements listItems = element.children();
                for (Element listItem : listItems) {
                    processPart(sections, section, listItem.text(), sectionLength);
                }
            } else {
                // 分割当前元素的内容
                List<String> parts = splitElement(element);
                // 遍历所有的部分
                for (String part : parts) {
                    // 检查添加当前部分是否会导致当前段落长度超过最大长度
                    if (sectionLength + part.length() > MAX_LENGTH) {
                        // 如果会超过最大长度，就添加当前段落到段落列表，然后开始一个新的段落
                        if (sectionLength > 0) {
                            sections.add(section.toString());
                            section.setLength(0);
                            sectionLength = 0;
                        }
                        sections.add(part);
                    } else {
                        // 如果不会超过最大长度，就添加当前部分到当前段落
                        section.append(part);
                        sectionLength += part.length();
                    }
                }
            }
        }

        // 如果最后一个段落有内容，就添加到段落列表
        if (sectionLength > 0) {
            sections.add(section.toString());
        }

        // 返回段落列表
        return sections;
    }

    // 处理一个部分，如果添加这个部分会导致当前段落长度超过最大长度，那么就添加当前段落到段落列表，然后开始一个新的段落
    private static void processPart(List<String> sections, StringBuilder section, String part, int sectionLength) {
        if (sectionLength + part.length() > MAX_LENGTH) {
            if (sectionLength > 0) {
                sections.add(section.toString());
                section.setLength(0);
                sectionLength = 0;
            }
            sections.add(part);
        } else {
            section.append(part);
            sectionLength += part.length();
        }
    }

    private static List<String> splitElement(Element element) {
        List<String> parts = new ArrayList<>();
        StringBuilder part = new StringBuilder();
        int partLength = 0;

        for (Node node : element.childNodes()) {
            String nodeHtml = node.outerHtml();
            int nodeLength = nodeHtml.length();

            // 如果添加节点会导致长度超过最大长度，并且当前部分不为空，则添加当前部分到部分列表
            if (partLength + nodeLength > MAX_LENGTH && partLength > 0) {
                parts.add(part.toString());
                part.setLength(0);
                partLength = 0;
            }

            // 如果节点长度大于最大长度，直接将节点作为一个新的部分添加到部分列表
            if (nodeLength > MAX_LENGTH) {
                parts.add(nodeHtml);
            } else {
                // 否则将节点添加到当前部分
                part.append(nodeHtml);
                partLength += nodeLength;
            }
        }

        // 如果最后一个部分有内容，将其添加到部分列表
        if (partLength > 0) {
            parts.add(part.toString());
        }

        return parts;
    }


    /**
     * 普通文件如果大于chatgpt最大值,需要截取为多端
     *
     * @param text
     * @return
     */
    public static List<String> splitText2Parts(String text) {
        if (StrUtil.isBlank(text)) {
            return Collections.emptyList();
        }
        try {
            List<String> parts = new ArrayList<>();
            if (text.length() <= MAX_LENGTH) {
                return Collections.singletonList(text);
            }
            for (int i = 0; i < text.length(); i++) {
                if (i < MAX_LENGTH) {
                    continue;
                }
                int lastIndex = getLastIndex(parts);
                int startIndex = (i - lastIndex);
                // 最后结尾不管多少条直接结束
                if (i == text.length() - 1) {
                    String subResult = text.substring(lastIndex, i + 1);
                    parts.add(subResult);
                    continue;
                }
                // 其它条件下,不是结尾,必须要有最大条数的情况下才划分
                if (i - lastIndex < MAX_LENGTH) {
                    continue;
                }
                String str = text.substring(i, i + 1);
                // 获取到以.等结尾的直接结束
                if (isCloseSign(str)) {
                    String subResult = text.substring(lastIndex, i + 1);
                    parts.add(subResult);
                    continue;
                }
                // 超过阈值时,直接以当前index结束
                if (startIndex % MAX_LENGTH >= MAX_OFFSET) {
                    String subResult = text.substring(lastIndex, i + 1);
                    parts.add(subResult);
                }
            }
            return parts;
        } catch (Exception e) {
            log.error("分拆文本为多段失败,error: ", e);
            return Collections.emptyList();
        }

    }

    private static boolean isCloseSign(String str) {
        if (StrUtil.isBlankIfStr(str)) {
            return false;
        }
        return Arrays.asList("。", "？", "！", "…", ".", "?", "!", ".").contains(str);
    }

    public static int getLastIndex(List<String> parts) {
        if (CollectionUtil.isEmpty(parts)) {
            return 0;
        }
        int index = 0;
        for (String part : parts) {
            index += part.length();
        }
        return index;
    }
}
