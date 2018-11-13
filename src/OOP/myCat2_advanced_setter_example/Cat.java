package OOP.myCat2_advanced_setter_example;

public class Cat {

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    private void setName(String value) {  //Setter should be "private" to guarantee that set of a cat name use ONLY setter "setName"! <- BETTER practice!
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Invalid cat's name!!!");
        }
        this.name = value;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int value) { //In normal structure of setter (with "public" access), value can be parsed in Constructor and SKIP all code here! <- WRONG practice!
        if (value <= 0) {
            throw new IllegalArgumentException("Invalid cat's year!!!");
        }
        this.age = value;
    }

    public Cat(String name, int age) {
        this.setName(name); //Use this structure of code to guarantee that set of a cat name use ONLY setter "setName"! <- BETTER practice!
        this.age = age;     //In normal structure of Constructor(and setter) value will be parsed here! <- WRONG practice!
    }
}
