package inheritance;

// Hieararchical inheritance 

class A {
    void greet() {
        System.out.println("Greet from class A");
    }
}

class B extends A {
    @Override
    void greet() {
        System.out.println("Greet from class B");
    }
}

class C extends A {
    @Override
    void greet() {
        System.out.println("Greet from class C");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        A a = new B();
        a.greet();

        A a1 = new C();
        a1.greet();
    }
}
