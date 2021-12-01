package membersClasses;
import java.util.Scanner;
import FileWorkers.FileReador;

public class Chairman extends Cashier{
    public Chairman(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }
    // mangler email
    public Chairman(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff) {
        super(name, age, hasPaid, isPassive, isPartOfStaff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chairman chairman = new Chairman("benny",10,true,true,true);
        inputNewMembers(scanner);
    }

    public static void inputNewMembers(Scanner scanner){
        System.out.println("Please type in the new members name");
        String memberName = scanner.nextLine();
        System.out.println("Please type in new members age");
        int memberAge = scanner.nextInt();
        scanner.nextLine();
        boolean hasPaid = hasMemberPaid(scanner);  //Hvis den er false har de ikke betalt, hvis den er true har de betalt
        String getEmail = getMemberEmail(scanner);

        FileReador.addMemberToCsvFile(memberName, memberAge, hasPaid, getEmail, isPartOfStaff, isPassive);
    }

    public static String getMemberEmail(Scanner scanner){
        System.out.println("Please type in member e-mail");
        String email = scanner.nextLine();
        return email;
    }

    public static boolean hasMemberPaid(Scanner scanner) {
        boolean hasPaid = false;
        String memberAnswer = "";
        do{
            System.out.println("Has new member paid? 'y' for yes, 'n' for no");
            memberAnswer = scanner.nextLine();
            if(memberAnswer.equalsIgnoreCase("y") || memberAnswer.equalsIgnoreCase("n")) {
                hasPaid = checkMemberPay(memberAnswer, hasPaid);
            } else {

            }
        }while(!memberAnswer.equalsIgnoreCase("y") && !memberAnswer.equalsIgnoreCase("n"));
        return hasPaid;
    }

    public static boolean checkMemberPay(String memberAnswer, boolean hasPaid){
        if (memberAnswer.equals("y")) {
            hasPaid = true;
        } else {
        }
        return hasPaid;
    }

}