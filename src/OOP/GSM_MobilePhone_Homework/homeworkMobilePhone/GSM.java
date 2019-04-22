package OOP.GSM_MobilePhone_Homework.homeworkMobilePhone;

import java.util.ArrayList;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GSM {

    //Fields
    private static GSM iPhone4S;
    private String model;
    private String manufacturer;
    private String price;
    private String owner;
    private Battery batterySpec;
    private Display displaySpec;
    private ArrayList<Call> callHistory;

    //Properties
    public static GSM getiPhone4S() {
        return iPhone4S;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {

        if (manufacturer == null || manufacturer.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.manufacturer = manufacturer;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {

        if (price == null) {  //this is only to prevent "NullPointerException"

        } else {

            Pattern pattern = Pattern.compile("\\d");
            Matcher isMatch = pattern.matcher(price);

            if (!(isMatch.find())) {  //check if there is no digit
                throw new IllegalArgumentException();
            }
        }

        this.price = price;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {

        if (owner == null) {  //this is only to prevent "NullPointerException"

        }
        else if (owner.isEmpty()) {
            throw new IllegalArgumentException();
        }

        this.owner = owner;
    }

    public Battery getBatterySpec() {
        return batterySpec;
    }

    public void setBatterySpec(Battery batterySpec) {
        this.batterySpec = batterySpec;
    }

    public Display getDisplaySpec() {
        return displaySpec;
    }

    public void setDisplaySpec(Display displaySpec) {
        this.displaySpec = displaySpec;
    }

    public ArrayList<Call> getCallHistory() {
        return new ArrayList<>(this.callHistory);
    }

    public void setCallHistory(ArrayList<Call> callHistory) {

        if (this.callHistory == null) {
            this.callHistory = new ArrayList<>();
        }

        this.callHistory.clear();
        this.callHistory = callHistory;
    }

    //Constructors

    static {   //Static initialization block for for IPhone4S field & property.


    }   //NOTE: Java not allow a "static constructors", "static initialization block" is use instead!
    //URL: https://softwareengineering.stackexchange.com/questions/228242/working-with-static-constructor-in-java


    //Methods
    public static void main(String[] args) {

    }

}
