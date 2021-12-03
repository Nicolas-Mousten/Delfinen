package membersClasses;

import java.io.*;
import java.util.Scanner;

public class Cashier extends Trainer{
    public Cashier(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {
        super(name, age, email, hasPaid, isPartOfStaff, isPassive);
    }

    // Tobias har skrevet dette
    public static void viewContigent() {
        File membersList = new File("Resources/MembersList.csv");
        int totalContigent = 0;
        try {
            // Husk at oprette en ny cashier for at teste med denne kode
            /*Cashier cashier = new Cashier("testName",89,"fghdfjkgh",true,true,false);
            cashier.viewContingent();*/
            Scanner DatabaseReader = new Scanner(membersList);
            while(DatabaseReader.hasNextLine()) {
                String data = DatabaseReader.nextLine();
                String[] stringsInArray = data.split(";");
                // Splitter String i forskellige variabler som kan bruges senere
                String Name = stringsInArray[0];
                int age = Integer.parseInt(stringsInArray[1]);
                Boolean hasPaid = Boolean.parseBoolean(stringsInArray[2]);
                String email = stringsInArray[3];
                Boolean isPassive = Boolean.parseBoolean(stringsInArray[4]);
                Boolean isPartOfStaff = Boolean.parseBoolean(stringsInArray[5]);
                // bruger age og has paid til at regne ud, hvor meget en kunde skal betale
                MembersType membersType = new MembersType(age,isPassive);
                int contigent = membersType.getYearlySubscriptionPrice();
                // adder contigent til totalContigent
                totalContigent = totalContigent+contigent;
            }
            System.out.println("Here is the total contigent");
            System.out.println(totalContigent+" kr");
        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        }
    }

    // Tobias har skrevet dette
    public static void promptChairmanToRemoveMember(){
        File membersToBeRemovedList = new File("Resources/MembersToBeRemoved.csv");
        File membersList = new File("Resources/MembersList.csv");

        try {
            FileWriter fileWriter = new FileWriter(membersToBeRemovedList,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            Scanner DatabaseReader = new Scanner(membersList);
            while(DatabaseReader.hasNextLine()) {
                String data = DatabaseReader.nextLine();
                String[] stringsInArray = data.split(";");
                // Splitter String i forskellige variabler som kan bruges senere
                String name = stringsInArray[0];
                int age = Integer.parseInt(stringsInArray[1]);
                Boolean hasPaid = Boolean.parseBoolean(stringsInArray[2]);
                String email = stringsInArray[3];

                // Dette if statement skriver til MembersToBeRemoved.csv, hvis en kunde ikke har betalt
                if (hasPaid.equals(false)) {
                    String abc = name+";"+age+";"+email;;
                    bufferedWriter.write(abc);
                    bufferedWriter.newLine();
                }
            }
            bufferedWriter.close();
            // Her er der to exceptions som der bliver fanget
        } catch (FileNotFoundException e) {
            System.out.println("file could not be found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("there was an error");
            e.printStackTrace();
        }
    }

}
