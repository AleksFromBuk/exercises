package IOstreamFIle.task5_3_question5;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Solve {

    public static String readAsString(InputStream input, Charset charset)
            throws IOException {
        Reader reader = new InputStreamReader(input, charset);
        int tmp;
        String ans = "";
        while( (tmp =  reader.read()) != -1 ) {
            ans += (char) tmp;
        }
        return ans;
        //-------------------- 2-ой вариант решения --------------------------
//        int in;
//        Reader reader = new InputStreamReader(inputStream, charset);
//        StringBuilder sb = new StringBuilder();
//        while ((in = reader.read()) != -1){
//
//            sb.append((char)in);
//        }
//        return sb.toString();
        //-------------------- 3-ий варинат решения ---------------------------
//        InputStreamReader reader = new InputStreamReader(inputStream, charset);
//        StringWriter writer = new StringWriter();
//        int inputByte;
//        while ((inputByte = reader.read()) != -1) {
//            writer.write(inputByte);
//        }
//        return writer.toString();

        //-------------------- 4-ый варинат решения ---------------------------
//        return writer.toString();
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        int block;
//        while ((block = inputStream.read()) != -1) {
//            outputStream.write(block);
//        }
//        return new String(outputStream.toByteArray(), charset)
    }

    public static void main(String[] args) {
        byte arr[] = new byte[] {48, 49, 50, 51};
        InputStream input = new ByteArrayInputStream(arr);
        System.setIn(input);
        Charset charset = StandardCharsets.US_ASCII;
        try {
            System.out.println(readAsString(input, charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
