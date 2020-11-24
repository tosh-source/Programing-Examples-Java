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
                streamWriter.close();  //Always close streams!!!
            }
        /////////////////////////////////////////////////////////////

        //II.File reading (stream input)
        /////////////////////////////////////////////////////////////
        File fileForReading = new File(filePath + fileName);
        Scanner scanner = null;
        try {
            scanner = new Scanner(fileForReading);

            String textFromFile = "";
            while (scanner.hasNextLine()){
                textFromFile += scanner.nextLine() + System.lineSeparator();
            }

            System.out.println(textFromFile);

        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + "was not found!");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("File " + fileName + "was not found!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
        /////////////////////////////////////////////////////////////

        //IIa.File reading as String
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
