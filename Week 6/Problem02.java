import java.util.Scanner;

public class Problem02 { // prime
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean isPrime = true;
        
        if (n == 0 || n == 1) {
            System.out.println(n + " is neither prime nor composite.");
            return;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(n + " is prime.");
        else System.out.println(n + " is not prime.");
    }
}

