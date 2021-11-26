package membersClasses;

public class MembersType
{
    private int yearlySubscriptionPrice;
    private static int juniorMember = 1000;
    private static int seniorMember = 1600;
    private static int pensionistMember = (int) Math.round(seniorMember*0.75);      //Laver pensionist pris 25% billigere æn Senior
    private static int passiveMember = 500;

    public MembersType(int age, Boolean isPassive)              //Viktor
    {
        if(age < 18 && !isPassive)
        {
            yearlySubscriptionPrice = juniorMember;                 //assigner den statiske værdi til objectet.
        }

        // Else if member is +18 and under 60 not passive
        else if(age >= 18 && age < 60 && !isPassive)
        {
            yearlySubscriptionPrice = seniorMember;
        }
        // Else if member is over 60 and not passive
        else if(age > 60 && !isPassive)
        {
            yearlySubscriptionPrice = pensionistMember;
        }
        // Else is passive
        else
        {
            yearlySubscriptionPrice = 500;
        }
    }
}
