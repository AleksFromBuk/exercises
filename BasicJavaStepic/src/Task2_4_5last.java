public class Task2_4_5last {
   // public static String printTextPerRole(String[] roles, String[] text) {

//        StringBuilder stbl = new StringBuilder();
//        for (String s : roles) {
//            stbl.append(s + ":" + "\n");
//            System.out.println(s);
//            for (int j = 0; j < text.length; j++) {
//                if (text[j].startsWith(s + ":")) {
//                    System.out.println(s);
//                     System.out.println(text[j].substring(s.length() + 1));
//                    stbl.append(j + 1 + ")").append(text[j].substring(s.length() + 1))
//                            .append("\n");
//                }
//            }
//            stbl.append("\n");
//        }
//        return stbl.toString();
//    }
        public static String printTextPerRole(String[] roles, String[] textLines) {
            StringBuilder answer = new StringBuilder();
            for (String role : roles) {
                answer.append(role + ":\n");
                for (int i = 0; i < textLines.length; i++) {
                    if (textLines[i].startsWith(role + ":")) {
                        System.out.println(role);
                        System.out.println(textLines[i].substring(role.length() + 1));
                        answer.append((i+1) + ")" + textLines[i].substring(role.length() + 1) + "\n");
                    }
                }
                answer.append("\n");
            }
            return answer.toString();
        }

    static String [] roles = {
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"};
    static String [] text = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };

    public static void main(String[] args) {
        System.out.println(printTextPerRole(roles,text));
    }
}
