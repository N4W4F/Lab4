public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (height <= 0 || width <= 0)
            throw new IllegalArgumentException("Height and width must be greater than zero.");
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0)
            throw new IllegalArgumentException("Height must be greater than zero.");
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0)
            throw new IllegalArgumentException("Width must be greater than zero.");
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculateCircumference() {
        return 2 * (height + width);
    }

    public String toString() {
        return "Shape Type: Rectangle" +
                "\nRectangle Height: " + getHeight() +
                "\nRectangle Width: " + getWidth() +
                "\nRectangle Area: " + calculateArea() +
                "\nRectangle Perimeter: " + calculateCircumference();
    }
}
