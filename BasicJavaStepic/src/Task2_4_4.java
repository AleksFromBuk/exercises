import java.util.*;

public class Task2_4_4 {

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] ans = new int[a1.length + a2.length];
        for(int i = 0, i1 = 0, i2 = 0; i < a1.length
                + a2.length; i++) {
            if(i1 == a1.length) {
                for(int k = i2; k < a2.length; k++) {
                    ans[i++] = a2[i2++];
                }
                break;
            }
            if(i2 == a2.length) {
                for(int k = i1; k < a1.length;k++) {
                    ans[i++] = a1[i1++];
                }
                break;
            }
            if(a1[i1] > a2[i2]) {
                ans[i] = a2[i2++];
            }
            else {
                ans[i] = a1[i1++];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2, 3}, new int[]{-1, 1, 3, 4})));
       // System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2, 2}, new int[]{1, 3})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{0, 2}, new int[]{1, 2, 3, 6, 7, 8})));


    }
}
