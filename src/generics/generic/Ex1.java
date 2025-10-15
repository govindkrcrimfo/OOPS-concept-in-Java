package generics.generic;

// method generic -> takes type paramter <T>
class A {
    public static <T> void genericDisplay(T element) {
        System.out.println(element.getClass().getName() + "  " + element);
    }
}

public class Ex1 {
    public static void main(String[] args) {
        A.genericDisplay(10); // Integer paramter
        A.genericDisplay("Govind"); // String paramter
        A.genericDisplay("2.10"); // Double paramter
    }

}
