package method;

import java.util.Scanner;

public class flight {
    public static void main(String[] args) {
        //let user enter price, month and class
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the price:");
        double price = sc.nextDouble();

        System.out.println("Please enter the month:");
        int month = sc.nextInt();

        System.out.println("Please enter the class:");
        String flightclass = sc.next();

        System.out.println("The price is " + flightprice(price, month, flightclass));
    }

    public static double flightprice(double price, int month, String flightclass){
        if(month>10||month<5){
            switch(flightclass){
                case "firstclass":
                    price *= 0.9;
                    break;
                case "economicclass":
                    price *= 0.85;
                    break;
            }
        }else{
            switch(flightclass){
                case "firstclass":
                    price *= 0.7;
                    break;
                case "economicclass":
                    price *= 0.6;
                    break;
            }
        }
        return price;
    }


}
