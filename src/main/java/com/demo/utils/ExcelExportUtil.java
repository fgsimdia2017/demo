package com.demo.utils;

import cn.hutool.core.io.IoUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @Author huangfeng
 * @Date 2023/11/1 16:13
 * @description
 * @Version 1.0
 */
@Slf4j
public class ExcelExportUtil {
    public static void export(HttpServletResponse response, List rows, Map<String, String> head, String sheetName) {
        ServletOutputStream out = null;
        try {
            ExcelWriter writer = ExcelUtil.getWriter(true);
            Sheet sheet = writer.getSheet();
            //自定义标题别名
            for (Map.Entry<String, String> entry : head.entrySet()) {
                writer.addHeaderAlias(entry.getKey(), entry.getValue());
            }
            // 默认的，未添加alias的属性也会写出，如果想只写出加了别名的字段，可以调用此方法排除之
            writer.setOnlyAlias(true);
            writer.renameSheet(sheetName);
            writer.write(rows, true);
            // 设置所有列为自动宽度，不考虑合并单元格
            setSizeColumn(sheet, head.size());
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="
                    + java.net.URLEncoder.encode(sheetName, "UTF-8") + ".xlsx");
            out = response.getOutputStream();
            writer.flush(out, true);
            writer.close();
            IoUtil.close(out);
        } catch (IOException e) {
            log.error("数据导出异常", e);
        } finally {
            IoUtil.close(out);
        }
    }

    public static void setSizeColumn(Sheet sheet, int size) {
        for (int columnNum = 0; columnNum <= size; columnNum++) {
            int columnWidth = sheet.getColumnWidth(columnNum) / 256;
            for (int rowNum = 0; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row currentRow;
                //当前行未被使用过
                if (sheet.getRow(rowNum) == null) {
                    currentRow = sheet.createRow(rowNum);
                } else {
                    currentRow = sheet.getRow(rowNum);
                }

                if (currentRow.getCell(columnNum) != null) {
                    Cell currentCell = currentRow.getCell(columnNum);
                    int cellType = currentCell.getCellType().getCode();
                    int code = CellType.STRING.getCode();
                    if (cellType == code) {
                        int length = currentCell.getStringCellValue().getBytes().length;
                        if (columnWidth < length) {
                            columnWidth = length;
                        }
                    }
                }
            }
            sheet.setColumnWidth(columnNum, columnWidth * 256);
        }
    }

}
