package esi.atl.oo_inheritance;

class A {

    A() {
        System.out.println("constructor of A");
    }
}

class B extends A {

    B() {
        System.out.println("constructor of B");
    }
}

class C extends B {

    C() {
        System.out.println("constructor of C");
    }
}

public class TestConstructor {

    public static void main(String[] args) {
        new C();
    }
}
