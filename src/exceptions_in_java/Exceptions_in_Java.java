package exceptions_in_java;

import java.io.*;
import java.util.*;

public class Exceptions_in_Java {

    public static void main(String[] args) {

        //1.Found errors in reading files (not finding file error and other)
        File fileForReading = new File("testDoc.txt");
        try {
            Scanner reader = new Scanner(fileForReading, "UTF-8");

            StringBuilder textFromFile = new StringBuilder();
            while (reader.hasNextLine()) {
                textFromFile.append(reader.nextLine() + "\n");  //<- "\n" is needed, because ".nextLine()" just read text, line by line, but SKIP symbol for new line!
            }

            System.out.println(textFromFile);
            reader.close();
        } 
        catch (FileNotFoundException notFoundEx) {
            //if file not found, just output
            System.out.printf("The file with name: \"%s\" is NOT found!!!\n", fileForReading);
        } 
        catch (IOException IOEx) {
            //information for other Input/Output errors
            System.out.println(IOEx.getMessage() + "\n" + Arrays.toString(IOEx.getStackTrace()));
        } 
        //1a.If we want to STOP our program
        catch(Exception ex) {
            System.out.printf("Unhandled exception! %s", Arrays.toString(ex.getStackTrace()));
            System.exit(0);  //<- this is a way stop program immediately
        }
        
    }
}
