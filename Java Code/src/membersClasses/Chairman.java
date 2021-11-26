package membersClasses;
import java.util.Scanner;

public class Chairman extends Cashier{
    public Chairman(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }

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
        boolean hasPaid = hasMemberPain(scanner);
        String getEmail = getMemberEmail(scanner);

        System.out.println(memberName);
        //FileReader.addMemberToCsvFile();
    }

    public static String getMemberEmail(Scanner scanner){
        System.out.println("Please type in member e-mail");
        String email = scanner.nextLine();
        return email;
    }

    public static boolean hasMemberPain(Scanner scanner) {
        boolean hasPaid = true;
        System.out.println("Has new member paid? 'Y' for yes, 'N' for no");
        String memberAnswer = scanner.nextLine();
        if(memberAnswer.equals("N")){
            hasPaid = false;
        }
        return hasPaid;
    }

}