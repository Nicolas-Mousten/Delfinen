package UI;

import java.util.Scanner;

public class LoginUI {
    private static Scanner sc = new Scanner(System.in);
    public static int startMenu(){
        System.out.println("Welcome to Delfin SwimmingClub");
        int choice = 0;
        int returnValue = 0;
        do{
            System.out.print("Choose 1 to log in as trainer\nChoose 2 to log in as cashier\nChoose 3 to log in as Chairman\n>");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                returnValue = 1;
                System.out.println("Welcome trainer");
            }
            else if(choice == 2){
                returnValue = 2;
                System.out.println("Welcome Cashier");
            }
            else if(choice == 3){
                returnValue = 3;
                System.out.println("Welcome Chairman");
            }
            else{
                System.out.println("Not a legit answer");
            }
            System.out.println(choice);
        }while(choice<1 || choice>3);
        return returnValue;
    }
}
