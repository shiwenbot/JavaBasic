package method;

public class sumN {
    public static void main(String[] args) {
        //return the summation for numbers from 1 to n
        System.out.println(sum(10));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
