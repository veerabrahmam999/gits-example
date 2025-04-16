import java.util.Scanner;

public class FirstFivePrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 2;
        System.out.println("Enter the limit value: ");
        int limit = scanner.nextInt();
        int count = 0;

        while(count<limit){
            if(isPrime(n1)){
                System.out.print(n1+" ");
                count++;
            }
            n1++;
        }
    }

    private static boolean isPrime(int n1){
        for (int i = 2; i <= Math.sqrt(n1); i++) {
                    if (n1 % i == 0) {
                        return false;
                    }
                }



            return true;
        }



    }
