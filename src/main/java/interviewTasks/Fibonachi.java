package interviewTasks;

public class Fibonachi {
    public static void printFibonacci(long n){

        long first = 0, second = 1;
        long ans = first + second;
//        if(n == 0) {
//            System.out.println(first);
//            return;
//        }
//        if (n == 1) {
//            System.out.println(second);
//            return;
//        }
        for (long i = 0; i < n; i++) {
            ans = first + second;
            first = second;
            second = ans;
        }
        System.out.println(first);
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 12; i++) {
            Fibonachi.printFibonacci(i);
        }

    }
}
