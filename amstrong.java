import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call function to check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }

    // Function to check if a number is Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = String.valueOf(num).length(); // Find number of digits

        while (num > 0) {
            int digit = num % 10; // Extract last digit
            sum += Math.pow(digit, digits); // Raise digit to the power of number of digits and add to sum
            num /= 10; // Remove the last digit
        }

        // Check if sum equals the original number
        return sum == originalNumber;
    }
}
