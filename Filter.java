package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6,-3, 7,-83, 9, 10, 131, 2,-32, 136, 14,-67, 5, 16, 1,76,324); // ctrl alt T
        List<Integer> numList;
        int num = 0;
        List list;
        System.out.println(numbers);
        num = (int) numbers.stream().filter(x -> x > 5).count();
        System.out.println(num);
        list =  numbers.stream().filter(x -> x > 50).collect(Collectors.toList());
        System.out.println(list);

        List<String> names = List.of("Daniel","Adrian","Ward","Irena","Alex");
        List<String> namesRes = names.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
        System.out.println("start with A: "+namesRes);
        namesRes = names.stream().filter(x -> x.toLowerCase().contains("a")).collect(Collectors.toList());
        System.out.println("to lowerCase contain a: "+namesRes);
        namesRes = names.stream().filter(x -> x.contains("a")).collect(Collectors.toList());
        System.out.println("contain a: "+namesRes);
        namesRes = names.stream().filter(x -> x.contains("A")).collect(Collectors.toList());
        System.out.println("contain A: "+namesRes);

        System.out.println("number -----------------------------------------------");
        numList = numbers.stream().map(x -> {if (0 > x){x = 0;}return x;}).collect(Collectors.toList());
        System.out.println(numList);
        System.out.println(numbers.stream().allMatch(x -> x>0 ));
        System.out.println(numbers.stream().count());


    }
}
