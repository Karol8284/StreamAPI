package Streams;

import java.util.Comparator;
import java.util.List;

public class Min {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6,-3, 7,-83, 9, 10, 131, 2,-32, 136, 14,-67, 5, 16, 1,76,324); // ctrl alt T
        System.out.println("minimum");
        System.out.println(numbers.stream().min(Comparator.naturalOrder()));
        System.out.println(numbers.stream().min(Integer::compareTo));

    }
}
