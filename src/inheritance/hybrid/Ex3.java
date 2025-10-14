package inheritance.hybrid;

//Hybrid inheritance

class A {
    void greet() {
        System.out.println("Greet from class A");
    }
}

interface B {
    void welcome();
}

interface C {
    void namaste();
}

class D extends A implements B, C {

    @Override
    void greet() {
        System.out.println("Greet from class D");
    }

    @Override
    public void namaste() {
        System.out.println("Namaste from class C");
    }

    @Override
    public void welcome() {
        System.out.println("Welcome from class B");
    }

}

public class Ex3 {
    public static void main(String[] args) {
        A a = new D();
        a.greet();

        B b = new D();
        b.welcome();
        C c = new D();
        c.namaste();
    }
}
