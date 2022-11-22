package IOstreamFIle.task5_3_question3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Solve {
    public static void main(String[] args) throws IOException {

        // 1ый варинат решения
//        while (true) {
//            int tmp = System.in.read();
//            System.out.println(tmp);
//        }

        //2ой вариант решения
        Charset charset = StandardCharsets.UTF_8;
        byte [] b = "Ы".getBytes(charset);
        int [] result = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            result [i] = Byte.toUnsignedInt(b [i]);
        }
        System.out.print(java.util.Arrays.toString(result));
    }
}
