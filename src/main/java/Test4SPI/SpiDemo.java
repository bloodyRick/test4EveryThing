package Test4SPI;

import java.util.ServiceLoader;

/**
 * @author by woyuan  2023/3/21
 */

public class SpiDemo {

    public static void main(String[] args) {
        ServiceLoader<DataStorage> serviceLoader = ServiceLoader.load(DataStorage.class);
        System.out.println("============ Java SPI 测试============");
        serviceLoader.forEach(loader -> System.out.println(loader.search("Yes Or No")));
    }

}
