package basic;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        //could use in ticket grabbing software
        int i = 0;
        do{
            System.out.println("Have a nice day!");
            i++;
        }while(i < 3);

        System.out.println("-------------------");
        /*password verification system
        an infinite loop, break until the password is correct
         */
        int realpassword = 520;
        Scanner sc = new Scanner(System.in);
        //a loop that allows the user to enter password
        while(true){
            System.out.println("Please enter the password:");
            int password = sc.nextInt();
            //if it is correct, end the loop
            if(password == realpassword){
                break;
            }else{
                System.out.println("Please try again!");
            }
        }
        System.out.println("Welcome!");

        //break:跳出当次循环，立即进入下一次
        //做五天家务，但是在第四天不需要做
        for(int j = 1; j <= 5;j ++){
            if(j == 4){
                continue;
            }
            System.out.println("This is "+ j + "th day.");
        }
    }
}
