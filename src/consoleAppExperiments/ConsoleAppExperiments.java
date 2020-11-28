package consoleAppExperiments;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.math.*;
import java.util.*;
import java.text.*;
import java.util.regex.*;

public class ConsoleAppExperiments {

    public static void main(String[] args) {

        String str = "ONE-string-SECOND-string-";
        String[] splittedStr = str.split("ONE|SECOND");
        System.out.println(String.join("\n", splittedStr));

        for (String item : splittedStr) {
            if (item.isBlank()){  //.isBlank() check for empty strings and whitespaces, unlike .isEmpty() who looking for empty strings only!

            }
        }
    }
}
