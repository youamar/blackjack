package esi.atl.oo_base;

public class Circle {

    private double radius;
    private Point center;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("radius must be positive"
                    + ", received: " + radius);
        }
        this.radius = radius;
        this.center = center;
    }

    public void move(double dx, double dy) {
        center.move(dx, dy);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public Point getCenter() {
        return center;
    }

    public void scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive"
                    + ", received: " + factor);
        }
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle : [" + center + ", " + radius + "]";
    }
}

class TestCircle {

    public static void main(String args[]) {
        Point p = new Point();
        Circle c = new Circle(p, 5);
        System.out.println(c);
        c.move(2, 5);
        System.out.println(c);
        c.scale(2);
        System.out.println(c);
    }
}

class TestDefensiveCopy {

    public static void main(String args[]) {
        Point p = new Point();
        Circle c = new Circle(p, 5);
        System.out.println(c);
        p.move(2, 5); //on bouge le point et non pas le cercle.
        System.out.println(c);
        Point p2 = c.getCenter();
        p2.move(-2, -5);
        System.out.println(c);
    }
}
