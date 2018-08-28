package com.abcdpower.riskcontrol.zxjt.Utils;


import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExportExcelUtil {

    private static Logger logger = LoggerFactory.getLogger(ExportExcelUtil.class);


    /**
     * 测试导出
     * @param args
     */
    public static void main(String[] args) {
        String path = "e://demo.xlsx";
        List<String> name =new ArrayList<>();
        name.add("sheet");
        name.add("sheet1");
        List<String> title = new ArrayList();
        title.add("id");
        title.add("name");
        title.add("age");
        List<String> title1 = new ArrayList();
        title1.add("id");
        title1.add("name");
        List<List<String>> titles=new ArrayList<List<String>>();
        titles.add(title);
        titles.add(title1);
        List<Map<String, Object>> value = new ArrayList();
        List<Map<String, Object>> value1 = new ArrayList();
        List<List<Map<String, Object>>> values=new ArrayList<List<Map<String, Object>>>();
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap();
            map.put("id", i + 1D);
            map.put("name", "test_" + i);
            map.put("age", i * 1.5);
            value.add(map);
        }
        values.add(value);
        for (int i = 0; i < 10; i++) {
            Map<String, Object> map = new HashMap();
            map.put("id", i + 1D);
            map.put("name", "test_" + i);
            value1.add(map);
        }
        values.add(value1);

        System.out.println(writerExcel(path, "xlsx", name, titles, values));
    }

    /**
     * 2007数据写入Excel文件
     ** @param style  Excel类型
     * @param path   文件路径，包含文件全名，例如：D://file//demo.xls
     * @param name   sheet名称集合
     * @param titles 行标题列 集合
     * @param values 数据集合，key为标题，value为数据  集合
     * @return True\False
     */
    public static boolean writerExcel(String path, String style, List<String> name, List<List<String>> titles, List<List<Map<String, Object>>> values) {
        logger.info("path : {}", path);
        return generateWorkbook(path, name, style, titles, values);
    }

    /**
     * 将数据写入指定path下的Excel文件中
     *
     * @param path   文件存储路径
     * @param name   sheet名字集合
     * @param style  Excel类型
     * @param titles 标题串集合
     * @param values 内容集集合
     * @return True\False
     */
    private static boolean generateWorkbook(String path, List<String> name, String style,List<List<String>>  titles, List<List<Map<String, Object>>> values) {
        logger.info("file style : {}", style);
        Workbook workbook;
        if ("XLS".equals(style.toUpperCase())) {
            workbook = new HSSFWorkbook();
        } else {
            workbook = new XSSFWorkbook();
        }
        // 生成一个表格
        Sheet sheet;
        for (int j=0;j<name.size();j++){
            if (null == name || "".equals(name)) {
                sheet = workbook.createSheet(); // name 为空则使用默认值
            } else {
                sheet = workbook.createSheet(name.get(j));
            }
            // 设置表格默认列宽度为15个字节
            sheet.setDefaultColumnWidth((short) 15);
            // 生成样式
            Map<String, CellStyle> styles = createStyles(workbook);
            //创建标题
            Row row = sheet.createRow(0);
            // 存储标题在Excel文件中的序号
            Map<String, Integer> titleOrder = new HashMap();
            for (int i = 0; i < titles.get(j).size(); i++) {
                Cell cell = row.createCell(i);
                cell.setCellStyle(styles.get("header"));
                String title = titles.get(j).get(i);
                cell.setCellValue(title);
                titleOrder.put(title, i);
            }
        /*
         * 写入正文
         */
            Iterator<Map<String, Object>> iterator = values.get(j).iterator();
            int index = 0; // 行号
            while (iterator.hasNext()) {
                index++; // 出去标题行，从第一行开始写
                row = sheet.createRow(index);
                Map<String, Object> value = iterator.next();
                for (Map.Entry<String, Object> map : value.entrySet()) {
                    // 获取列名
                    String title = map.getKey();
                    // 根据列名获取序号
                    int i = titleOrder.get(title);
                    // 在指定序号处创建cell
                    Cell cell = row.createCell(i);
                    // 设置cell的样式
                    if (index % 2 == 1) {
                        cell.setCellStyle(styles.get("cellA"));
                    } else {
                        cell.setCellStyle(styles.get("cellB"));
                    }
                    // 获取列的值
                    Object object = map.getValue();
                    // 判断object的类型
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    if (object instanceof Double) {
                        cell.setCellValue((Double) object);
                    } else if (object instanceof Date) {
                        String time = simpleDateFormat.format((Date) object);
                        cell.setCellValue(time);
                    } else if (object instanceof Calendar || object instanceof Date) {
                        Calendar calendar = (Calendar) object;
                        String time = simpleDateFormat.format(calendar.getTime());
                        cell.setCellValue(time);
                    } else if (object instanceof Boolean) {
                        cell.setCellValue((Boolean) object);
                    } else if (object instanceof String) {
                        cell.setCellValue(object.toString());
                    } else {
                        cell.setCellValue(object==null?"":object+"");
                    }
                }
            }
        }


        /*
         * 写入到文件中
         */
        boolean isCorrect = false;
        try {
            File file = new File(path);
            OutputStream outputStream = new FileOutputStream(file);
            workbook.write(outputStream);
            outputStream.close();
            isCorrect = true;
        } catch (IOException e) {
            isCorrect = false;
            logger.error("write Excel file error : {}", e.getMessage());
        }
        try {
            workbook.close();
        } catch (IOException e) {
            isCorrect = false;
            logger.error("workbook closed error : {}", e.getMessage());
        }
        return isCorrect;
    }


    /**
     * excle样式
     * @param wb
     * @return
     */
    private static Map<String, CellStyle> createStyles(Workbook wb) {
        Map<String, CellStyle> styles = new HashMap();
        // 标题样式
        CellStyle titleStyle = wb.createCellStyle();
        titleStyle.setAlignment(HorizontalAlignment.CENTER); // 水平对齐
        titleStyle.setVerticalAlignment(VerticalAlignment.CENTER); // 垂直对齐
        titleStyle.setLocked(true); // 样式锁定
        titleStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        Font titleFont = wb.createFont();
        titleFont.setFontHeightInPoints((short) 12);
        titleFont.setBold(true);
        titleFont.setFontName("微软雅黑");
        titleStyle.setFont(titleFont);
        styles.put("title", titleStyle);
        return styles;
    }





}
