package OOP.objectsTricks;

public class objectsTricks {

    public static void main(String[] args) {

        //I.Clone referral objects in Java
        String[] firstStrArr = new String[3];
        firstStrArr[0] = "aaa";
        firstStrArr[1] = "bbb";
        firstStrArr[2] = "ccc";

        String[] clonedStrArr = firstStrArr.clone();
        clonedStrArr[1] = "XXX";

        System.out.println(clonedStrArr[1]);
        System.out.println(firstStrArr[1]);

        //Ia.Clone primitive type objects in Java
        Integer[] integers = new Integer[3];
        integers[0] = 222;
        integers[1] = 555;
        integers[2] = 999;

        Integer[] cloneOfIntegers = integers.clone();
        cloneOfIntegers[1] = 111;

        System.out.println("\n" + integers[1]);
        System.out.println(cloneOfIntegers[1]);


        int[] ints = new int[3];
        ints[0] = 222;
        ints[1] = 555;
        ints[2] = 999;

        int[] cloneOfInts = ints.clone();
        cloneOfInts[1] = 111;

        System.out.println("\n" + ints[1]);
        System.out.println(cloneOfInts[1]);

        //more info about object cloning -> https://www.geeksforgeeks.org/clone-method-in-java-2/

    }
}
