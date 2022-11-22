package IOstreamFIle.task5_3_question6;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double ans = 0;
        String data = null, tmp = null;
        Scanner scan = new Scanner(System.in);
        Scanner nextScan = null;
        Reader read = null;
        while(scan.hasNextLine()) {
            data = scan.nextLine();
            read = new StringReader(data);
            nextScan = new Scanner(read).useDelimiter("\\s");
            while(nextScan.hasNext()) {
                tmp = nextScan.next();
                try {
                    ans += Double.parseDouble(tmp);
                } catch (Exception exc) {

                }
            }
        }
        nextScan.close();
        read.close();
        System.out.printf(Locale.ENGLISH, "%.6f", ans);
    }
}
// другие варианты решений:
// ------------------- №1 ----------------------------

//import java.io.*;
//        import java.util.Locale;
//        import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//        Scanner s = new Scanner(System.in);
//        s.useLocale(Locale.ENGLISH);
//        Double res = sumReadNumbers(s);
//        System.out.printf("%.6f", res);
//    }
//
//    public static Double sumReadNumbers (Scanner scanner) {
//        Double d;
//        Double sum = Double.valueOf(0);
//        while (scanner.hasNext()) {
//            try {
//                d = Double.parseDouble(scanner.next());
//                sum += d;
//                if (!(scanner.hasNext())) break;
//            }
//            catch (NumberFormatException ex) {
//                continue;
//            }
//        }
//        return sum;
//    }
//}

// ------------------- №2 -------------------------

//import java.io.*;
//        import java.util.Locale;
//        import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        double sum = 0.0;
//        while (scanner.hasNext()) {
//            if (scanner.hasNextDouble()) {
//                sum += scanner.nextDouble();
//            } else {
//                scanner.next();
//            }
//        }
//        System.out.printf(Locale.ENGLISH, "%.6f", sum);
//    }
//}

