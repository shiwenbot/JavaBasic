package method;

public class primenumber {
    public static void main(String[] args) {
        for (int i = 100; i <200 ; i++) {
            boolean prime = true;

            for (int j = 2; j < i/2 ; j++) {
                if(i%j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime == true){
                System.out.println(i);
            }
        }
    }
}
