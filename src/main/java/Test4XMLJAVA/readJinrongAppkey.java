package Test4XMLJAVA;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2023/2/1
 */
public class readJinrongAppkey {

    public static void main(String[] args) throws IOException {
        //appkey,orgNamePath
        Map<String, String> appkeyOrgNamePath = Maps.newHashMap();
        //appkey,language
        Map<String, String> appkeyLanguage = Maps.newHashMap();
        //appkey，prod
        Map<String, String> appkeyIsProd = Maps.newHashMap();


        String path = "/Volumes/文枢工作空间/金服有效appkey-20230131.xlsx";
        // 指定excel文件，创建缓存输入流
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(path));

        // 直接传入输入流即可，此时excel就已经解析了
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // 选择要处理的sheet名称
        XSSFSheet sheet = workbook.getSheetAt(0);


        for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
            if (rowNum == 0) { // 读取第一行（表头）
                XSSFRow head = sheet.getRow(rowNum);
                String headColumn_1 = head.getCell(0).getStringCellValue();
                String headColumn_2 = head.getCell(4).getStringCellValue();
                String headColumn_3 = head.getCell(6).getStringCellValue();
                String headColumn_4 = head.getCell(7).getStringCellValue();
                String headStr = String.format("%s\t%s\t%s\t%s", headColumn_1, headColumn_2, headColumn_3, headColumn_4);
                System.out.println(headStr);

            } else { // 非表头（注意读取的时候要注意单元格内数据的格式，要使用正确的读取方法）
                XSSFRow row = sheet.getRow(rowNum);
                String appkey = row.getCell(0).getStringCellValue();
                String orgNamePath = row.getCell(4).getStringCellValue();
                String language = null;
                try {
                    language = row.getCell(6).getStringCellValue();
                } catch (Exception e) {
                    continue;
                }


                Double isProdMachine = row.getCell(7).getNumericCellValue();
                appkeyOrgNamePath.put(appkey, orgNamePath);
                appkeyLanguage.put(appkey, language);
                appkeyIsProd.put(appkey, Double.toString(isProdMachine));
            }
        }


        // 过滤前端组织
        List<String> appkeysNoFront = appkeyOrgNamePath.entrySet().stream().filter(e -> !e.getValue().contains("前端")).map(e -> e.getKey()).collect(Collectors.toList());

        // 过滤非Java语言
        List<String> appkeysJava = appkeyLanguage.entrySet().stream().filter(e -> StringUtils.equals(e.getValue(), "Java")).map(e -> e.getKey()).collect(Collectors.toList());

        // 过滤生产环境没有机器的
        List<String> appkeysProd = appkeyIsProd.entrySet().stream().filter(e -> StringUtils.equals(e.getValue(), "1.0")).map(e -> e.getKey()).collect(Collectors.toList());

        appkeysNoFront.retainAll(appkeysJava);
        appkeysNoFront.retainAll(appkeysProd);


        // appkeysNoFront是金服符合要求的appkeys
        System.out.println();


        // 处理前哨已经接入的appkey
        List<String> appkeysQianshao = Lists.newArrayList();
        String path1 = "/Volumes/文枢工作空间/前哨已经接入的appkey.xlsx";
        // 指定excel文件，创建缓存输入流
        BufferedInputStream inputStream1 = new BufferedInputStream(new FileInputStream(path1));

        // 直接传入输入流即可，此时excel就已经解析了
        XSSFWorkbook workbook1 = new XSSFWorkbook(inputStream1);

        // 选择要处理的sheet名称
        XSSFSheet sheet1 = workbook1.getSheetAt(0);

        for (int rowNum = 0; rowNum < sheet1.getPhysicalNumberOfRows(); rowNum++) {
            if (rowNum == 0) { // 读取第一行（表头）

            }else {
                XSSFRow row = sheet1.getRow(rowNum);
                String appkey = row.getCell(1).getStringCellValue();
                appkeysQianshao.add(appkey);
            }
        }

        System.out.println();

        appkeysNoFront.removeAll(appkeysQianshao);

        System.out.println();


        StringBuilder curlStr = new StringBuilder();
        curlStr.append("curl -H \"Content-type: application/json\" -X POST -d '[");

        appkeysNoFront.forEach(e->{
            curlStr.append("{\"appkey\":");
            curlStr.append("\"");
            curlStr.append(e);
            curlStr.append("\"");
            curlStr.append(",");
            curlStr.append("\"misId\":\"woyuan\"},");

        });

        System.out.println(curlStr);
    }
}
