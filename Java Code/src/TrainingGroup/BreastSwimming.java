// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class BreastSwimming implements Comparable<BreastSwimming>
{

    static Scanner scanner = new Scanner(System.in);

    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<BreastSwimming> registerBreastSwimmingTimes(int numberOfSwimmers)
    {
        ArrayList<BreastSwimming> breastSwimmingTimes = new ArrayList<>();


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

            BreastSwimming breastSwimmingTime = new BreastSwimming(swimmerName, swimmerTime);

            breastSwimmingTimes.add(breastSwimmingTime);

            swimmerNumber++;


            System.out.println('\n');
        }

        Collections.sort(breastSwimmingTimes);

        System.out.println("Top 5 times:");

        for (int i = 0; i < 5; i++)
        {

            System.out.println(breastSwimmingTimes.get(i).getSwimmerName());
            System.out.println(breastSwimmingTimes.get(i).getSwimmerTime());

            System.out.println();
        }


        return breastSwimmingTimes;
    }


    public BreastSwimming(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

    public int compareTo(BreastSwimming breastSwimming)
    {
        if (swimmerTime < breastSwimming.swimmerTime)
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
        return "BackCrawl{" +
                "swimmerName='" + swimmerName + '\'' +
                ", swimmerTime=" + swimmerTime +
                '}';
    }
}