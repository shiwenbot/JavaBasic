package basic;

public class VariableDemo1 {
    public static void main(String[] args) {
        //data type + variable name = initial value
        double money = 6.0;
        System.out.println(money);

        //change money value, read it from right to left
        money = money + 4.0;
        System.out.println(money);
        System.out.println("------------------");

        //narrow data type casting
        int a = 10;
        byte b = (byte)a;
        System.out.println(a);
        System.out.println(b);
    }
}
