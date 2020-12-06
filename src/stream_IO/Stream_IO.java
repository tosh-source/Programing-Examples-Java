package stream_IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Stream_IO {
    public static void main(String[] args) {

        String filePath = "";
        String fileName = "testDoc.txt";

        //.I File writing (stream output)
        /////////////////////////////////////////////////////////////
        PrintStream streamWriter = null;
            try {
                streamWriter = new PrintStream(filePath + fileName, "UTF-8");

                for (int numbs = 0; numbs <= 350; numbs++) {
                    streamWriter.println(numbs);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } finally {
                if (streamWriter != null) {  //Method invocation 'close' may produce 'NullPointerException', so for that reason "if" statement is needed!
                    streamWriter.close();    //Always close streams!!!
                }
            }
        /////////////////////////////////////////////////////////////

        //II.File reading (stream input)
        /////////////////////////////////////////////////////////////
        File fileForReading = new File(filePath + fileName);
        Scanner scanner = null;
        String textFromFile = "";
        try {
            scanner = new Scanner(fileForReading);

            while (scanner.hasNextLine()){
                textFromFile += scanner.nextLine() + System.lineSeparator();
                //Remove any STRANGE strings from the read file (SEE BELOW).
            }

            System.out.println(textFromFile);

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + "was not found!");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("File " + fileName + "was not found!");
            e.printStackTrace();
        } finally {
            if (scanner != null) {  //Method invocation 'close' may produce 'NullPointerException', so for that reason "if" statement is needed!
                scanner.close();
            }
        }
        /////////////////////////////////////////////////////////////
        //IIa.Remove any STRANGE strings from the read file. **
        //WARNING! Java may read BOM from file and assign as empty ("") string at the beginning of the read file, which is not correct! This regex remove all not ASCII chars!
        //textFromFile = textFromFile.replaceAll("[^\\x00-\\x7F]", "");

        //III.File reading as String
        /////////////////////////////////////////////////////////////
        String readTextAsString = "";
        try {
         readTextAsString = new String(Files.readAllBytes(Paths.get(filePath + fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(readTextAsString);
        /////////////////////////////////////////////////////////////
    }
}

//NOTE: Using try/catch for file operation in Java is suggested by IDEs/compiler!
//more about "Different ways of Reading a text file in Java" --> https://www.geeksforgeeks.org/different-ways-reading-text-file-java/

//** Java - removing strange characters from a String -> https://stackoverflow.com/questions/5462693/java-removing-strange-characters-from-a-string