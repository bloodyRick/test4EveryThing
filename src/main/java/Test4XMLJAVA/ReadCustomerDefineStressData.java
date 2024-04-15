package Test4XMLJAVA;

import lombok.Data;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.Future;

/**
 * @author by woyuan  2023/11/28
 */
public class ReadCustomerDefineStressData {
    public static void main(String[] args) throws IOException {
        // select * from XXX where
        // (appkey = 'com.sankuai.pay.trade.tiedsale' and interface_nmae = 'ITiedSaleThrift.splitAccountCallback')
        // or (appkey = 'com.sankuai.pay.trade.tiedsale' and interface_nmae = 'ITiedSaleThrift.splitAccountCallback')
        StringBuilder sb = new StringBuilder();
        String PATH = "/Volumes/文枢工作空间/";
        //获取文件流
        FileInputStream inputStream = new FileInputStream(PATH + "用户自定义压测数据.xlsx");

        //1.创建工作簿,使用excel能操作的这边都看看操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2.得到表
        Sheet sheet = workbook.getSheetAt(0);


        //3.得到行
        for (int i = 1; i < 173; i++) {
            Row row = sheet.getRow(i);
            String appkey   = getStringValue(row.getCell(1));
            String interfaceName   = getStringValue(row.getCell(2));
            sb.append("(");
            sb.append("appkey = \'");
            sb.append(appkey);
            sb.append("\'");
            sb.append(" ");
            sb.append("and interface_name = \'");
            sb.append(interfaceName);
            sb.append("\'");
            sb.append(")");
            sb.append(" or ");
        }
        sb.append(")");
    }


    @Data
    public static class Info {
        String appkey;
        String interfaceName;

    }
    public static String getStringValue(Cell cell) {
        //匹配类型数据
        if (cell != null) {
            CellType cellType = cell.getCellType();
            String cellValue = "";
            switch (cellType) {
                case STRING: //字符串
                    cellValue = cell.getStringCellValue();
                    return cellValue;

//                case BOOLEAN: //布尔类型
//                    cellValue = String.valueOf(cell.getBooleanCellValue());
//                    break;
//                case BLANK: //空
//                    break;
//                case NUMERIC: //数字（日期、普通数字）
//                    if (HSSFDateUtil.isCellDateFormatted(cell)) { //日期
//                        System.out.print("[日期]");
//                        Date date = cell.getDateCellValue();
//                        cellValue = "2022-07-11";
//                    } else {
//                        //不是日期格式，防止数字过长
//                        cell.setCellType(CellType.STRING);
//                        cellValue = cell.toString();
//                    }
//                    break;
//                case ERROR:
//                    System.out.print("[数据类型错误]");
//                    break;
            }
        }
        return null;
    }
}
