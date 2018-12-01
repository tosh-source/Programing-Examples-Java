package OOP.carShop;

import OOP.carShop.CarShopClasses.CarModels;
import OOP.carShop.CarShopClasses.Customer;

import java.text.MessageFormat;

public class ProgramStart {

    public static void main(String[] args) {

        //First customer
        Customer customerIvan = new Customer();
        customerIvan.setFirstName("Ivan");
        customerIvan.setLastName("Ivanov");
        customerIvan.setAge(23);
        CarModels currentCarForSell = CarModels.BMV;
        customerIvan.setCustomerCarModel(currentCarForSell.toString());

        Print(customerIvan.getFirstName(), customerIvan.getLastName(), customerIvan.getAge(), customerIvan.getCustomerCarModel());

        //Second customer
        Customer customerSlavi = new Customer("Slavi", "Hristov", 19, CarModels.Ferrari.toString());
        Print(customerSlavi.getFirstName(), customerSlavi.getLastName(), customerSlavi.getAge(), customerSlavi.getCustomerCarModel());

        //Third customer
        Customer customerBlago = new Customer("Blago", "Georgiev", CarModels.Honda.toString());  //using of optional parameters to select "customerCarModel" and skip "Age" value
        Print(customerBlago.getFirstName(), customerBlago.getLastName(), customerBlago.getAge(), customerBlago.getCustomerCarModel());


        //BONUS
        //All customer as one (create array of our object)
        Customer[] customers = new Customer[] {customerBlago, customerSlavi, customerIvan};

        for (Customer customer : customers) {
            System.out.println();
            Print(customer.getFirstName(), customer.getLastName(), customer.getAge(), customer.getCustomerCarModel());
        }
    }

    static void Print(String FirstName, String LastName, int Age, String CustomerCarModel) {

        System.out.println(FirstName + " "
                         + LastName
                         + MessageFormat.format(", Age: {0}, Buy car: {1}", Age, CustomerCarModel));
    }
}
