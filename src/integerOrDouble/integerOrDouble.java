package integerOrDouble;

import java.io.*;
import java.util.*;

public class integerOrDouble {

    public static void main(String[] args) {   //the program show wich entered numbers are ingegers and wich are double

        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        
        System.out.println("Eneter set of numbers");
        while (true) {
            if (input.hasNextInt()) {
                integerArrayList.add(input.nextInt());
            } 
            else if (input.hasNextDouble()) {
                doubleArrayList.add(input.nextDouble());
            } 
            else {
                break;
            }
        }

        System.out.printf("Integers: %s\n", integerArrayList.toString());
        System.out.printf("Double: %s\n", doubleArrayList.toString());
    }
}
