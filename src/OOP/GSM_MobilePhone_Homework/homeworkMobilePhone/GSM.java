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

        } else if (owner.isEmpty()) {
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

    public void setCallHistory(ArrayList<Call> callHistory) {   //ADD COMMENT FROM C# EXAMPLE

        if (this.callHistory == null) {
            this.callHistory = new ArrayList<>();
        }

        this.callHistory.clear();
        this.callHistory = callHistory;
    }

    //Constructors
    static {   //Static initialization block for for IPhone4S field & property.
        iPhone4S = new GSM("IPhone 4S", "Apple", "500$", "Me",
                new Battery("Apple 1430 mAh battery", 200, 8, BatteryType.LiIon),
                new Display("3.5-inch (diagonal) Multi-Touch display", "16M"));

    }
    //NOTE: Java not allow a "static constructors", "static initialization block" is use instead!
    //URL: https://softwareengineering.stackexchange.com/questions/228242/working-with-static-constructor-in-java

    public GSM(String model, String manufacturer) {
        this(model, manufacturer, null, null, null, null);
    }

    public GSM(String model, String manufacturer, String price, String owner, Battery batterySpec, Display displaySpec) {
        this.setModel(model);
        this.setManufacturer(manufacturer);
        this.setPrice(price);
        this.setOwner(owner);
        this.setBatterySpec(batterySpec);
        this.setDisplaySpec(displaySpec);
        this.setCallHistory(new ArrayList<Call>());  //The List of objects (List<Call>) can NOT be null, so we need to initialize it here.
    }

    //Methods
    public static void main(String[] args) {

    }

    public void AddCalls(Call... calls) {  //Adding information to CallHistory
        for (var call : calls) {
            this.callHistory.add(call);
        }
    }

    public void DeleteCalls(String numberForDeleting) {
        Call tempCall = new Call();
        tempCall.setDialedPhoneNumber(numberForDeleting);

        boolean isMatch = false;

        for (int index = 0; index < this.callHistory.size(); index++) {
            isMatch = this.callHistory.get(index).getDialedPhoneNumber().equals(tempCall.getDialedPhoneNumber());

            if (isMatch == true) {
                this.callHistory.remove(this.callHistory.get(index));
            }
        }
    }

    public void ClearCallHistory() {  //Clear CallHistory information
        this.callHistory.clear();
    }


    //Override methods
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("Model: " + this.getModel() + System.lineSeparator());
        result.append("Manufacturer: " + this.getManufacturer() + System.lineSeparator());
        result.append("Price: " + this.getPrice() + System.lineSeparator());
        result.append("Owner: " + this.getOwner() + System.lineSeparator());
        result.append("Battery Specification: " + this.getBatterySpec() + System.lineSeparator());
        result.append("Display Specification: " + this.getDisplaySpec() + System.lineSeparator());
        result.append("Call history information: " + this.getCallHistory() + System.lineSeparator());  //As opposed to C# variant, here in Java equivalent to "string.Join()" is NOT needed to iterate and print the current object!

        return result.toString();
    }
}
