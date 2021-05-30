package lab5.hust.soict.hedspi.garbage;

import java.util.Random;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        Random r = new Random(123);
        long start = System.currentTimeMillis();

        String s = "";

        for (int i = 0;i < 65536;i++)
            s += r.nextInt(2);

        System.out.println(System.currentTimeMillis() - start);

        r = new Random(123);
        start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder();
        for (int i = 0 ;i < 65536;i++)
            builder.append(r.nextInt(2));
        s = builder.toString();

        System.out.println(System.currentTimeMillis() - start);

    }
}
