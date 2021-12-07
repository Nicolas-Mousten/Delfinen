package TestThings;

import FileWorkers.FileReaderClass;
import membersClasses.Member;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

public class CreateMembers
{

    private static Random random = new Random();

    public static void main(String[] args)
    {
        createMembers();
    }

    public static void createMembers()
    {                //Nicolas
        // these are test objects for the MembersList

        String[] names = {"Nicolas", "Lasse", "Tobias", "Harald", "Carl", "Gudit", "Erik"};
        ArrayList<Member> Members = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            int randNames = random.nextInt(names.length);
            int randAge = random.nextInt(100 - 1) + 1;
            boolean randHasPaid = random.nextBoolean();
            boolean isPassive = random.nextBoolean();
            boolean isPartOfStaff = random.nextBoolean();

            String name = names[randNames];
            String email = name + "@" + i +".com";
            Member currentMember = new Member(name, randAge, email, randHasPaid, isPassive, isPartOfStaff);
            Members.add(currentMember);
        }

        for (int i = 0; i < Members.size(); i++)
        {
            String name = Members.get(i).getName();
            int age = Members.get(i).getAge();
            String email = Members.get(i).getEmail();
            boolean hasPaid = Members.get(i).isHasPaid();
            boolean isPassive = Members.get(i).isPassive();
            boolean isPartOfStaff = Members.get(i).isPartOfStaff();
            FileReaderClass.addLineToCsvFile(name, age, hasPaid, email, isPassive, isPartOfStaff, "Resources/MembersList.csv");
        }

    }

}
