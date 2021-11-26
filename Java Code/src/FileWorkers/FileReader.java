package FileWorkers;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileReader {
    public static void addMemberToCsvFile(String memberName,int memberAge,boolean hasPaid,String getEmail){
        try {
            FileWriter writer = new FileWriter("Resources/MembersList.csv", true);

            writer.append(memberName + ";" + memberAge + ";" + hasPaid + ";" + getEmail);
            writer.append("\n");

            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

