import javax.swing.*;
import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        int birthMonth = 0;
        String trash = " ";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your birth month (1-12): ");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            in.nextLine();

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is " + birthMonth);
            } else {
                System.out.println("Invalid month number: " + birthMonth);
                System.out.println("Exiting... Run the program again");
                System.exit(0);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid month input: " + trash); //Invalid
            System.out.println("Exiting... Run the program again");
            System.exit(0);


        }
    }
}