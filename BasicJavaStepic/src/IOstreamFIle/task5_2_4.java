package IOstreamFIle;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class task5_2_4 {
    public static void main(String[] args) throws IOException {
        InputStream in = getStream (new byte[] { 0x33, 0x45, 0x01});
        System.out.println(sum(in));
    }

    public static InputStream getStream(byte[] data) {
        return new ByteArrayInputStream(data);
    }
    public static int sum(InputStream in) throws IOException {
        int total = in.read();
        int tmp = 0;
        if(total != -1) {
            while ((tmp = in.read()) != -1) {
                total = Integer.rotateLeft(total, 1) ^ tmp;
            }
            return total;
        } else
            return 0;
    }
}
