package membersClasses;

import java.util.ArrayList;

public class Member
{
    private String name;
    private int age;
    private int yearlyJuniorSubscriptionPrice;
    private int yearlySeniorSubscriptionPrice;
    private boolean hasPaid = true;
    private boolean isPassive = false;
    private boolean isPartOfStaff = false;
    private static ArrayList<Member> membersList = new ArrayList<>();

    MembersType membersType = new MembersType(name, age, hasPaid, isPassive, isPartOfStaff);



    public MembersType getMemberShipType(boolean isPassive, int yearlySubscriptionPrice, int yearlySeniorSubscriptionPrice)
    {
        // Make if statement with input from constructor

        // If member is under 18 and not passive
        if(age < 18 && !isPassive)
        {
            yearlySubscriptionPrice = 1000;
        }

        // Else if member is +18 and under 60 not passive
        else if(age >= 18 && age < 60 && !isPassive)
        {
            yearlySeniorSubscriptionPrice  = 1600;
        }
        // Else if member is over 60 and not passive
        else if(age > 60 && !isPassive)
        {
            yearlySeniorSubscriptionPrice *= .25;
        }
        // Else is passive
        else
        {
            yearlySubscriptionPrice = 500;
        }

        return MembersType;
    }

    public Member(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff)
    {
        this.name = name;
        this.age = age;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
        this.isPartOfStaff = isPartOfStaff;
    }
}
