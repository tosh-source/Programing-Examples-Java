package OOP.reflection;

import OOP.myCat.Cat;

import java.lang.reflect.Field;

public class Reflection {

    public static final String newLine = System.lineSeparator();

    public static void main(String[] args) {
        //Reflection is possibility to get types, methods, properties from some kind of object at runtime.

        //1.Use Reflection for INSTANCE of unknown class.
        var cat = new Cat("Gosho", "White");

        System.out.println("Type: " + cat.getClass().getSimpleName() + newLine); // **

        var objFields = cat.getClass().getFields();  //If fields are PRIVATE, will show nothing!
        objFields = cat.getClass().getDeclaredFields();     //Since in most cases fields are with private modifiers "cat.getClass().getFields()" will not work (unless they are public). So ".getDeclaredFields()" is used instead!

        for (var property : objFields) {
            System.out.println("Private fields: "
                    + property.getName());
        }

    }
}

// https://www.geeksforgeeks.org/reflection-in-java/
//getCanonicalName(), getSimpleName() and getName() in Java -> https://stackoverflow.com/questions/15202997/what-is-the-difference-between-canonical-name-simple-name-and-class-name-in-jav
