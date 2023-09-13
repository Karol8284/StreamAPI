package Streams.Example;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StringToSet {
    Set<Character> set;
    StringToSet(String str) {
        set = str.chars().mapToObj( x -> (char)x).collect(Collectors.toSet());
        System.out.println(set.size());

        for (Character character : set) {
            System.out.println("character: "+ character);
        }

        String str2 = set.toString();
        System.out.println(str2);

        String str3 = set.stream().map(Object::toString).reduce("", String::concat);
        System.out.println(str3);
    }

    public static void main(String[] args) {
        new StringToSet("avadsada");
    }
}
