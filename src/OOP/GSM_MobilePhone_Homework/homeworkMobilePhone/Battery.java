package OOP.GSM_MobilePhone_Homework.homeworkMobilePhone;

public class Battery {

    private String batteryModel;
    private Integer hoursIdle;
    private Integer hoursTalk;
    private BatteryType batteryType;

    public String getBatteryModel() {
        return batteryModel;
    }

    public void setBatteryModel(String batteryModel) {
        this.batteryModel = batteryModel;
    }

    public Integer getHoursIdle() {
        return hoursIdle;
    }

    public void setHoursIdle(Integer hoursIdle) {
        this.hoursIdle = hoursIdle;
    }

    public Integer getHoursTalk() {
        return hoursTalk;
    }

    public void setHoursTalk(Integer hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    public BatteryType getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(BatteryType batteryType) {
        this.batteryType = batteryType;
    }

    //Constructors (NOTE: on C# variant of this example, constructors are not needed)
    public Battery(String batteryModel, Integer hoursIdle, Integer hoursTalk, BatteryType batteryType) {
        setBatteryModel(batteryModel);
        setHoursIdle(hoursIdle);
        setHoursTalk(hoursTalk);
        setBatteryType(batteryType);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (getBatteryModel() == null || getBatteryModel().isEmpty()) {
            result.append("There is no battery information."
                    + System.lineSeparator());
        } else {
            result.append("Battery Model: " + this.getBatteryModel()
                    + System.lineSeparator());
        }

        if (getHoursIdle().equals(0)) {
            result.append("There is no information about \"Idle Hours\"."
                    + System.lineSeparator());
        } else {
            result.append("\"Idle Hours\": " + this.getHoursIdle()
                    + System.lineSeparator());
        }

        if (getHoursTalk().equals(0)) {
            result.append("There is no information about \"Talk Hours\"."
                    + System.lineSeparator());
        } else {
            result.append("\"Talk Hours\": " + this.getHoursTalk()
                    + System.lineSeparator());
        }

        if (getBatteryType().equals(BatteryType.NotDefined)) {
            result.append("Battery type is not defined.");
        } else {
            result.append("BatteryType: " + this.getBatteryType());
        }

        return result.toString();
    }
}
