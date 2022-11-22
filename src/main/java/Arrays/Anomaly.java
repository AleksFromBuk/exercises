package Arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        int l = 0, r = l;
        for (int i = 0; i < data.length; i++) {
            if(data[i] <= down || data[i] >= up) {
                r = l = i;
                count++;

                for(int j = i + 1; j < data.length; j++) {
                    if(data[j] <= down || data[j] >= up) {
                        i = j;
                        r++;
                    }
                    else {
                        break;
                    }
                }
                result[count - 1] = new int[] {l, r};
            }
        }
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int num = 0;
        //int tmp = 0;
        for(int i = 0; i < 100; i++) {
            //tmp = num++;
            num = (num++);
        }
        System.out.println(num);
    }
}

