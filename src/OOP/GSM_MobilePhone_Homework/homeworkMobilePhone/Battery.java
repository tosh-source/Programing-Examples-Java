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


}
