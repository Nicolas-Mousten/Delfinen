package membersClasses;
import java.util.Scanner;
import FileWorkers.FileReaderClass;

public class Chairman extends Cashier{
    public Chairman(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }
    // mangler email
    public Chairman(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff) {
        super(name, age, hasPaid, isPassive, isPartOfStaff);
    }

    public static void main(String[] args) {


        Chairman chairman = new Chairman("benny",10,true,true,true);

        chairmanMenu();


    }
    //Made by Lasse

    public static void chairmanMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean whileKey = true;
        do{
            printChairmanMenu();
            System.out.println("Please write a number for the option you would like to choose");
            int menuChoice = scanner.nextInt();
            scanner.nextLine();
            switch(menuChoice) {
                case 1:
                    removeMember(scanner);
                    whileKey = false;
                    break;
                case 2:
                    inputNewMembers(scanner);
                    whileKey = false;
                    break;
                case 3:
                    System.out.println("Please write what you want to search after");
                    String searchTerm = scanner.nextLine();
                    FileReaderClass.searchData(searchTerm);
                    whileKey = false;
                    break;
                case 4:
                    whileKey = false;
                    break;

            }

        }while(whileKey);
    }

    public static void printChairmanMenu() {
        String[] ChairmanMenu = {"Remove member", "Add member", "Search data", "Exit program"};
        int[] ChairmanMenuNumbers = {1, 2, 3, 4};
        for (int i = 0; i < ChairmanMenuNumbers.length; i++) {
            System.out.println(ChairmanMenuNumbers[i] + " " + ChairmanMenu[i]);
        }
    }

    public static void removeMember(Scanner scanner){
        String filePath = "Resources/MembersList.csv";
        int position = 4;                                   //Dette er positionen i csv filen jeg vil søge efter. Vi går efter email da det er unik for hver member
                                                            //og email ligger på position 4
        boolean checkForData = false;
        do {
            System.out.println("Please write the email of the member you would like to delete");
            String removeUser = scanner.nextLine();
            checkForData = FileReaderClass.removeLine(removeUser, filePath, position);
        }while(!checkForData);
    }

    public static void inputNewMembers(Scanner scanner){
        System.out.println("Please type in the new members name");
        String memberName = scanner.nextLine();
        System.out.println("Please type in new members age");
        int memberAge = scanner.nextInt();
        scanner.nextLine();
        boolean hasPaid = hasMemberPaid(scanner);  //Hvis den er false har de ikke betalt, hvis den er true har de betalt
        String getEmail = getMemberEmail(scanner);

        FileReaderClass.addLineToCsvFile(memberName, memberAge, hasPaid, getEmail);
    }
    //Made by Lasse
    public static String getMemberEmail(Scanner scanner){
        System.out.println("Please type in member e-mail");
        String email = scanner.nextLine();
        return email;
    }
    //Made by Lasse
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
    //Made by Lasse
    public static boolean checkMemberPay(String memberAnswer, boolean hasPaid){
        if (memberAnswer.equals("y")) {
            hasPaid = true;
        } else {
        }
        return hasPaid;
    }

}