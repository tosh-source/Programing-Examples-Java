package lambdaExpression_LINQ;

import java.util.Collections;

public class lambdaExpression_LINQ {

    public static void main(String[] args) {

        //Create 'N' elements of empty strings and convert .toArray()
        int elements = 4;
        ///////////////////////////////////////////////////////////
        var result = (Collections.nCopies(elements, "value"))
                .stream().toArray(String[]::new);
        ///////////////////////////////////////////////////////////
        System.out.println(String.join(System.lineSeparator(), result));

    }
}

//orderedCall.forEach(call -> System.out.println(call));  //print with lambda expression

//How to Get the Last Element of a Stream in Java? -> https://www.baeldung.com/java-stream-last-element
