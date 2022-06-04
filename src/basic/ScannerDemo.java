package basic;
/*
learn how to use api, code that has been aleady writtened by
others so that I could use directly.
 */

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you?");
        //this line of code will wait for user to type age
        int age = sc.nextInt();
        System.out.println("What is your name?");
        String name = sc.next();
        System.out.println(name + " is " + age);
    }
}
