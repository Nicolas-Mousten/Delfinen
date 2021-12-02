package TrainingGroup;

import java.util.ArrayList;
import java.util.Scanner;

import membersClasses.Member;

public class Butterfly
{
    static Scanner scanner;
    private String swimmerName;
    private double swimmerTime;

    public static ArrayList<Butterfly> registerButterflyTimes(int numberOfSwimmers)
    {
        ArrayList<Butterfly> butterflyTimes = new ArrayList();
        int swimmerNumber = 1;

        for (int i = 0; i < numberOfSwimmers; ++i)
        {
            System.out.println("Enter swimmer " + swimmerNumber + "'s name");
            String swimmerName = scanner.nextLine();

            Member.nameConditions(swimmerName);
            System.out.println("Enter swimmer " + swimmerNumber + "'s time");

            double swimmerTime = scanner.nextDouble();
            new Butterfly(swimmerName, swimmerTime);

            swimmerNumber++;
            scanner.nextLine();
        }

        return butterflyTimes;
    }

    public Butterfly(String swimmerName, double swimmerTime)
    {
        this.swimmerName = swimmerName;
        this.swimmerTime = swimmerTime;
    }
}
