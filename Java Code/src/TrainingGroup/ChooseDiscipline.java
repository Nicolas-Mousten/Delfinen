package TrainingGroup;

import java.util.Scanner;

import TrainingGroup.TrainingGroup;
import TrainingGroup.BreastSwimming;
import TrainingGroup.Butterfly;
import TrainingGroup.BackCrawl;
import TrainingGroup.Crawl;


public class ChooseDiscipline
{

    public static void chooseSwimmingDiscipline()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of swimmers");
        int numberOfSwimmers = scanner.nextInt();

        System.out.println("Choose swimming discipline. Press 1 for crawl. Press 2 for back crawl. Press 3 for breast swimming. Press 4 for butterfly times");

        int chooseSwimmingDiscipline = scanner.nextInt();

        switch (chooseSwimmingDiscipline)

        {
            case 1:
                System.out.println("Enter crawl times");
                Crawl.registerCrawlTimes(numberOfSwimmers);
                break;

            case 2:
                System.out.println("Enter back crawl times");
                BackCrawl.registerBackCrawlTimes(numberOfSwimmers);
                break;

            case 3:
                System.out.println("Enter breast swimming times");
                BreastSwimming.registerBreastSwimmingTimes(numberOfSwimmers);
                break;

            case 4:
                System.out.println("Enter butterfly times");
                Butterfly.registerButterflyTimes(numberOfSwimmers);
                break;
        }
    }
}
