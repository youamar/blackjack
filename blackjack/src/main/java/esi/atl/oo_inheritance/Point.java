package esi.atl.oo_inheritance;

public class Point implements Movable {

    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() { return x; }
    public double getY() { return y; }
    
    public Point move(double dx, double dy) {
        x += dx;
        y += dy;
        return this;
    }
    
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}