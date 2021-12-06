// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Crawl implements Comparable<Crawl>
{

    static Scanner scanner = new Scanner(System.in);

    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<Crawl> registerCrawlTimes(int numberOfSwimmers)
    {
        ArrayList<Crawl> crawlTimes = new ArrayList<>();


        while (numberOfSwimmers < 5)
        {
            System.out.println("Number of swimmers must be at least 5");
            numberOfSwimmers = scanner.nextInt();
        }


        int swimmerNumber = 1;
        for (int i = 0; i < numberOfSwimmers; i++)
        {

            System.out.println("Enter swimmer " + swimmerNumber + "'s name");
            String swimmerName = scanner.nextLine();


            System.out.println("Enter swimmer " + swimmerNumber + "'s time");
            double swimmerTime = scanner.nextDouble();

            scanner.nextLine();

            // Member.nameConditions(swimmerName);

            Crawl crawlTime = new Crawl(swimmerName, swimmerTime);

            crawlTimes.add(crawlTime);

            swimmerNumber++;


            System.out.println('\n');
        }

        Collections.sort(crawlTimes);

        System.out.println("Top 5 times:");

        for (int i = 0; i < 5; i++)
        {

            System.out.println(crawlTimes.get(i).getSwimmerName());
            System.out.println(crawlTimes.get(i).getSwimmerTime());

            System.out.println();
        }


        return crawlTimes;
    }


    public Crawl(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

    public int compareTo(Crawl crawl)
    {
        if (swimmerTime < crawl.swimmerTime)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }


    public String getSwimmerName()
    {
        return swimmerName;
    }

    public void setSwimmerName(String swimmerName)
    {
        this.swimmerName = swimmerName;
    }

    public double getSwimmerTime()
    {
        return swimmerTime;
    }

    public void setSwimmerTime(double swimmerTime)
    {
        this.swimmerTime = swimmerTime;
    }

    @Override
    public String toString()
    {
        return "Crawl{" +
                "swimmerName='" + swimmerName + '\'' +
                ", swimmerTime=" + swimmerTime +
                '}';
    }
}