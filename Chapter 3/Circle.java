// Circle.java

public class Circle {
    private static double radius;
    private static double diameter;
    private static double area;

    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public static double getRadius() {
        return radius;
    }

    public static double getDiameter() {
        return diameter;
    }

    public static double getArea() {
        return area;
    }
}

