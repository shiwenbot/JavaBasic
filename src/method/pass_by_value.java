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
        System.out.println("------------------------------------");
        /*
        In this case, array[1] will change because it pass the address, and
        the array in that address is changed by "change" method
         */
        int[] array = new int[]{1,2,3};
        change(array);
        System.out.println(array[1]);
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

    public static void  change(int[] array){
        System.out.println(array[1]);
        array[1] = 10;
        System.out.println(array[1]);
    }
}
