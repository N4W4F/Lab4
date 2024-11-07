public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        if (height <= 0 || base <= 0)
            throw new IllegalArgumentException("Height and base must be greater than zero.");
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException("Height must be greater than zero.");
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0)
            throw new IllegalArgumentException("Base must be greater than zero.");
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (height * base) / 2;
    }

    @Override
    public double calculateCircumference() {
        return 3 * base;
    }

    public String toString() {
        return "Shape Type: Equilateral Triangle" +
                "\nTriangle Height: " + getHeight() +
                "\nTriangle Base: " + getBase() +
                "\nTriangle Area: " + calculateArea() +
                "\nTriangle Perimeter: " + calculateCircumference();
    }
}
