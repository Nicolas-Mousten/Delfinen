// Written by Tobias

package UI;

import java.util.Objects;
import java.util.Scanner;

// Importing methods from the Cashier class
import static membersClasses.Cashier.promptChairmanToRemoveMember;
import static membersClasses.Cashier.viewContigent;

public class CashierUI
{
    // Cashier menu UI
    public static void cashierMenu()
    {

        // Number to choose menu point
        int menuChoice = 0;

        // Do everything in the do block
        do
        {
            // Instantiating new scanner object
            Scanner scanner = new Scanner(System.in);


            System.out.println("Please choose an option");
            System.out.println("1.      View Contingent");
            System.out.println("2.      Prompt Chairman to remove a member");
            System.out.println("3.      quit");
            menuChoice = scanner.nextInt();
            scanner.nextLine();

            // Selecting menu choice
            switch (menuChoice)
            {
                // 1. View contingent
                case 1:
                    viewContigent();
                    break;

                // 2. Prompt chairman to remove member
                case 2:
                    promptChairmanToRemoveMember();
                    break;

                // 3. Quit (with message)
                case 3:
                    System.out.println("Goodbye");
            }

        }
        // As long as the user hasn't pressed 3
        while (menuChoice != 3);
    }
}
