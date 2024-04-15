package Test4NettyThread;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by woyuan  2024/3/23
 */
@RestController
@RequestMapping("/test")
public class Controller {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public int getLimitEntranceConfig() {
        return 1;
    }
}
