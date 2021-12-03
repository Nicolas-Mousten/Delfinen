package UI;

import java.util.Objects;
import java.util.Scanner;

import static membersClasses.Cashier.promptChairmanToRemoveMember;
import static membersClasses.Cashier.viewContigent;

public class CashierUI {
    public static void cashierMenu() {

        int menuChoice = 0;

        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an option");
        System.out.println("1.      View Contingent");
        System.out.println("2.      Prompt Chairman to remove a member");
        System.out.println("3.      press \"q\" to quit");
        menuChoice = scanner.nextInt();
        scanner.nextLine();

            switch (menuChoice) {
                case 1: viewContigent();
                    break;
                case 2: promptChairmanToRemoveMember();
                    break;
                case 3:
                    System.out.println("Goodbye");
            }
        } while (menuChoice != 3);
    }
}
