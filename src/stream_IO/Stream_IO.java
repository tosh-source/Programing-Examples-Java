package stream_IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;  //this package is needed for Stream input/output operations
import java.io.UnsupportedEncodingException;

public class Stream_IO {

    //.I File writing (stream out)
    PrintStream streamWriter;
    {
        try {
            streamWriter = new PrintStream("testDoc.txt", "UTF-8");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
