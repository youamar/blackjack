package esi.atl.oo_inheritance;

public class TestPoints {
    
    public static void main(String[] args) {
        ColoredPoint p = new ColoredPoint(2, 4, 0xFF0000FF);
        p.move(1, 2);
        System.out.println(p);
        System.out.println("x: " + p.getX());
        System.out.println("color : " + String.format("%08X", p.getColor()));
    }
}