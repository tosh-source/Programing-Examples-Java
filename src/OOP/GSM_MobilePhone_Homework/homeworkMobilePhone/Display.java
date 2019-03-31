package OOP.GSM_MobilePhone_Homework.homeworkMobilePhone;

public class Display {

    private String displaySize;
    private String displayColors;

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getDisplayColors() {
        return displayColors;
    }

    public void setDisplayColors(String displayColors) {
        this.displayColors = displayColors;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        if (getDisplaySize() == null || getDisplaySize().isEmpty()) {
            result.append("There is no display information."
                    + System.lineSeparator());
        } else {
            result.append("DisplaySize: " + this.getDisplaySize()
                    + System.lineSeparator());
        }

        if (getDisplayColors() == null || getDisplayColors().isEmpty()) {
            result.append("There is no display colors information."
                    + System.lineSeparator());
        } else {

        }

        return super.toString();
    }
}
