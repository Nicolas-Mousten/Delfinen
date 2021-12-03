package membersClasses;

import java.util.ArrayList;

public class Member
{
    private String name;
    private int age;
    private String email;
    private MembersType membersType;
    private boolean hasPaid;
    private boolean isPassive;
    private boolean isPartOfStaff = false;
    private static ArrayList<Member> membersList = new ArrayList<>();

    public Member(String name, int age, String email, Boolean hasPaid)
    {     //Viktor        //Primary constructor
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasPaid = hasPaid;
        this.isPartOfStaff = false;
        this.isPassive = false;
        this.membersType = getMemberShipType();
    }

    public Member(String name, int age, String email, boolean hasPaid, boolean isPassive) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
    }

    public Member(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive)
    {    //Viktor      //Secondary Constructor
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
        this.isPartOfStaff = isPartOfStaff;
        this.membersType = getMemberShipType();
    }

    public static void nameConditions(String nameOne)
    {
        String[] notAllowedCharsInName = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};

        for (int i = 0; i < notAllowedCharsInName.length - 1; ++i)
        {
            if (nameOne.contains(notAllowedCharsInName[i]))
            {
                System.out.println("Invalid character in name. Names can only contain letters from the alphabet.");
            }
        }

    }

    public MembersType getMemberShipType()
    {
        MembersType currentMember = new MembersType(this.age, this.isPassive);
        return currentMember;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getEmail()
    {
        return email;
    }

    public boolean isHasPaid()
    {
        return hasPaid;
    }

    public boolean isPassive() { return isPassive; }

    public boolean isPartOfStaff() { return isPartOfStaff; }

    public Member(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff)
    {
        this.name = name;
        this.age = age;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
        this.isPartOfStaff = isPartOfStaff;
    }


    @Override
    public String toString()
    {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", " + membersType +          //Nicolas
                ", hasPaid=" + hasPaid +
                ", isPassive=" + isPassive +
                ", isPartOfStaff=" + isPartOfStaff +
                "}";
    }
}
