package basic;

public class conditional_operator {
    public static void main(String[] args) {
        /*
        print an array, such as {1,2,3},
        use conditional operator to deal with the ","
         */
        int[] array = new int[]{1,2,3,4,5};
        Arrayprinter(array);
    }

    public static void Arrayprinter(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            //if the condition satisfies, print without ","
            System.out.print(i == array.length - 1 ? array[i] : array[i] + ",");
        }
        System.out.println("]");
    }
}
