package TrueTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TrueTest {
    static {
        try {
            Field trueField = Boolean.class.getDeclaredField("TRUE");
            trueField.setAccessible(true);

            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(trueField, trueField.getModifiers() & ~Modifier.FINAL);

            trueField.set(null, false);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Boolean bool = null;
        Boolean reality = true;
        while (true) {
            if(reality) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            Thread.sleep(10000L);
        }

    }
}
