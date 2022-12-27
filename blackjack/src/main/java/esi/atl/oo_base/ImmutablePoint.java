package esi.atl.oo_base;

public final class ImmutablePoint { //declared final !
    
    private final double x;
    private final double y;
    
    public ImmutablePoint() {
        this(0,0);
    }
    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public ImmutablePoint move(double dx, double dy) {
        return new ImmutablePoint(x+dx, y+dy); //defensive copy !
    }
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
}

class TestImmutablePoint {
    public static void main(String args[]) {
        ImmutablePoint p = new ImmutablePoint();
        System.out.println(p);
        ImmutablePoint newP = p.move(2,2);
        System.out.println(p);
        System.out.println(newP);
    }
}