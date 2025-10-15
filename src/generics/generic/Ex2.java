package generics.generic;

// Generic class -> like a normal class but uses type paramter <T>

class Test<T> {
    T tObj;

    Test(T tObj) {
        this.tObj = tObj;
    }

    public T getObject() {
        return this.tObj;
    }

}

public class Ex2 {
    public static void main(String[] args) {
        // instance of Integer type
        Test<Integer> t = new Test<Integer>(10);
        System.out.println(t.getObject());

        // instance of String type
        Test<String> ts = new Test<String>("Govind");
        System.out.println(ts.getObject());
    }

}
