public class Circle extends Shape {

    private double radius;

    public Circle (double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException("Radius must be greater than zero.");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException("Radius must be greater than zero.");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * (radius * radius);
    }

    @Override
    public double calculateCircumference() {
        return 2 * 3.14 * radius;
    }

    public String toString() {
        return "Shape Type: Circle" +
                "\nCircle Radius: " + getRadius() +
                "\nCircle Area: " + calculateArea() +
                "\nCircle Perimeter: " + calculateCircumference();
    }
}
