package method;
//java is always pass by value!
public class pass_by_value {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        /*
        here change method only use the value of a, which is 10. It cannot affect the
        actual value of a.
         */
        System.out.println(a);
    }

    /*
    Note that "a" here is different from above, here
    it is a formal parameter, but "a" in the main method
    is an actual parameter
     */
    public static void change(int a){
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
