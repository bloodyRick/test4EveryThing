package utilities;

import java.util.ArrayList;
import java.util.List;

public class HandMadeThreadPool {
    static List<Runnable> tasks = new ArrayList(16);


    public static <T> void submit(Runnable runnable) {
        if(tasks.size()<16) {
            tasks.add(runnable);
        }
    }

    static void run(){
        while (true) {
            tasks.forEach(r-> new Thread(r).start());
        }
    }

}
