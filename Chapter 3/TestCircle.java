// TestCircle.java

public class TestCircle {
    public static void main(String[] args) {
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();

        Circle.setRadius(3);

        System.out.println("Circle a:");
        System.out.println("Radius of the first circle: " + Circle.getRadius());
        System.out.println("Diameter of the first circle: " + Circle.getDiameter());
        System.out.println("Area of the first circle: " + Circle.getArea());

        Circle.setRadius(20);

        System.out.println("\nCircle b:");
        System.out.println("Radius of the second circle: " + Circle.getRadius());
        System.out.println("Diameter of the second circle: " + Circle.getDiameter());
        System.out.println("Area of the second circle: " + Circle.getArea());
    }
}
