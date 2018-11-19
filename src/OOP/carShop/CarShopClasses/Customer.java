package OOP.carShop.CarShopClasses;

public class Customer {

    //fields
    private String firstName;
    private String lastName;
    private int age;
    private String customerCarModel;
    private static String aboutCustomer;

    //Getter of the property "FirstName"
    public String getFirstName() {
        return this.firstName;
    }
    //Setter of the property "FirstName"
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //Getter of the property "LastName"
    public String getLastName() {
        return this.lastName;
    }
    //Setter of the property "LastName"
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Getter of the property "Age"
    public int getAge() {
        return this.age;
    }
    //Setter of the property "Age"
    public void setAge(int age) {
        this.age = age;
    }

    //Getter of the property "CustomerCarModel"
    public String getCustomerCarModel() {
        return this.customerCarModel;
    }
    //Setter of the property "CustomerCarModel"
    public void setCustomerCarModel(String customerCarModel) {
        this.customerCarModel = customerCarModel;
    }

    //Getter of the property "AboutCustomer"
    public static String getAboutCustomer() {
        aboutCustomer = "Information about all CarShop customers";
        return aboutCustomer;
    }

    //Default Constructor
    public Customer() {
        //TO DO
    }
}
