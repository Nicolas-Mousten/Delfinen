// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Butterfly implements Comparable<Butterfly>
{

    static Scanner scanner = new Scanner(System.in);

    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<Butterfly> registerButterflyTimes(int numberOfSwimmers)
    {
        ArrayList<Butterfly> butterflySwimmingTimes = new ArrayList<>();


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

            Butterfly butterflySwimmingTime = new Butterfly(swimmerName, swimmerTime);

            butterflySwimmingTimes.add(butterflySwimmingTime);

            swimmerNumber++;


            System.out.println('\n');
        }

        Collections.sort(butterflySwimmingTimes);

        System.out.println("Top 5 times:");

        for (int i = 0; i < 5; i++)
        {

            System.out.println(butterflySwimmingTimes.get(i).getSwimmerName());
            System.out.println(butterflySwimmingTimes.get(i).getSwimmerTime());

            System.out.println();
        }


        return butterflySwimmingTimes;
    }


    public Butterfly(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

    public int compareTo(Butterfly butterfly)
    {
        if (swimmerTime < butterfly.swimmerTime)
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
        return "BreastSwimming{" +
                "swimmerName='" + swimmerName + '\'' +
                ", swimmerTime=" + swimmerTime +
                '}';
    }
}