//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package TrainingGroup;

import java.util.ArrayList;
import java.util.Scanner;

import membersClasses.Member;

public class Crawl
{
    static Scanner scanner;
    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<Crawl> registerCrawlTimes(int numberOfSwimmers)
    {
        ArrayList<Crawl> crawlTimes = new ArrayList();
        int swimmerNumber = 1;

        for (int i = 0; i < numberOfSwimmers; i++)
        {
            System.out.println("Enter swimmer " + swimmerNumber + "'s name");
            String swimmerName = scanner.nextLine();

            Member.nameConditions(swimmerName);
            System.out.println("Enter swimmer " + swimmerNumber + "'s time");

            double swimmerTime = scanner.nextDouble();
            new Crawl(swimmerName, swimmerTime);

            swimmerNumber++;
            scanner.nextLine();
        }

        return crawlTimes;
    }

    public Crawl(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

}
