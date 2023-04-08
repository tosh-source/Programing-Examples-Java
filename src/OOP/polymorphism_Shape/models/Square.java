package OOP.polymorphism_Shape.models;

public class Square implements IShape {

    private double height;

    public Square(double height) {
        this.setHeight(height);
    }

    @Override
    public Double getWidth() throws NoSuchMethodException {
        throw new NoSuchMethodException("This getter is needed because of interface implementation, but never used!");
    }

    @Override
    public void setWidth(Double value) throws NoSuchMethodException {
        throw new NoSuchMethodException("This setter is needed because of interface implementation, but never used!");
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
        return getHeight() * getHeight();
    }
}
