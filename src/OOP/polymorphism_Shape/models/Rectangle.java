package OOP.polymorphism_Shape.models;

public class Rectangle implements IShape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    @Override
    public Double getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(Double value) {
        this.width = value;
    }

    @Override
    public Double getHeight() {
        return this.height;
    }

    @Override
    public void setHeight(Double value) {
        this.height = value;
    }

    @Override
    public double calculateSurface() {
        return getWidth() * getHeight();
    }
}
