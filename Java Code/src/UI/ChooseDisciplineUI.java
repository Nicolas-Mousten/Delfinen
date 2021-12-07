package UI;

import java.util.InputMismatchException;
import java.util.Scanner;

// Importing FileReader and TrainingGroup classes
import FileWorkers.FileReaderClass;
import TrainingGroup.BreastSwimming;
import TrainingGroup.Butterfly;
import TrainingGroup.BackCrawl;
import TrainingGroup.Crawl;


public class ChooseDisciplineUI
{

    // Instantiating a new scanner object
    static Scanner scanner = new Scanner(System.in);

    // Choose swimming discipline
    public static void chooseSwimmingDiscipline()
    {
        boolean whileKey;
        do {
            try{
            whileKey = true;
            // Enter number of swimmers
            System.out.println("Enter number of swimmers");
            int numberOfSwimmers = scanner.nextInt();

            // Choose discipline
            System.out.println("Choose swimming discipline. Press 1 for crawl. Press 2 for back crawl. Press 3 for breast swimming. Press 4 for butterfly times");


            // Number to choose discipline
            int chooseSwimmingDiscipline = scanner.nextInt();

            // Setting member name, member e-mail and member swimming time equal to their corresponding methods
            String memberName = returnMemberName();
            String returnEmail = returnMemberEmail();
            double returnSwimmerTime = returnMemberTime();

            // Setting the file path per default to an empty string (it's value is being set to the swimming discipline's corresponding CSV file)
            String filePath = "";

            // Discipline choices
            switch (chooseSwimmingDiscipline) {
                // 1. Crawl
                case 1:
                    filePath = "Resources/crawltimes.csv";
                    System.out.println("Enter crawl times");
                    Crawl.registerCrawlTimes(numberOfSwimmers);
                    FileReaderClass.addSwimmerToCsvFile(memberName, returnEmail, returnSwimmerTime, filePath);
                    whileKey = false;
                    break;


                // 2. Back Crawl
                case 2:
                    filePath = "Resources/backcrawltimes.csv";
                    System.out.println("Enter back crawl times");


                    BackCrawl.registerBackCrawlTimes(numberOfSwimmers);
                    FileReaderClass.addSwimmerToCsvFile(memberName, returnEmail, returnSwimmerTime, filePath);
                    whileKey = false;
                    break;


                // 3. Breast Swimming
                case 3:
                    filePath = "Resources/breastswimmingtimes.csv";
                    System.out.println("Enter breast swimming times");
                    BreastSwimming.registerBreastSwimmingTimes(numberOfSwimmers);
                    whileKey = false;
                    break;


                // 4. Butterlfy
                case 4:
                    filePath = "Resources/butterflytimes.csv";
                    System.out.println("Enter butterfly times");
                    Butterfly.registerButterflyTimes(numberOfSwimmers);
                    whileKey = false;
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("Invalid Input");
                whileKey = true;
                scanner.nextLine();
            }
        }while(whileKey);
    }


    // Return swimmer name
    public static String returnMemberName()
    {
        System.out.println("Please enter member's name");
        String name = scanner.nextLine();
        return name;
    }

    // Return member e-mail
    public static String returnMemberEmail()
    {
        System.out.println("Please enter member's email");
        String email = scanner.nextLine();
        return email;
    }

    // Return swimmer time
    public static double returnMemberTime()
    {
        System.out.println("Please enter member's time");
        double time = scanner.nextDouble();
        return time;
    }
}


