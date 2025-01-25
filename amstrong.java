
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Take the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int reversedNumber = 0;
        
        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number = number / 10;
        }
        
        // Output: Display the reversed number
        System.out.println("Reversed Number: " + reversedNumber);
        
        scanner.close();
    }
}
