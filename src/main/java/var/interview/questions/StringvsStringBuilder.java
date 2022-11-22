package var.interview.questions;

public class StringvsStringBuilder {
    public static void main(String[] args) {
        String str = "Hello";
        String tmp = str.toUpperCase().concat(" World! ").trim()
                .replace("World", "Программирования");

        System.out.println(tmp);
        System.out.println(str);
        // 1. string неизменяемый объект
        // 2. метод trim обрезает пробелы с левого и правого краёв

        //----------- StringBuilder -----------------
        StringBuilder sb = new StringBuilder("Hello");

        //sb.append(" World").replace(6, 11, "Програмания")
        //        .reverse();
        sb.append(" World");
        System.out.println(sb.length());
        for(int i = 0; i < sb.length(); i++) {
            System.out.println(sb.charAt(i));
        }
        System.out.println(sb);

    }
}
