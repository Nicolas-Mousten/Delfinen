package UI;

import java.util.Scanner;

import static membersClasses.Cashier.promptChairmanToRemoveMember;
import static membersClasses.Cashier.viewContigent;

public class CashierUI {
    public static void cashierMenu() {
        Scanner scanner = new Scanner(System.in);
        Boolean key = true;
        int menuChoice = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println("Please choose an option");
            switch (menuChoice) {
                case 1: viewContigent();
                    key = false;
                    break;
                case 2: promptChairmanToRemoveMember();
                    key = false;
                    break;
            }
        } while (key);
    }
}
