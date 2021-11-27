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

    public Member(String name, int age, String email,Boolean hasPaid) {     //Viktor        //Primary constructor
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasPaid = hasPaid;
        this.isPartOfStaff = false;
        this.isPassive = false;
        this.membersType = getMemberShipType();
    }

    public Member(String name, int age, String email, boolean hasPaid, boolean isPartOfStaff, boolean isPassive) {    //Viktor      //Secondary Constructor
        this.name = name;
        this.age = age;
        this.email = email;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
        this.isPartOfStaff = isPartOfStaff;
        this.membersType = getMemberShipType();
    }

    public MembersType getMemberShipType()
    {
        MembersType currentMember = new MembersType(this.age, this.isPassive);
        return currentMember;
    }

    public Member(String name, int age, boolean hasPaid, boolean isPassive, boolean isPartOfStaff)
    {
        this.name = name;
        this.age = age;
        this.hasPaid = hasPaid;
        this.isPassive = isPassive;
        this.isPartOfStaff = isPartOfStaff;
    }


    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", "+membersType +
                ", hasPaid=" + hasPaid +
                ", isPassive=" + isPassive +
                ", isPartOfStaff=" + isPartOfStaff +
                '}';
    }
}
