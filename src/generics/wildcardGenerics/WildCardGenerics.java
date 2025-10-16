package generics.wildcardGenerics;

import java.util.List;
/*
 *  Wild card generics -> unknow type parametet <?>
 * Types :-   
 *      1.Upper-bounded wild card generic
 *      2.Lower-bounded wild card generic
 */

class A {
    public void DisplayList(List<?> list) {
        for (Object i : list) {
            System.out.print(i + " ");
        }
    }
}

public class WildCardGenerics {
    public static void main(String[] args) {
        A a = new A();
        List<Integer> intlist = List.of(1, 2, 3, 4, 5); // Intger parameter
        a.DisplayList(intlist);

        System.out.println();

        List<String> stList = List.of("Govind", "Kumar", "Gupta"); // String type parameter
        a.DisplayList(stList);

        System.out.println();

        List<Double> dList = List.of(1.2, 2.3, 4.5, 5.5); // Double type paramter
        a.DisplayList(dList);

    }
}
