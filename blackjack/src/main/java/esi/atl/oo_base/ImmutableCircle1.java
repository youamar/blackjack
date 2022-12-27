/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.oo_base;

/**
 * This is the ImmutableCircle1 class.
 *
 * @author g54915
 */
public final class ImmutableCircle1 {

    private final double radius;
    private final Point center;

    public ImmutableCircle1(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius must be positive,"
                    + "Recevied value :" + radius);
        }
        this.radius = radius;
        this.center = center;
    }

    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public Point getCenter() {
        return center;
    }

    public ImmutableCircle1 scale(double factor) {
        if (factor <= 0) {
            throw new IllegalArgumentException("Scale factor must be positive"
                    + "recevied value:" + factor);
        }
        return new ImmutableCircle1(center, radius * factor);

    }

    @Override
    public String toString() {
        return "Circle: [" + center + "," + radius + "]";
    }

}
