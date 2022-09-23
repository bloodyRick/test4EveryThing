package utilities;

import com.sun.org.apache.xml.internal.serializer.ToUnknownStream;
import javafx.scene.input.TouchEvent;

import javax.xml.bind.SchemaOutputResolver;

public class Test4Function {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;

        } catch (Exception e) {
            e.printStackTrace();

        }
        System.out.println("after");
    }

    public static final Parser PARSER = setId->{
        return 1;
    };

    interface Parser{
        Integer parse(int x);
    }
//    public static final Integer FFD = set -> {return -2;};
}
