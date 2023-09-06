package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {

    public static void main(String[] args) {
        int[] arr = new int[] {43, 4, 6, 9, 38};
        List<int[]> li = Stream.of(arr).collect(Collectors.toList());
        List<int[]> li2 = Stream.of(arr).toList();
        System.out.println("result: "+ Arrays.toString(li.get(0)));
        System.out.println("result: "+ Arrays.toString(li2.get(0)));
    }
}
