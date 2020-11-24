package stream_IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;  //this package is needed for Stream input/output operations
import java.io.UnsupportedEncodingException;

public class Stream_IO {
    public static void main(String[] args) {

        String filePath = "";
        String fileName = "testDoc.txt";

        //.I File writing (stream out)
        /////////////////////////////////////////////////////////////
        PrintStream streamWriter;
        {
            try {
                streamWriter = new PrintStream(filePath + fileName, "UTF-8");

                for (int numbs = 0; numbs <= 350; numbs++) {
                    streamWriter.println(numbs);
                }

                streamWriter.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        /////////////////////////////////////////////////////////////

    }
}
