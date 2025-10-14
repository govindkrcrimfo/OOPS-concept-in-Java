package inheritance.multiple;

/*
 *  In java multiple inheritane not supported ( due to diamond problem)
 *  But muliptle inheritance can be achieve using Interfaces
 */
interface A {
    void greet();
}

interface B {
    void welcome();
}

class C implements A, B {

    @Override
    public void welcome() {
        System.out.println("Welcome from class B");
    }

    @Override
    public void greet() {
        System.out.println("Greet from class A");
    }

}

public class Ex1 {
    public static void main(String[] args) {
        A a = new C();
        a.greet();

        C c = new C();
        c.welcome();

    }
}
