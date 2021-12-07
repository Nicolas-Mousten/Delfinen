package FileWorkers;

import java.io.IOException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;

public class FileReaderClass
{

    //Made by Lasse
    // Adding new line for swimmer data to CSV file
    public static void addLineToCsvFile(String memberName, int memberAge, boolean hasPaid, String getEmail, boolean isPassive, boolean isPartOfStaff, String filePath)
    {

        // Wrapping file writer in a try/catch block
        try
        {
            // Creating new file writer
            FileWriter writer = new FileWriter(filePath, true);

            // Appending member data
            writer.append(memberName + ";" + memberAge + ";" + hasPaid + ";" + getEmail + ";" + isPassive + ";" + isPartOfStaff);
            writer.append("\n");

            writer.close();

            // Catching all potential errors caught in runtime
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    // Add swimmers to CSV file
    public static void addSwimmerToCsvFile(String memberName, String getEmail, double swimmerTime, String filePath)
    {
        // Wrapping file writer in a try/catch block
        try
        {
            FileWriter writer = new FileWriter(filePath, true);

            writer.append(memberName + ";" + getEmail + ";" + swimmerTime);
            writer.append("\n");

            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    //Made by Lasse
    public static boolean removeLine(String searchTermToRemoveLine, String filePath, int position)
    {
        //Når man kalder denne metode til er fjerne i linje i en csv fil, skal man give den positionen på tingen man vil søge efter det er 'position'
        //man skal give filens 'filePath' og hvad man skal søge efter for at finde den korrekte linje at slette.
        int positionOfTerm = position - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        String currentLine;
        String data[];
        boolean checkForData = false;

        try
        {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader("Resources/MembersList.csv");
            BufferedReader br = new BufferedReader(fr);

            // currentLine is set equal to the next line as long as it's existing
            // If next line doesn't exist, the while loop breaks
            while ((currentLine = br.readLine()) != null)
            {


                // Here, the first line is being added to the file in an array split by ';'
                data = currentLine.split(";");
                if (!(data[positionOfTerm].equalsIgnoreCase(searchTermToRemoveLine)))
                {
                    // Here is being checked that what you want removed is equal to the data saved in the data variable above

                    // If they are not equal to each other, then it's being saved to the new file
                    pw.println(currentLine);
                }
                else
                {
                    checkForData = true;
                }
            }

            // If checkedForData is true, the file has been deleted
            if (checkForData)
            {
                System.out.println("File has been deleted");
            }
            // Else file's not found
            else
            {
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

        }
        // Catch any runtime errors
        catch (Exception e)
        {
            System.out.println("Error");
        }
        return checkForData;
    }

    //Made by Lasse
    // Search data
    public static void searchData(String searchTerm, String filePath)
    {
        boolean found = false;
        String name = "";
        String age = "";
        String hasPaid = "";
        String email = "";
        String isPassive = "";
        String isPartOfStaff = "";

        // Wrapping file writer in a try/catch block
        try
        {
            FileReader writer = new FileReader(filePath);
            Scanner scanner = new Scanner((Readable) writer);

            // This line is to make Java know that files are separated by ';' and after each new line '\n'
            scanner.useDelimiter("[;\n]");


            while (scanner.hasNext() && !found)
            {
                name = scanner.next();
                age = scanner.next();
                hasPaid = scanner.next();
                email = scanner.next();
                isPassive = scanner.next();
                isPartOfStaff = scanner.next();

                if (name.equals(searchTerm) || age.equals(searchTerm) || hasPaid.equals(searchTerm) || email.equals(searchTerm) || isPassive.equals(searchTerm) || isPartOfStaff.equals(searchTerm))
                {
                    System.out.println(name + " " + age + " " + hasPaid + " " + email + " " + isPassive + " " + isPartOfStaff);
                }
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // Edit line
    public static void editLine(String dataToEdit, String newData, String filePath, int position)
    {
        // When calling this method to remove a line from a CSV file, the user has to specify the position of the object the user wishes to search for
        // The file path and search term have to be given in order to find the correct line to remove from the file
        int positionOfTerm = position - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filePath);
        File newFile = new File(tempFile);
        String currentLine;
        String data[];
        boolean checkForData = false;

        try
        {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null)
            {

                // currentLine is set equal to the next line as long as it's existing
                // If next line doesn't exist, the while loop breaks

                // Here, the first line is added to the CSV file split by ';'
                data = currentLine.split(";");


                if (!(data[positionOfTerm].equalsIgnoreCase(dataToEdit)))
                {
                    // Here is being checked if what the user wishes removed equals the data saved in the data variable above

                    // If it is not equal to, then the data is being saved to the new file
                    pw.println(currentLine);
                }
                else
                {
                    data[positionOfTerm] = newData;
                    pw.println(data[0] + ";" + data[1] + ";" + data[2] + ";" + data[3]);
                    checkForData = true;
                }
            }

            if (checkForData)
            {
                System.out.println("File has been edited");
            }
            else
            {
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

        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }


}

