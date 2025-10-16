package generics.wildcardGenerics.lowerBoundeWildCardGenerics;

import java.util.List;

class Test {
    public void addNumtoList(List<? super Integer> list) {
        list.add(10);

        /*
         * list.add(1.2);
         * above code will give error becoz Double type not belong to type Number of
         * parent
         * list.add("Govind");
         * above code will give error becoz String type not belong to type Number of
         * parent
         */
    }
}

public class LowerBoundGeneric {
    public static void main(String[] args) {
        Test t = new Test();
        List<Number> l = new List<Number>()
    }
}
