package com.example;

import java.util.List;
import java.util.ArrayList;

@FunctionalInterface
interface StringPredicate {
    boolean test(String s);
}

public class Main {
    public static void main(String[] args) {
        List<String> products = List.of("Shampoo", "Soap", "Toothbrush", "Sunscreen", "Comb", "Conditioner");

        List<String> startsWithS = filterByPredicate(products, s -> s.startsWith("S"));
        System.out.println("Products starting with S: " + startsWithS);

        List<String> longerThanEight = filterByPredicate(products, s -> s.length() > 8);
        System.out.println("Products with name longer than 8 characters: " + longerThanEight);

        List<String> endsWithR = filterByPredicate(products, s -> s.endsWith("r"));
        System.out.println("Products ending with r: " + endsWithR);

        List<String> containsOO = filterByPredicate(products, s -> s.contains("oo"));
        System.out.println("Products containing oo: " + containsOO);

        List<String> allCaps = filterByPredicate(products, s -> s.equals(s.toUpperCase()));
        System.out.println("All-caps products: " + allCaps);

        List<String> secondIsO = filterByPredicate(products, s -> s.length() > 1 && s.charAt(1) == 'o');
System.out.println("Products with ‘o’ as 2nd char: " + secondIsO);



    }

    public static List<String> filterByPredicate(List<String> items, StringPredicate predicate) {
        // Write your code here
        List<String> filtered = new ArrayList<>();
        for (String item : items) {
            if (predicate.test(item)) {
                filtered.add(item);
            }
        }
        return filtered;
    }
}