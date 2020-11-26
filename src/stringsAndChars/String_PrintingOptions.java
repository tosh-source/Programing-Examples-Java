package stringsAndChars;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;

public class String_PrintingOptions {

    public static void main(String[] args) {

        String inputAsStr = "123NUMBER11";
        for (int i = 0; i < inputAsStr.length(); i++) {
            if (Character.isDigit(inputAsStr.charAt(i))) //stringInstance.charAt(int index) <- return defined char from string
            {
                System.out.printf("%s: Is Digit!\n", inputAsStr.charAt(i));
            }
        }
        char[] getAllchars = inputAsStr.toCharArray();  //Convert String to Char[]

        //Repeated Strings (String.join()) //Повтарящи се Символи
        //Синтаксиса, по-долу, отпечатва 15 звездички '*'. Тя може да бъде заменена с всичко др.,което преценим, намиращо се в уникодската таблица.
        ////////////////////////////////////////
        System.out.println(String.join(" ", Collections.nCopies(15, "*"))); // need from: -> import java.util.*;
        System.out.println(new String(new char[15]).replace("\0", "* "));   //NO need to import any packages.
        ////////////////////////////////////////
        //-> https://www.geeksforgeeks.org/java-string-join-examples/
        //-> https://beginnersbook.com/2017/10/java-string-join-method/
        // For more info, How to Join String Collection see: List_T_examples > II.Join List Collections

        //Another String.join() alternatives..
        //a) with String.join()///////////////
        System.out.println(String.join("-", "My", "name", "is."));
        //////////////////////////////////////

        //b) with StringJoiner////////////////
        //-> http://docs.oracle.com/javase/8/docs/api/java/util/StringJoiner.html
        StringJoiner joiner = new StringJoiner("-");
        joiner.add("My");
        joiner.add("name");
        joiner.add("is.");

        String joinedStr = joiner.toString();
        System.out.println(joinedStr);
        //////////////////////////////////////


        //Replace strings
        String myString = "aaabbbccc";
        System.out.println(myString.replace('b', '*'));

        //Revers string
        String someText = "some text here";
        ///////////////////////////////////////
        StringBuilder sb = new StringBuilder();
        sb.append(someText).reverse();
        ///////////////////////////////////////
        System.out.println(sb.toString());

        //Input set of values (input text)
        System.out.print("Enter some text here: ");
        ///////////////////////////////////////
        Scanner input = new Scanner(System.in);
        String inputAsString = input.next();
        ///////////////////////////////////////
        System.out.println(inputAsString);

        //Check Null or Empty String
        String myStr = "";
        System.out.println("Is my string empty: " + myStr.isEmpty()); //check null or empty string -> if(str != null && !str.isEmpty())

        //Formatted Strings
        String name = "Gosho";
        int age = 18;
        //
        //Standart Java "formatted Strings"
        /////////////////////////////
        System.out.printf("My name is %s, I'm %d years old..\n", name, age);
        /////////////////////////////
        //
        //With "place holders" (like C#), using "MessageFormat.format()" method.
        /////////////////////////////
        System.out.println(MessageFormat.format("My name is {0}, I''m {1} years old..", name, age));
        /////////////////////////////
        //In method "MessageFormat.format()" if need to display: " I'm " , then we need to add an ONE extra apostrophe: " I''m " , because an apostrophe (aka single quote) in a "MessageFormat" pattern starts a quoted string and is NOT interpreted on its own.
        //for more info, visit -> https://stackoverflow.com/questions/17569608/format-a-message-using-messageformat-format-in-java
        //or Javadoc "MessageFormat.format()" -> http://docs.oracle.com/javase/7/docs/api/java/text/MessageFormat.html

    }

}
