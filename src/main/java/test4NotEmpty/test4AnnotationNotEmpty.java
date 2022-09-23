package test4NotEmpty;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * @author by woyuan  2022/8/29
 */
public class test4AnnotationNotEmpty {

    public static void main(String[] args) {
        McmBusyPeriodResp resp = new McmBusyPeriodResp();
        System.out.println(resp.getData());
        Long ee = null;
        if (Objects.isNull(ee)) {
            System.out.println("ahhs");
        }
    }



    @Data
    @Valid
    public static class McmBusyPeriodResp {
        public static final int SUCCESS_CODE = 0;
        private Integer code;
        private String message;
        @NotNull
        private Object data;
    }
}
