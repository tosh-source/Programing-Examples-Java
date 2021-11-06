package OOP.abstraction;

import java.util.*;

public class simpleAbstraction {

    public static void main(String[] args) {

        Integer[] intsArr = new Integer[]{1, 2, 3, 4, 5};  //Why is better to use Integer[] instead of int[]*
        String[] stringsArr = new String[]{"AA", "BB", "CC", "DD"};
        List<String> listOfStr = Arrays.asList(stringsArr);

        System.out.println(PrintAnyCollection(Arrays.asList(intsArr)));  //Or pass cloned object --> "Arrays.asList(intsArr.clone())"
        System.out.println(PrintAnyCollection(Arrays.asList(stringsArr)));
        System.out.println(PrintAnyCollection(listOfStr));
    }

    public static <T> String PrintAnyCollection(List<T> collection) {  //Use more abstractive class/interfaces like List<T> or AbstractCollection<T>**, Collection<T>, Collection<? extends T>, Iterable<T> instead of ArrayList<>() and so on. NOTE: "List<T>" in Java is INTERFACE, unlike in C#. C# equivalent is more abstract "IList<T>".

        String result = "";
        for (var currentItem : collection) {
            result += currentItem.toString() + System.lineSeparator();  //Direct using of System.out.println() is not good abstraction practice! So value as string is used instead!
        }
        return result;
    }
}

//Why is better to use Integer[] instead of int[] --> If we use int[] instead of Integer[] to convert to List we get only FIRST element (one dimension array). There's no such thing as a List<int> in Java - generics don't support primitives. Autoboxing only happens for a single element, not for arrays of primitives.
// --> https://stackoverflow.com/questions/1467913/arrays-aslist-not-working-as-it-should

//Generics in Java --> https://www.geeksforgeeks.org/generics-in-java/
//How to use Class<T> in Java? --> https://stackoverflow.com/questions/462297/how-to-use-classt-in-java
//** Class AbstractCollection<T> provides a skeletal implementation of the Collection interface. --> https://docs.oracle.com/javase/7/docs/api/java/util/AbstractCollection.html
//More about Iterable<T> (IEnumerable<T> in C#) --> https://stackoverflow.com/questions/10664729/whats-the-equivalent-of-c-sharp-ienumerable-in-java-the-covariant-capable-one
//More about "How to convert Collection" --> https://stackoverflow.com/questions/6416706/easy-way-to-convert-iterable-to-collection
