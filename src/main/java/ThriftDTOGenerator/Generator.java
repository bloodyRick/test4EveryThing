package ThriftDTOGenerator;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author by woyuan  2022/6/29
 */
public class Generator {
    public static void main(String[] args) {
        String input = "" +
//                "private String sKey;\n" +
//                "\n" +
//                "    private String eventId;\n" +
//                "\n" +
//                "    // 如果紧急变更，直接放行\n" +
//                "    private Boolean isEmergency;\n" +
//                "\n" +
                "    private Map<String, Map<String, String>> context;\n" +
                "\n" +
                "    private String callBackAppName;\n" +
                "\n" +
                "    private int callBackPort;\n" +
                "\n" +
                "    private int intervalTime;\n" +
                "\n" +
                "    private int intervalCount;";

        String lines[] = input.split("\\r?\\n");

        List<String> lineList = Arrays.asList(lines);

        List<String> filterNoteAndBlankLines = lineList.stream().filter(e-> StringUtils.isNotBlank(e)).filter(e->!e.startsWith("    //")).collect(Collectors.toList());

        int index = 0;
        StringBuilder result = new StringBuilder();
        for (String line : filterNoteAndBlankLines) {

            String[] symbols = line.split(("\\s+"));
            String type = symbols[2];
            String varName = symbols[3];

            index++;
            StringBuilder sb = new StringBuilder();

            String line1Fmt = "@ThriftField(value = %s, requiredness = ThriftField.Requiredness.REQUIRED)";
            String line1 = String.format(line1Fmt, index);
            sb.append(line1);
            sb.append("\n");
            sb.append("public ");
            sb.append(type + " ");
            sb.append("get" + varName.substring(0,varName.length()-1) + "()");
            sb.append("{ return "+ varName.substring(0,varName.length()-1) +" };");
            sb.append("\n");
//            char lowerCase = sb.substring(3, 4).toUpperCase();
            result.append(sb);



        }


        System.out.println(result);

    }
}
