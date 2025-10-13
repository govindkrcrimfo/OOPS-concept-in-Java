package constructor;
/*
    Q.What happens if you create an object of a subclass? Which constructor is called first?
    Ans: The parent class constructor is called first, followed by the subclass constructor. This ensures proper initialization.
    Code exmaple below
 */

class Parent {
    public Parent() {
        System.out.println("Parent class Constructor called !!");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("Child class Constructor called !!");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
