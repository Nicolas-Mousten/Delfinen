package TestThings;

import membersClasses.Member;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateMembers {
    public static void main(String[] args) {
        File membersList = new File("Resources/MembersList.csv");
        createMembers(membersList);
    }


    public static void createMembers(File membersList) {
        // these are test objects for the MembersList
        Member nicolas = new Member("Nicolas", 21, "nicolas.mousten@gmail.com", true);
        Member lasse = new Member("Lasse", 23, "LasseTimm@outlook.com", false, false, true);
        Member tobias = new Member("Tobias", 24, "TobiasDenBedste@Gmail.com", true);
        try {
            // Here BufferedWriter is used to write the objects to MembersList
            // Since buffered writer inherits from writer it will also
            // Append means it will write to the end of the document instead of the beginning
            FileWriter fileWriter = new FileWriter(membersList, true);
            BufferedWriter buffer = new BufferedWriter(fileWriter);
            buffer.write(nicolas.toString());
            buffer.newLine();
            buffer.close();
            System.out.println("new member added to MembersList.csv");
        } catch (IOException e) {
            System.out.println("There was an error");
            e.getStackTrace();
        }
    }
}
