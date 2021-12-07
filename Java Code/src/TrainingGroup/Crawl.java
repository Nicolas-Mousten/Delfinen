// Written by Victor

// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Implementing the Comparable interface to sort data in the list because an object with to different variable types is added for each user
public class Crawl implements Comparable<Crawl>
{
    // Instantiating a new scanner
    static Scanner scanner = new Scanner(System.in);

    // Variables for swimmer name and time
    private String swimmerName;
    private double swimmerTime;


    // Method for back crawl time registration
    public static ArrayList<Crawl> registerCrawlTimes(int numberOfSwimmers)
    {

        // ArrayList to add the objects to
        ArrayList<Crawl> crawlTimes = new ArrayList<>();

        // Minimum number of swimmers has to be 5
        // Otherwise the team is too small to be created
        while (numberOfSwimmers < 5)
        {
            System.out.println("Number of swimmers must be at least 5");
            numberOfSwimmers = scanner.nextInt();
        }


        // Dynamically updating the swimmer number each time a swimmer is being added
        int swimmerNumber = 1;
        for (int i = 0; i < numberOfSwimmers; i++)
        {

            // Add swimmer name
            System.out.println("Enter swimmer " + swimmerNumber + "'s name");
            String swimmerName = scanner.nextLine();


            // Add swimmer time
            System.out.println("Enter swimmer " + swimmerNumber + "'s time");
            double swimmerTime = scanner.nextDouble();

            scanner.nextLine();


            // Pass the name and time in as parameters to the object
            Crawl crawlTime = new Crawl(swimmerName, swimmerTime);

            // Then add the object as element to the array list for each loop iteration
            crawlTimes.add(crawlTime);

            // Update swimmer number
            swimmerNumber++;


            System.out.println('\n');
        }

        // Sorting the array list, placing the name's with the corresponding times in correct order in the correct order
        // once the times have been sorted longer down
        Collections.sort(crawlTimes);


        // Get names and times
        System.out.println("Top 5 times:");

        for (int i = 0; i < 5; i++)
        {

            System.out.println(crawlTimes.get(i).getSwimmerName());
            System.out.println(crawlTimes.get(i).getSwimmerTime());

            System.out.println();
        }

        // Return times
        return crawlTimes;
    }

    // Creating a constructor for crawl
    public Crawl(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }

    // Sorting the times using the compareTo interface
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

    // Swimmer name getter
    public String getSwimmerName()
    {
        return swimmerName;
    }

    // Swimmer name setter
    public void setSwimmerName(String swimmerName)
    {
        this.swimmerName = swimmerName;
    }

    // Swimmer time getter
    public double getSwimmerTime()
    {
        return swimmerTime;
    }

    // Swimmer time setter
    public void setSwimmerTime(double swimmerTime)
    {
        this.swimmerTime = swimmerTime;
    }

    // Overriding the toString method
    @Override
    public String toString()
    {
        return "Crawl{" +
                "swimmerName='" + swimmerName + '\'' +
                ", swimmerTime=" + swimmerTime +
                '}';
    }
}