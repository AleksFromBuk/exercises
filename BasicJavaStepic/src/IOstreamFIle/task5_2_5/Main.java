package IOstreamFIle.task5_2_5;

import java.io.IOException;

public class Main {

    public static void solve() throws IOException {
//        byte[] arr = {13, 13, 10};
//        ByteArrayInputStream inputStream = new ByteArrayInputStream(arr);
//        System.setIn(inputStream);
        int prev = 0, next = 0;
            prev = System.in.read();
            if(prev != -1) {
                while ((next = System.in.read()) > 0) {
                    if (!(next == 10 && prev == 13)) {
                        System.out.write(prev);
                    }
                    prev = next;
                    }
                System.out.write(prev);
            }
        System.out.flush();
    }
    public static void main(String[] args) throws IOException {
       solve();
    }
}
