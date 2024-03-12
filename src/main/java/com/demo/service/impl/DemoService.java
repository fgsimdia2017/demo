package com.demo.service.impl;

import cn.hutool.core.io.IoUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.deepl.api.DeepLException;
import com.deepl.api.TextResult;
import com.deepl.api.Translator;
import com.demo.dao.UserRepository;
import com.demo.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author huangfeng
 * @Date 2023/9/14 11:28
 * @description
 * @Version 1.0
 */
@Service
public class DemoService {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private UserRepository userRepository;

    public String getRedisData(String key) {

        final RedisProperties.Jedis jedis = new RedisProperties.Jedis();
        // RedisProperties.Jedis jedis = new Jedis("rediss://sshuser:[sshpassword]@sshhost:sshport");
        return redisTemplate.opsForValue().get(key);
    }

    public Object getUser() {
        UserVO one = userRepository.getOne(1L);
        return one;
    }

    public Object getUserByGoogle(String google) {
        final UserVO byGoogle = userRepository.getByGoogle(google);
        return byGoogle;
    }

    public void setRedisData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }


    public static String translator(String text) {

      /*  try {
            String url = "https://api-free.deepl.com/v2/translate";
            String authKey = "f3bf4882-58ac-50e1-5d7e-a5af8deee4b5:fx";  // Replace with your key
            String targetLang = "ZH";
            String source = "Releasing new market report later today on Arete Research. Covering what I'm seeing from structural flows perspective, risks to upside and catalysts with executable triggers I've been watching closely.";
            Map<String, Object> map = new HashMap<>(2);
            map.put("text", Arrays.asList(source));
            map.put("target_lang", targetLang);
            return HttpRequest.post(url).form(map)
                    .header("Authorization", String.format("DeepL-Auth-Key [%s]", authKey))
                    .header("Content-Type", "application/json").execute().body();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";*/


        String authKey = "f3bf4882-58ac-50e1-5d7e-a5af8deee4b5:fx";  // Replace with your key
        Translator translator = new Translator(authKey);
        TextResult result = null;
        try {
            result = translator.translateText(text, null, "ZH");
        } catch (DeepLException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return result.getText();
    }

    public static void main(String[] args) {
        String source = "{\"model\":\"gpt-3.5-turbo-1106\",\"temperature\":0,\"messages\":[{\"role\":\"system\",\"content\":\"You will be provided with a sentence in English, and your task is to translate it into Chinese. Ensuring that numerical values and units (such as '12.34B', '234M', '92.2K') remain unchanged.Do not translate proper nouns.Focus on clarity in translation for a financial and research platform context.Take a deep breath before you translate.\"},{\"role\":\"user\",\"content\":\"Good afternoon my #fellowshipofthealts $xrp $link $atom $hbar $vet $xlm $cspr Guess it’s about tim  I reveal a sneak peak….. don’t think my DMs could handle any more requests….Feel free to leave me a little $xrp tip 😇😇 at least I’m not shilling some rug pull… \"}],\"tools\":[{\"type\":\"function\",\"function\":{\"name\":\"tool_translate\",\"parameters\":{\"type\":\"object\",\"properties\":{\"source_language\":{\"type\":\"string\",\"enum\":[\"ZH\",\"EN\"]},\"translated_content_list\":{\"type\":\"array\",\"description\":\"list of translated content\",\"items\":{\"type\":\"object\",\"properties\":{\"translated\":{\"type\":\"string\",\"description\":\"translated content, based on the target_language\"},\"target_language\":{\"type\":\"string\",\"enum\":[\"ZH\",\"EN\"]}}}}}},\"required\":[\"translated_content_list\",\"source_language\"]}}]}";
        String text = "<div><div><p><span>If you’re interested in spreading the word about this article, consider interacting with this tweet: </span><a href=\"https://x.com/0xRainandCoffee/status/1709989330280992798?s=20\" rel=\"\" target=\"_blank\">https://x.com/0xRainandCoffee/status/1709989330280992798?s=20</a></p><p><span>As we laid out in the first part of the </span><a href=\"https://maven11.mirror.xyz/e2pIdHzlaBi6m5GhsRGK0g5DyjgCVuU4lE614XmES5s\" rel=\"\" target=\"_blank\">Cross-Domain thesis</a><span>, we’re in the early stages of a move towards a world of many chains and rollups.";

        JSONObject systemMessage = new JSONObject(2)
                .putOpt("role", "system")
                .putOpt("content", "You will be provided with a sentence in English, and your task is to translate it into Chinese. Ensuring that numerical values and units (such as '12.34B', '234M', '92.2K') remain unchanged.Do not translate proper nouns.Focus on clarity in translation for a financial and research platform context.Take a deep breath before you translate.");
        JSONObject userMessage = new JSONObject(2)
                .putOpt("role", "user")
                .putOpt("content", text);
        List<JSONObject> messageList = new ArrayList<>(2);
        messageList.add(systemMessage);
        messageList.add(userMessage);
        JSONObject requestBody = JSONUtil.parseObj(source).putOpt("messages", messageList);
        System.out.println(requestBody.toString());
        ;
        String content = "{\"model\":\"gpt-3.5-turbo-1106\",\"temperature\":0,\"messages\":[{\"role\":\"system\",\"content\":\"You're a professional translator from Chinese to English.Translate into English except for HTML tags in the text\"},{\"role\":\"user\",\"content\":\"\"}]}";
        System.out.println("---------------------------------------");
        final JSONObject jsonObject = JSONUtil.parseObj(content);
        System.out.println(jsonObject);

    }


    public static String googleTransfer(String text) {
        String url = "https://translation.googleapis.com/language/translate/v2";
        Map<String, Object> map = new HashMap<>();
        map.put("q", text);
        map.put("target", "zh");
        map.put("format", "text");
        map.put("key", "AIzaSyCRjvN3nm2Gs83Uce4YW8Yu8o60iTelsMY");
        String body = HttpRequest.post(url).form(map).execute().body();
        JSONObject jsonObject = JSONUtil.parseObj(body);
        if (jsonObject.isEmpty()) {
            return "";
        }
        JSONObject data = jsonObject.getJSONObject("data");
        if (data.isEmpty()) {
            return "";
        }
        JSONArray jsonArray = data.getJSONArray("translations");
        if (null == jsonArray || jsonArray.isEmpty()) {
            return "";
        }
        Object object = jsonArray.get(0);
        if (null == object) {
            return "";
        }
        JSONObject translations = JSONUtil.parseObj(object);
        if (translations.isEmpty()) {
            return "";
        }
        String translatedText = translations.getStr("translatedText");
        System.out.println(translatedText);
        return translatedText;
    }

    public static String deepl(String source) {
        try {
            String url = "https://api-free.deepl.com/v2/translate";
            String authKey = "f3bf4882-58ac-50e1-5d7e-a5af8deee4b5:fx";  // Replace with your key
            String targetLang = "ZH";
            Map<String, Object> map = new HashMap<>(2);
            map.put("text", Arrays.asList(source));
            map.put("target_lang", targetLang);
            return HttpRequest.post(url).form(map)
                    .header("Authorization", String.format("DeepL-Auth-Key [%s]", authKey))
                    .header("Content-Type", "application/json").execute().body();
        } catch (Exception e) {
            System.out.println(e);
        }
        return "";
    }

    public void exportScanCodePage(HttpServletRequest request, HttpServletResponse response) {
        // 通过工具类创建writer，默认创建xls格式
        ExcelWriter writer = ExcelUtil.getWriter();
        List<String> rows = new ArrayList<>();
        rows.add("name");
        rows.add("age");
// 一次性写出内容，使用默认样式，强制输出标题
        writer.write(rows, true);
//out为OutputStream，需要写出到的目标流

//response为HttpServletResponse对象
        response.setContentType("application/vnd.ms-excel;charset=utf-8");
//test.xls是弹出下载对话框的文件名，不能为中文，中文请自行编码
        response.setHeader("Content-Disposition", "attachment;filename=test.xls");
        ServletOutputStream out = null;
        try {
            out = response.getOutputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        writer.flush(out, true);
// 关闭writer，释放内存
        writer.close();
//此处记得关闭输出Servlet流
        IoUtil.close(out);

    }

    /*    @Transactional(rollbackFor = Exception.class)
        public void transitionTest() {
            userRepository.insert(new UserVO(1L, "test", "12"));
            UserVO one = userRepository.getOne(1L);
            System.out.println(JSONUtil.toJsonStr(one));
            Thread thread = new Thread(() -> {
                UserVO two = userRepository.getOne(1L);
                System.err.println(JSONUtil.toJsonStr(two));
            });
            thread.start();
        }*/
    String content = "such as '12.34B', '234M', '92.2K'";
}
