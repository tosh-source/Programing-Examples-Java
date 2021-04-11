package stringsAndChars;

import java.util.StringJoiner;

public class String_Joiner {

    public static void main(String[] args) {

        var intArray = new Integer[]{11, 23, 43, 65, 28};
        var strArray = new String[]{"abc", "DDD", "ABC", "FF"};

        //Declare StringJoiner.
        var strJoiner = new StringJoiner("-", "[", "]");
        //EmptyValue message.
        strJoiner.setEmptyValue("There is NO value!");  //Good practice is to set message if there is no value in StringJoiner.
        System.out.print(strJoiner);

        //Add elements form int array.
        for (var currentInt : intArray) {
            strJoiner.add(currentInt.toString());
        }
        System.out.print("\n" + strJoiner);

        //Add elements from string array.
        for (var currentStr : strArray) {
            strJoiner.add(currentStr);
        }
        System.out.println("\n" + strJoiner);
    }
}
