package method;

import java.util.Scanner;

public class oddNumber {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //if input is odd number, return well done!
        odd(n);
    }

    public static void odd(int n){
        if(n%2!=0) System.out.println("Well done!");
        else System.out.println("Unlucky!");
    }
}
