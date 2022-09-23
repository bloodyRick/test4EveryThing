package Test4XMLJAVA;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2022/7/11
 */
public class xslx {
    public static void main(String[] args) throws IOException {
        //topic,misIds
        Map<String, String> topic_misIds = Maps.newHashMap();



        //appkey,bu
        Map<String, String> appkey_bu = Maps.newHashMap();
        //topic,misIds 不合格的
        Map<String, String> unqualified = Maps.newHashMap();
        //appkey，topic
        Map<String, String> topic_appkey = Maps.newHashMap();


        String path = "/Users/woyuan/Desktop/金融权限.xlsx";
        // 指定excel文件，创建缓存输入流
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

        // 直接传入输入流即可，此时excel就已经解析了
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // 选择要处理的sheet名称
        XSSFSheet sheet = workbook.getSheet("金融权限");


        for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
            if (rowNum == 0) { // 读取第一行（表头）
                XSSFRow head = sheet.getRow(rowNum);
                String headColumn_1 = head.getCell(0).getStringCellValue();
                String headColumn_2 = head.getCell(1).getStringCellValue();
                String headColumn_3 = head.getCell(2).getStringCellValue();
                String headColumn_4 = head.getCell(3).getStringCellValue();
                String headStr = String.format("%s\t%s\t%s\t%s", headColumn_1, headColumn_2, headColumn_3, headColumn_4);
                System.out.println(headStr);

            } else { // 非表头（注意读取的时候要注意单元格内数据的格式，要使用正确的读取方法）
                XSSFRow row = sheet.getRow(rowNum);
                String topic = row.getCell(0).getStringCellValue();
                String appkey = row.getCell(1).getStringCellValue();
                String mis_id = null;
                try{
                mis_id =  row.getCell(2).getStringCellValue();
                }
                catch(Exception e){
                    continue;
                }
                String user_name = row.getCell(3).getStringCellValue();
                String rowContent = String.format("%s\t%s\t%s\t%s", topic, appkey, mis_id, user_name);
//                System.out.println(rowContent);
                if (mis_id == null) {
                    continue;
                }

                if (topic_misIds.get(topic) == null) {
                    topic_misIds.put(topic, mis_id);
                } else {
                    String mis_ids = topic_misIds.get(topic);
                    mis_ids = mis_ids + "," + mis_id;
                    topic_misIds.put(topic, mis_ids);
                }
                topic_appkey.put(topic, appkey);

            }
        }
        //topic,misIds
        topic_misIds.forEach((k, v) -> {
            if (v.split(",").length>2) {
                unqualified.put(k, v);
            }
        });

//        System.out.println(topic_misIds);

        /**
         * ==============找appkey
         */
        String path1 = "/Users/woyuan/Desktop/topic统计.xlsx";
        // 指定excel文件，创建缓存输入流
        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(path1));
        // 直接传入输入流即可，此时excel就已经解析了
        XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream1);

        // 选择要处理的sheet名称
        XSSFSheet sheet1 = workbook1.getSheet("Sheet1");



        for (int rowNum = 0; rowNum < sheet1.getPhysicalNumberOfRows(); rowNum++) {
            if (rowNum == 0) { // 读取第一行（表头）
                XSSFRow head = sheet1.getRow(rowNum);
                String appkey = head.getCell(3).getStringCellValue();
                String bu = null;
                try{
                    bu = head.getCell(4).getStringCellValue();
                }
                catch(Exception e){
                    continue;
                }

            } else { // 非表头（注意读取的时候要注意单元格内数据的格式，要使用正确的读取方法）
                XSSFRow row = sheet1.getRow(rowNum);
                String appkey = null;
                String bu = null;
                try{
                    appkey=row.getCell(2).getStringCellValue();
                    bu = row.getCell(4).getStringCellValue();
                }
                catch(Exception e){
                    continue;
                }
                if (bu == null) {
                    continue;
                }
                //topic,misIds
                //appkey，bu
                //appkey,topic
                appkey_bu.put(appkey, bu);



            }
        }


//        //appkey,bu
//        Map<String, String> appkey_bu = Maps.newHashMap();
//        //topic,misIds 不合格的
//        Map<String, String> unqualified = Maps.newHashMap();
//        //topic，appkey
//        Map<String, String> topic_appkey = Maps.newHashMap();

/**
 * 处理不合格数据，按照<bu,list<topic,misids>>
 */
        Map<String, List<Map<String, Integer>>> result = Maps.newHashMap();
        unqualified.forEach((topic,mis_ids) -> {
            String appkey = topic_appkey.get(topic);
            String bu = appkey_bu.get(appkey);
            List<Map<String, Integer>> topic_mis_Ids = result.get(bu);
            if (CollectionUtils.isEmpty(topic_mis_Ids)) {
                Map<String, Integer> dd = Maps.newHashMap();
                dd.put(topic,mis_ids.split(",").length);
                result.put(bu, Lists.newArrayList(dd));
            }
            else {
                Map<String, Integer> dd = Maps.newHashMap();
                dd.put(topic,mis_ids.split(",").length);
                topic_mis_Ids.add(dd);
                result.put(bu, topic_mis_Ids);
            }
        });


//        List<Map<String, Integer>> ddd = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-核心研发组-信贷分期研发组");
        List<Map<String, Integer>> fff = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-经营研发组-获客创新研发组");
        List<Map<String, Integer>> eee = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-经营研发组");
        List<Map<String, Integer>> www = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-经营研发组-销售系统研发组");
        List<Map<String, Integer>> qqq = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-经营研发组-客户经营研发组");
        List<Map<String, Integer>> zzz = result.get("公司-美团-金融服务平台-技术平台部-联名卡研发组-金融云基础研发组-容器平台研发组");



        System.out.println("lion");




    }
}
