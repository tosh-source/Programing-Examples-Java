package OOP.polymorphism_Shape.models;

public interface IShape {

    Double getWidth() throws NoSuchMethodException;
    void setWidth(Double value) throws NoSuchMethodException;

    Double getHeight();
    void setHeight(Double value);

    double calculateSurface();
}
