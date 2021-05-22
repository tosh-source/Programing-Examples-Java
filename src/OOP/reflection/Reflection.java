package OOP.reflection;

import OOP.myCat.Cat;

import java.lang.reflect.Field;

public class Reflection {

    public static final String newLine = System.lineSeparator();

    public static void main(String[] args) throws IllegalAccessException {  //IllegalAccessException is needed when use get() method! **
        //Reflection is possibility to get types, methods, properties from some kind of object at runtime.

        //1.Use Reflection for INSTANCE of unknown class.
        var cat = new Cat("Gosho", "White");

        System.out.println("Type: " + cat.getClass().getSimpleName() + newLine); // **

        var objFields = cat.getClass().getFields();  //If fields are PRIVATE, will show nothing!
        objFields = cat.getClass().getDeclaredFields();     //Since in most cases fields are with private modifiers "cat.getClass().getFields()" will not work (unless they are public). So ".getDeclaredFields()" is used instead!

        for (var field : objFields) {
            field.setAccessible(true);  //Since in most cases fields are with private modifiers we need to set them accessible! NOTE: An exception WILL be thrown if fields can't be accessed!

            System.out.println("Private fields: "
                    + field.getName() + ": "
                    + field.get(cat));  //To use get() we need to add exception to current main method** or surround with try/catch block!
        }

    }
}

// https://www.geeksforgeeks.org/reflection-in-java/
//getCanonicalName(), getSimpleName() and getName() in Java -> https://stackoverflow.com/questions/15202997/what-is-the-difference-between-canonical-name-simple-name-and-class-name-in-jav
