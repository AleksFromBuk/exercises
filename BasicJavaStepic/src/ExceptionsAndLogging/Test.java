package ExceptionsAndLogging;


public class Test {
    public static void main(String[] args) {
//        System.out.println(getCallerClassAndMethodName());
//        System.out.println("\n");
//        anotherMethod();
//        int[] a = new int [10];
//        for (int i = 0; i < 10; i++)
//            a[i] = 9 - i;
//        System.out.println("\n");
//        for(int i = 0; i < 10; i++)
//            System.out.println(a[i]);
//        System.out.println("\n");
//
//        for (int i = 0; i < 10; i++) {
//            String ln = System.lineSeparator();
//            System.out.println("a[i] = " + a[i]
//                    + ln
//                    + "a[a[i]] = " + a[a[i]]
//                    + ln);
//            a[i] = a[a[i]];
//        }
//        for(int i = 0; i < 10; i++)
//            System.out.println(a[i]);
//        System.out.println("\n");
        System.out.println(getCallerClassAndMethodName());
        m1();
    }
            static void m1() {
                System.out.println(getCallerClassAndMethodName());
                m2();    }

            static void m2() {
                System.out.println(getCallerClassAndMethodName());
                m3();    }

            static void m3() {
                System.out.println(getCallerClassAndMethodName());    }
//
//
//
    private static void anotherMethod() {
        anotherMethod1();
    }

    private static void anotherMethod1() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] ans = Thread.currentThread().getStackTrace();

        if(ans.length <= 3 ) {
            return null;
        } else {
            return ans[3].getClassName() + '#' + ans[3].getMethodName();
        }
    }
}

