package Streams;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 6, 7, 9, 10, 131, 2, 136, 14, 5, 16, 1,76,324);
        List<Integer> numList;
        List<String> names = List.of("Daniel","Adrian","Ward","Irena","Alex");
        List<String> stringList;
        stringList = numbers.stream().map(Object::toString).collect(Collectors.toList());
        System.out.println(stringList);
        stringList = names.stream().map(x -> "1-;"+x.indent(-2)+ "2-:"+ x.indent(2)).collect(Collectors.toList());
        System.out.println(stringList);
        stringList = names.stream().map(x -> x.toLowerCase()+" :}").collect(Collectors.toList());
        System.out.println(stringList);
        System.out.println("numbers     ---------------------");
        numList = numbers.stream().map(x -> x + 12).collect(Collectors.toList());
        System.out.println(numList);
        numList = numbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numList);
    }
}
