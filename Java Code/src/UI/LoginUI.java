package UI;

import java.util.Scanner;

public class LoginUI {
    private static Scanner sc = new Scanner(System.in);
    public static void startMenu(){
        System.out.println("Welcome to Delfin SwimmingClub");
        int choice = 0;
        do{
            System.out.println("Choose 1 to log in as trainer\nChoose 2 to log in as cashier\nChoose 3 to log in as Chairman\n>");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println(choice);
        }while(choice<1 || choice>3);
    }
}
