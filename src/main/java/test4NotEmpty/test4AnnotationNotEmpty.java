//package test4NotEmpty;
//
//import com.google.common.collect.Lists;
//import lombok.Data;
//
//import javax.validation.Valid;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import java.util.List;
//import java.util.Objects;
//
///**
// * @author by woyuan  2022/8/29
// */
//public class test4AnnotationNotEmpty {
//
//    public static void main(String[] args) {
//        McmBusyPeriodResp resp = new McmBusyPeriodResp();
//        System.out.println(resp.getData());
//        Long ee = null;
//        if (Objects.isNull(ee)) {
//            System.out.println("ahhs");
//        }
//
//        System.out.println(resp);
//        List<McmBusyPeriodResp> resps = Lists.newArrayList();
//        resps.add(resp);
//        System.out.println(resps);
//    }
//
//
//
//    @Data
//    @Valid
//    public static class McmBusyPeriodResp {
//        public static final int SUCCESS_CODE = 0;
//        private Integer code;
//        private String message;
//        @NotNull
//        private Object data;
//    }
//}
