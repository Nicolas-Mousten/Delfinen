package TrainingGroup;

import java.util.ArrayList;
import java.util.Scanner;

import membersClasses.Member;

public class BackCrawl
{
    static Scanner scanner;
    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<BackCrawl> registerBackCrawlTimes(int numberOfSwimmers)
    {
        ArrayList<BackCrawl> backCrawlTimes = new ArrayList();
        int swimmerNumber = 1;

        for (int i = 0; i < numberOfSwimmers; i++)
        {
            System.out.println("Enter swimmer " + swimmerNumber + "'s name");
            String swimmerName = scanner.nextLine();

            System.out.println("Enter swimmer " + swimmerNumber + "'s time");
            double swimmerTime = scanner.nextDouble();
            Member.nameConditions(swimmerName);

            new BackCrawl(swimmerName, swimmerTime);
            swimmerNumber++;
            scanner.nextLine();
        }

        return backCrawlTimes;
    }

    public BackCrawl(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }
}
