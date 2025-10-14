package inheritance.abstraction.interfaceEx;

/*
 *  Interface and its different method , and how to call them
 */
interface A {
    // default method
    default void method1() {
        System.out.println("Default method called !!");
    }

    // static method
    public static void method2() {
        System.out.println("static method called !!");
    }

    // abstract method
    public void method3();

}

class B implements A {
    @Override
    public void method3() {
        System.out.println("abstract method called !!");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        A.method2(); // static method call
        A a = new B();
        a.method1(); // default method call
        a.method3(); // abstract method call (default and abstract method call is similar)

    }

}
