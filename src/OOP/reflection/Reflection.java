package OOP.reflection;

import OOP.myCat.Cat;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

    public static final String newLine = System.lineSeparator();

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException {  //Needed exception: IllegalAccessException to use get()** , NoSuchMethodException to use .getMethod()***
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

        System.out.println();
        System.out.println("GetMethod: " + cat.getClass().getMethod("sayMiauuu"));  //To use .getMethod() we need to add exception to current main method*** or surround with try/catch block!
        System.out.println("GetProperty: " + cat.getClass().getMethod("getColor").getName());

        //2.Use Reflection for unknown class.
        var objMethods = Cat.class.getMethods();

        System.out.println(newLine
                + "Class "
                + Cat.class.getSimpleName()  //Or use getName()
                + " have: ");
        for (Method currentMethod : objMethods) {
            System.out.println("Method Name: " + currentMethod.getName());
        }
    }
}

// https://www.geeksforgeeks.org/reflection-in-java/
//getCanonicalName(), getSimpleName() and getName() in Java -> https://stackoverflow.com/questions/15202997/what-is-the-difference-between-canonical-name-simple-name-and-class-name-in-jav
//Java reflection how to get field value from an object, not knowing its class -> https://stackoverflow.com/questions/16171637/java-reflection-how-to-get-field-value-from-an-object-not-knowing-its-class/16172206

