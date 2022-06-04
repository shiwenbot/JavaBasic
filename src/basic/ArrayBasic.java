package basic;

import java.util.Random;

public class ArrayBasic {
    public static void main(String[] args) {
        //static array
        int[] score = new int[]{72,73,80};
        System.out.println(score[0]);

        //dynamic array
        String[] names = new String[3];
        names[0] = "Simon";
        System.out.println(names[0]);

        System.out.println("-------------------");

        //travers the array to get the sum of the array, the numbers are generated randomly
        int[] number = new int[3];
        Random rd = new Random();
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = rd.nextInt(100);
            sum += number[i];
        }
        System.out.println(sum);
        System.out.println("-----------------------------");

        //get the highest age in the array
        int[] age = new int[10];
        Random rd1 = new Random();
        //if the number is higher, update ans
        int ans = 0;
        for (int i = 0; i < age.length; i++) {
            age[i] = rd1.nextInt(80);
            if(age[i] > ans) ans = age[i];
            System.out.println("The highest age for this round is " + ans);
        }
    }
}
