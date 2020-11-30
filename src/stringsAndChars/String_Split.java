package stringsAndChars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_Split {

    public static void main(String[] args) {

        //Split string by criteria.
        //Use Regular expression OR "|" , to split text and catch many strings. Example --> "ONE|SECOND"
        //////////////////////////////////////////////////////////
        String str = "ONE-string-SECOND-string-";
        String[] splittedStr = str.split("ONE|SECOND");  //.split() method always expect REGEX! **
        System.out.println(String.join(" / ", splittedStr));
        //////////////////////////////////////////////////////////

        //Remove empty strings and whitespaces from results.
        //////////////////////////////////////////////////////////
        var tempVal = new ArrayList<>();
        for (String item : splittedStr) {
            if (item.isBlank()){  //.isBlank() check for empty strings and whitespaces ***
                //just skip current string
            } else {
                tempVal.add(item);
            }
        }
        splittedStr = tempVal.toArray(splittedStr);
        //////////////////////////////////////////////////////////
        System.out.println(String.join(" / ", splittedStr));  //NOTE: "null" may by print in console. This is bug in "join" method! In splitted string, there is no "null" as result!

        //Split by whitespace
        String text = "myString notMyStr    THIRD";
        String[] splitStr = text.split(" ");  //or replace with more correct regex symbol: "\s" --> whitespace character: [ \t\n\x0B\f\r] **
        System.out.println(String.join("\n", splitStr));
    }
}

//** regular-expression constructs -> https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html#sum
//** Split() String method in Java with examples -> https://www.geeksforgeeks.org/split-string-java-examples/
//** Use String.split() with multiple delimiters -> https://stackoverflow.com/questions/5993779/use-string-split-with-multiple-delimiters

//*** .isBlank() check for empty strings and whitespaces, unlike .isEmpty() who looking for empty strings only!
//*** more info -> https://stackoverflow.com/questions/23419087/stringutils-isblank-vs-string-isempty
