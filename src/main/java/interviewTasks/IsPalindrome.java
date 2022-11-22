package interviewTasks;

import java.util.HashSet;
import java.util.Set;

public class IsPalindrome {
    public static void checkPalindrom(String s){
        try{
            s = s.toLowerCase();
        }
        catch (NullPointerException exc) {
            System.out.println("no");
            return;
        }

        StringBuilder tmp = new StringBuilder();
        Set<Character> stop = new HashSet<>();
        //!.,;:?\\-
        //stop.add('’');
        stop.add('\u0020');
        stop.add('!');
        stop.add('\'');
         stop.add('?');
         stop.add(',');
         stop.add(';');
         stop.add('-');
         stop.add(':');
         stop.add('.');
        for(int i = 0; i < s.length(); i++) {
            if(!stop.contains(s.charAt(i))) {
               tmp.append(s.charAt(i));
            }
        }
        if(tmp.length() == 0) {
            System.out.println("no");
            return;
        }
        for(int i = 0; i < tmp.length()/2; i++) {
            if(tmp.charAt(i) != tmp.charAt(tmp.length() - 1 - i)) {
                System.out.println("no");
                System.out.println(tmp);
                return;
            }
        }
        System.out.println("yes");
        return;
    }

    public static void main(String[] args) {
        //String test = null;
        //System.out.println(test.toLowerCase());
        IsPalindrome.checkPalindrom("Madam i’m Adam");
        IsPalindrome.checkPalindrom("Olson in Oslo");
        IsPalindrome.checkPalindrom("");
        IsPalindrome.checkPalindrom("     '''''    ");
        IsPalindrome.checkPalindrom(null);

    }


}
