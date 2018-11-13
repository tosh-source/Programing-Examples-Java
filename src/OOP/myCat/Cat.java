package OOP.myCat;

public class Cat {

    //field
    private String name;
    //field
    private String color;

    //Getter of the property "Name"
    public String getName() {
        return this.name;
    }
    //Setter of the property "Name"
    public void setName(String name) {
        this.name = name;
    }

    //Getter of the property "Color"
    public String getColor() {
        return this.color;
    }
    //Setter of the property "Color"
    public void setColor(String color) {
        this.color = color;
    }

    //Constructor - Default constructor
    public Cat() {
        this.name = "Unnamed";
        this.color = "gray";
    }
    //Constructor with parameters
    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    //Method Miauuu
    public void sayMiauuu() {
        System.out.printf("%s said: Miauuuuuuuu!\n", name);
    }

    public static void main(String[] args) {
        Cat myFirstCat = new Cat();
        myFirstCat.name = "Tony";
        System.out.printf("Cat %s is %s.\n", myFirstCat.name, myFirstCat.color);
        myFirstCat.sayMiauuu();

        Cat mySecondCat = new Cat("Pepy", "red");
        mySecondCat.sayMiauuu();
        System.out.printf("Cat %s is %s.\n", mySecondCat.name, mySecondCat.color);

        Cat thirdCat = new Cat();
        thirdCat.name = "Alfred";
        System.out.printf("The name of my third cat is %s.\n", thirdCat.name);
        thirdCat.sayMiauuu();

    }
}
