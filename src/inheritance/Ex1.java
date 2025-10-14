package inheritance;

/*
 * Single inheritance -> A extended by B 
 * Muilti level inheritance -> A extenede by B , and B extended by C
 */
class A {
    void greet() {
        System.out.println("Greet from Class A");
    }
}

class B extends A {
    @Override
    void greet() {
        System.out.println("Greet from class B");
    }
}

class C extends B {
    @Override
    void greet() {
        System.out.println("Greet from class C");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        B b = new C();
        b.greet();

        A a = new A();
        a.greet();
    }
}
