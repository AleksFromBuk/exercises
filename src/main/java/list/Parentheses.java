package list;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1. Открытые и закрытые скобки
 * Реализовать метод проверки корректности открытых и закрытых скобок.
 *
 * Например, ()(()((()))) - true, ()) - false
 */

public class Parentheses {
    public static boolean valid(char[] data) {
        List<Character> values = IntStream.range(0, data.length)
                .mapToObj(i -> data[i])
                .collect(Collectors.toList());

        Stack<Character> stack = new Stack();

        stack.push(values.get(0));

       boolean ans = true;
        for (int i = 1; i < values.size() ; i++)  {
            if (values.get(i) == ')' && stack.peek() != '(')  {
                ans = false;
                break;
            }
            else if (values.get(i) == ')' && stack.peek() == '(') stack.pop();
            else if (values.get(i) == '(') stack.push(values.get(i));
        }
        if(!stack.empty()) ans = false;
        return ans;
    }
}
