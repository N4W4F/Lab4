public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(7.5);
            Circle c2 = new Circle(-3);
            displayShape(c1);
            displayShape(c2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Circle: " + e.getMessage());
        }

        try {
            Rectangle r1 = new Rectangle(5, 5);
            Rectangle r2 = new Rectangle(4, -8);
            displayShape(r1);
            displayShape(r2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Rectangle: " + e.getMessage());
        }

        try {
            Triangle t1 = new Triangle(6, 8);
            Triangle t2 = new Triangle(8.5, -10);
            displayShape(t1);
            displayShape(t2);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Triangle: " + e.getMessage());
        }

        Circle c3 = new Circle(1);
        c3.setRadius(10);
        displayShape(c3);

        Rectangle r3 = new Rectangle(1, 1);
        r3.setHeight(10);
        r3.setWidth(20);
        displayShape(r3);

        Triangle t3 = new Triangle(1, 1);
        t3.setBase(10);
        t3.setHeight(10);
    }

    public static void displayShape(Shape shape) {
        System.out.println(shape.toString());
        System.out.println("-----------------------------");
    }
}
