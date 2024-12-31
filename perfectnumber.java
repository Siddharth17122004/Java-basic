import java.util.*;


public class Main

{
   
        
  
    
import java.util.Scanner;

public class PerfectNumber {
    
    // Function to check if the number is a perfect number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        
        // Find divisors and sum them
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        // A perfect number is equal to the sum of its divisors (excluding itself)
        return sum == num;
    }

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a perfect number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}
