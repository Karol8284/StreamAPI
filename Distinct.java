package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,4,4,4,4, 6,4,4,-3, 7,7,7,-83,9, 9, 10, 131, 2,-32,14,10, 136, 14,-67, 5, 16, 1,76,324); // ctrl alt T
        List<Integer> res;
        numbers.stream().distinct().forEach(System.out::println);
        res = numbers.stream().dropWhile(x -> x % 2 == 1).collect(Collectors.toList());
        System.out.println(res);
    }
}
