package abstraction.abstractEx;

/*
 * Abstract class, different methods and how to call them
 */
abstract class A {
    // static method
    public static void method1() {
        System.out.println("Static method ");
    }

    // concrete method
    public void method2() {
        System.out.println("Concrete method");
    }

    // abstract method
    abstract void method3();
}

class B extends A {

    @Override
    void method3() {
        System.out.println("abstract method ");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        A.method1(); // static method call
        A a = new B();
        a.method2(); // concreted method call
        a.method3(); // normal method call ( normal method and concrete method call are same)

    }

}
