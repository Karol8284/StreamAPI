package Streams.Example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static List<Person> getPeople(){
        return List.of(
                new Person("John", 19, Gender.Male),
                new Person("Joanna", 54, Gender.Female),
                new Person("Adam", 45, Gender.Male),
                new Person("Asia", 32, Gender.Female),
                new Person("Zosia", 22, Gender.Female)
        );
    }

    public static void main(String[] args) {
        List<Person> people = getPeople();

        List<Person> FemaleList = people.stream().filter(person -> person.getGender() == Gender.Female).collect(Collectors.toList());
        System.out.println(FemaleList);

        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).toList();
        System.out.println(sorted);
        sorted.forEach(person -> System.out.println());

        boolean matched = people.stream().allMatch(person -> person.getAge() > 18);
        System.out.println(matched);
        boolean anyMatch = people.stream().allMatch(person -> person.getAge() > 60);
        System.out.println(anyMatch);
    }
}
