package OOP.abstraction;

import java.util.*;

public class simpleAbstraction {

    public static void main(String[] args) {

        int[] intsArr = new int[]{1, 2, 3, 4, 5};
        String[] stringsArr = new String[]{"AA", "BB", "CC", "DD"};
        List<String> listOfStr = Arrays.asList(stringsArr);

        System.out.println(PrintAnyCollection(Arrays.asList(intsArr)));  //Or pass cloned object --> "Arrays.asList(intsArr.clone())"
        System.out.println(PrintAnyCollection(Arrays.asList(stringsArr)));
        System.out.println(PrintAnyCollection(listOfStr));
    }

    public static <T> String PrintAnyCollection(List<T> collection) {  //Use more abstractive class/interfaces like List<T>, Collection<T>, Collection<? extends T>, Iterable<T> instead of ArrayList<>() and so on. NOTE: "List<T>" in Java is INTERFACE, unlike in C#. C# equivalent is more abstract "IList<T>".

        String result = "";
        for (var currentItem : collection) {
            result += currentItem.toString() + System.lineSeparator();  //Direct using of System.out.println() is not good abstraction practice! So value as string is used instead!
        }
        return result;
    }
}

//Generics in Java --> https://www.geeksforgeeks.org/generics-in-java/
//More about Iterable<T> (IEnumerable<T> in C#) --> https://stackoverflow.com/questions/10664729/whats-the-equivalent-of-c-sharp-ienumerable-in-java-the-covariant-capable-one
//More about "How to convert Collection" --> https://stackoverflow.com/questions/6416706/easy-way-to-convert-iterable-to-collection