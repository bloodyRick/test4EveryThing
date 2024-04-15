import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author by woyuan  2024/3/23
 */

@EnableAsync
@EnableCaching
@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackageClasses = Test4NettyThread.Controller.class )
@EnableAspectJAutoProxy(exposeProxy = true)
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class, args);
    }
}
