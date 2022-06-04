package basic;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int data = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        while(true){
            //let the user enter number
            System.out.println("Please guess the luckey number:");
            int guessnumber = sc.nextInt();
            //if it equals data, then break
            if(guessnumber == data) break;
            //if higher
            else if(guessnumber > data) System.out.println("Too large!");
            //if lower
            else{
                System.out.println("Too small!");
            }
    }
        System.out.println("Congratulation!");
}}
