public class Task2_1 {


       /* System.out.println("Таблица истинности ^");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);*/
        public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
            return
                    a == b && a == true &&  (!(c^d) && c == false) ||
                            a == c && a == true &&  (!(b^d) && b == false) ||
                            a == d && a == true &&  (!(c^b) && b == false) ||
                            b == c && b == true &&  (!(a^d) && d == false) ||
                            b == d && d == true &&  (!(c^a) && a == false) ||
                            c == d && d == true &&  (!(b^a) && a == false);
        }

    public static void main(String[] args) {
     System.out.println(Task2_1.booleanExpression(false, false, true, false));
    }
}
