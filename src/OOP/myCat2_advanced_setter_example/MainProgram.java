package OOP.myCat2_advanced_setter_example;

public class MainProgram {

    public static void main(String[] args) {

        Cat firstCat = new Cat("Tony", 3);
        System.out.printf("First cat: %s is on: %d years \n", firstCat.getName(), firstCat.getAge());

        Cat secondCat = new Cat("Ivan", -1);  //<- This will NOT throw Exception, which is wrong! Cat can not be at age "-1"! 
        System.out.printf("Second cat: %s is on: %d years \n", secondCat.getName(), secondCat.getAge());

        Cat thirdCat = new Cat(null, 2); //<- This will throw Exception, which IS correct! <- BETTER practice!
        System.out.printf("Third cat: %s is on: %d years \n", thirdCat.getName(), thirdCat.getAge());
    }
}
