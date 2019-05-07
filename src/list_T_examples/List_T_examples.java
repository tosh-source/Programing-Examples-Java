package list_T_examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_T_examples {

    public static void main(String[] args) {

        //I. How to use List and ArrayList in java
        //link (1) --> https://www.youtube.com/watch?v=WjGu_DLeagU
        //link (2) --> https://stackoverflow.com/questions/2279030/type-list-vs-type-arraylist-in-java

        //NOTE: List<> is interface, ArrayList<>() is concrete class. the form below is MOST used.
        List<Integer> integerList = new ArrayList<>(); //ArrayList<>() <=> LinkedList<>() //more info on: link (1) & link (2) above, and --> https://docs.oracle.com/javase/tutorial/collections/implementations/list.html
        integerList.add(1);
        integerList.add(32);
        integerList.add(5);

        //The form below (see link (1)) is also allowed, but it is needed only in SPECIAL cases (see link (2) -> third comment).
        ArrayList<Integer> integerList2 = new ArrayList<>();
        integerList2.add(1);
        integerList2.add(32);
        integerList2.add(5);

        System.out.println(integerList + "\n" + integerList2);
        //More info about ArrayList commands/methods --> https://www.w3schools.com/java/java_arraylist.asp



        //II.Join List Collections
        /////////////////////////////////////////
        var listToJoin = new ArrayList<String>();
        listToJoin.add("aaa");
        listToJoin.add("bbb");
        listToJoin.add("ccc");
        listToJoin.add("ddd");

        System.out.println(String.join(" ", listToJoin)); //Note that, to join Lists, we need to join with STRING delimiter (not with Char)!!
        /////////////////////////////////////////

    }
}
