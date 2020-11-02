package OOP.abstraction;

import java.util.Arrays;
import java.util.List;

public class simpleAbstraction {

    public static void main(String[] args) {

        int[] intsArr = new int[]{1, 2, 3, 4, 5};
        String[] stringsArr = new String[]{"AA", "BB", "CC", "DD"};
        List<String> listOfStr = Arrays.asList(stringsArr);

        //System.out.println(PrintAnyCollection(intsArr));
    }

    public static  <T> String PrintAnyCollection(Iterable<T> collection) {

        String result = "";
        for (T currentItem : collection) {
            result += currentItem + System.lineSeparator();
        }

        return result;
    }
}

//More about Iterable<T> (IEnumerable<T> in C#) --> https://stackoverflow.com/questions/10664729/whats-the-equivalent-of-c-sharp-ienumerable-in-java-the-covariant-capable-one
