import java.util.Scanner;
import java.time.LocalDateTime;

public class agecalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Current date and time
        LocalDateTime now = LocalDateTime.now();

        // Input
        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        // Calculate age
        int currentYear = now.getYear();
        int age = currentYear - birthYear;

        // Output
        System.out.println("\nCurrent Date & Time: " + now);
        System.out.println("Your Age is: " + age + " years");

        sc.close();
    }
}