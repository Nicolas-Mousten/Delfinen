// Package
package TrainingGroup;

// Imports

import membersClasses.Member;

import java.util.ArrayList;
import java.util.Scanner;


public class BreastSwimming
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

            //Member.nameConditions(swimmerName);

            BreastSwimming breastSwimmingTime = new BreastSwimming(swimmerName, swimmerTime);

            swimmerNumber++;


            System.out.println('\n');

            scanner.nextLine();
        }

        return breastSwimmingTimes;
    }


    public BreastSwimming(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }
}