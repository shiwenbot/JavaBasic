public class StringAPI {
    public static void main(String[] args) {
        String name = "China";
        System.out.println(name.length());//获取字符长度

        //获取某一位置的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.println("-----------------------------");

        char[] chars = name.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);
        }

        //subString
        String name2 = "UnitedKingdom";
        String ns = name2.substring(0,6);
        System.out.println(ns);

        //replace

    }
}
