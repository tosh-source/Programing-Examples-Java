package stream_IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;  //this package is needed for Stream input/output operations
import java.io.UnsupportedEncodingException;

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

    }
}
