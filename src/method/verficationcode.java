package method;

import java.util.Random;
import java.util.Scanner;

/*
A method could generate verfication code that might contains upper case letters, lower case letters and numbers
 */
public class verficationcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the code you want?");
        int n = sc.nextInt();
        System.out.println("The code you want is: " + createcode(n));
    }

    public static String createcode(int n) {
        Random r = new Random();
        //need random, in for loop, decide to generate which type of letter, then use switch to generate
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type) {
                case 0:
                    char ch = (char) (r.nextInt(26) + 65);
                    //type case, the ASCII number for upper case number
                    code += ch;
                    break;
                case 1:
                    char ch1 = (char) (r.nextInt(26) + 97);
                    //type case, the ASCII number for upper case number
                    code += ch1;
                    break;
                case 2:
                    int num = r.nextInt(10);
                    //type case, the ASCII number for upper case number
                    code += num;
                    break;
            }
        }
        return code;
    }
}
