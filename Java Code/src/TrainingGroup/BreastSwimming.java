// Written by Victor

// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Implementing the Comparable interface to sort data in the list because an object with to different variable types is added for each user
public class BreastSwimming implements Comparable<BreastSwimming>
{

    // Instantiating a new scanner
    static Scanner scanner = new Scanner(System.in);

    // Variables for swimmer name and time
    private String swimmerName;
    private double swimmerTime;


    // Method for back crawl time registration
    public static ArrayList<BreastSwimming> registerBreastSwimmingTimes(int numberOfSwimmers)
    {
        // ArrayList to add the objects to
        ArrayList<BreastSwimming> breastSwimmingTimes = new ArrayList<>();


        // Minimum number of swimmers has to be 5
        // Otherwise the team is too small to be created
        while (numberOfSwimmers < 5)
        {
            System.out.println("Number of swimmers must be at least 5");
            numberOfSwimmers = scanner.nextInt();
        }


        // Dynamically updating the swimmer number each time a swimmer is being added
        for (int i = 0; i < numberOfSwimmers; i++)
        {

            // Add swimmer name
            System.out.println("Enter swimmer's name");
            String swimmerName = scanner.nextLine();

            // Add swimmer time
            System.out.println("Enter swimmer's time");
            double swimmerTime = scanner.nextDouble();

            scanner.nextLine();

            // Pass the name and time in as parameters to the object
            BreastSwimming breastSwimmingTime = new BreastSwimming(swimmerName, swimmerTime);

            // Then add the object as element to the array list for each loop iteration
            breastSwimmingTimes.add(breastSwimmingTime);

            System.out.println('\n');
        }

        // Sorting the array list, placing the name's with the corresponding times in correct order in the correct order
        // once the times have been sorted longer down
        Collections.sort(breastSwimmingTimes);


        // Get names and times
        System.out.println("Top 5 times:");


        for (int i = 0; i < 5; i++)
        {

            System.out.println(breastSwimmingTimes.get(i).getSwimmerName());
            System.out.println(breastSwimmingTimes.get(i).getSwimmerTime());

            System.out.println();
        }

        // Return times
        return breastSwimmingTimes;
    }

    // Creating a constructor for breast swimming
    public BreastSwimming(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

    // Sorting the times using the compareTo interface
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