package polymorphism;
// Rum time and compile time polymorphism

class CompileTime {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

// Runtime polymorphism
class Vehicle {
    void start() {
        System.out.println("Vehicle class start method");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car class start method");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        // compile time poly -> exist at compile time
        CompileTime ct = new CompileTime();
        ct.sum(1, 2);
        ct.sum(1, 2, 3);

        // Runtime poly -> exists at Runtime
        Vehicle v = new Car();
        v.start();

        Vehicle v1 = new Vehicle();
        v1.start();

    }
}
