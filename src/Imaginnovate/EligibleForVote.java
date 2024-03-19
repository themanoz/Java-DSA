package Imaginnovate;

import java.time.LocalDate;
import java.util.Scanner;
public class EligibleForVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth (YYYY-MM-DD):");
        String dobInput = scanner.nextLine();

        // Parsing the user input to get the date of birth
        LocalDate dob = LocalDate.parse(dobInput);

        LocalDate currentDate = LocalDate.now();

        int age = currentDate.getYear() - dob.getYear();

        // Check if the user is eligible to vote
        if (age >= 18) {
            System.out.println("You are " + age + " eligible to vote.");
        } else {
            System.out.println("You are "+ age + " not eligible to vote.");
        }
    }
}
