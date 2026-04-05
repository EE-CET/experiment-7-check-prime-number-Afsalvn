
import java.util.Scanner;

public class CheckPrime {

    // Method to check if a number is prime
    public boolean isPrime(int n) {
        // A prime number is strictly greater than 1
        if (n <= 1) {
            return false;
        }
        
        // We only need to check divisibility up to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Divisible by a number other than 1 and itself
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            CheckPrime checker = new CheckPrime();
            
            // Output exactly as requested by the problem statement
            if (checker.isPrime(n)) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
        
        sc.close();
    }
}
