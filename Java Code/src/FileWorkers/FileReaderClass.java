package FileWorkers;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;

public class FileReaderClass {
    //Made by Lasse
    public static void addLineToCsvFile(String memberName, int memberAge, boolean hasPaid, String getEmail){
        try {
            FileWriter writer = new FileWriter("Resources/MembersList.csv", true);

            writer.append(memberName + "," + memberAge + "," + getEmail + "," + hasPaid);
            writer.append("\n");

            writer.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    //Made by Lasse
    public static boolean removeLine(String searchTermToRemoveLine, String filePath, int position){
        //Når man kalder denne metode til er fjerne i linje i en csv fil, skal man give den positionen på tingen man vil søge efter det er 'position'
        //man skal give filens 'filePath' og hvad man skal søge efter for at finde den korrekte linje at slette.
        int positionOfTerm = position - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        String currentLine;
        String data[];
        boolean checkForData = false;

        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("Resources/MembersList.csv");
            BufferedReader br = new BufferedReader(fr);

            while((currentLine = br.readLine()) != null){                                 //currentLine bliver sat lig med den næste linje så længe den eksistere. Hvis næste linje ikke eksistere stopper while loopet.
                data = currentLine.split(",");                                      //Her bliver den første linje i filen lagt i en array som splitter dem op i ','.
                if(!(data[positionOfTerm].equalsIgnoreCase(searchTermToRemoveLine))){     //Her tjekker den om det du gerne vil havde fjernet er lig med den data der er gemt i data
                    pw.println(currentLine);                                              //Hvis de ikke er lig med hinanden så gemmer vi den i den nye fil
                }else{
                    checkForData = true;
                }
            }

            if (checkForData){
                System.out.println("File has been deleted");
            }else {
                System.out.println("File not found");
            }

            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File temp = new File("Resources/MembersList.csv");
            newFile.renameTo(temp);

        }catch(Exception e){
            System.out.println("Error");
        }
        return checkForData;
    }
    //Made by Lasse
    public static void searchData(String searchTerm){
        boolean found = false;
        String name = "";
        String age = "";
        String email = "";
        try {
            FileReader writer = new FileReader("Resources/MembersList.csv");
            Scanner scanner = new Scanner((Readable) writer);
            scanner.useDelimiter("[,\n]");               //This line is to make java know that files are separated by ',' and after each new line '\n'

            while(scanner.hasNext() && !found )
            {
                name = scanner.next();
                age = scanner.next();
                email = scanner.next();

                if(name.equals(searchTerm) || age.equals(searchTerm) || email.equals(searchTerm)){
                    found = true;
                }
            }
            if (found) {
                System.out.println(name + " " + age + " " + email);
            } else {
                System.out.println("There was nothing");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

