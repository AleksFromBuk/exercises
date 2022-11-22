package list;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        char arr[] = s.toCharArray();
        List<String> tmp = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            tmp.add(String.valueOf(arr[i]));
        }
        tmp.sort(String::compareTo);
        StringBuilder ans = new StringBuilder();
        for(String it : tmp) {
            ans.append(new StringBuilder (it));
        }
        return new String(ans);
    }
}
