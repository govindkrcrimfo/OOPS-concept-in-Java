package generics.wildcardGenerics.upperBoundedWildCardGenerics;

import java.util.List;

class Test {
    public void displayList(List<? extends Number> list) {
        for (Object i : list) {
            System.out.print(i + " ");
        }
    }
}

public class UpperBoundGenerics {
    public static void main(String[] args) {
        Test t = new Test();
        List<Integer> intls = List.of(1, 2, 3, 4, 5); // Integer type belong to Number
        t.displayList(intls);

        System.out.println();

        List<Double> dList = List.of(1.2, 2.4, 4.5, 5.5); // Double type belong to Number
        t.displayList(dList);

        // List<String> s=List.of("Goving","kumar","Gupte");
        // t.displayList(s);
        /*
         * above will give compile time error , becoz stirng type not belong to Number
         */

    }
}
