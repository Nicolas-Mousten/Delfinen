// Written by Nicolas
package UI;

import java.util.Scanner;

public class LoginUI
{
    // Instantiating a scanner object
    private static Scanner sc = new Scanner(System.in);


    // Start menu
    public static int startMenu()
    {
        // Welcome message
        System.out.println("Welcome to Delfin SwimmingClub");

        //
        int choice = 0;
        int returnValue = 0;

        // Do everything in the do block
        do
        {
            System.out.print("Choose 1 to log in as trainer\nChoose 2 to log in as cashier\nChoose 3 to log in as Chairman\n>");

            // Getting choice
            choice = sc.nextInt();
            sc.nextLine();

            // If choice is 1
            if (choice == 1)
            {
                // Return 1 and print message
                returnValue = 1;
                System.out.println("Welcome trainer");
            }
            // If choice is 2
            else if (choice == 2)
            {
                // Return 2 and print message
                returnValue = 2;
                System.out.println("Welcome Cashier");
            }
            // If choice is 3
            else if (choice == 3)
            {
                // Return 3 and print message
                returnValue = 3;
                System.out.println("Welcome Chairman");
            }
            // Else print out error message
            else
            {
                System.out.println("Not a legit answer");
            }
        }
        // While choice is between 1 and 3 (the two boundaries included)
        while (choice < 1 || choice > 3);

        // Return the return value
        return returnValue;
    }
}
