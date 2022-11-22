package IOstreamFIle.task5_3_question4;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class Solve {
    public static void main(String[] args) throws IOException {

        //OutputStream outputStream = System.out;
        Writer writer = new OutputStreamWriter(System.out, StandardCharsets.US_ASCII);
        writer.write('Ы');
        writer.flush();
        System.out.println();
    }
}
