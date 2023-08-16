package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import static streams.Person.Gender.FEMALE;
import static streams.Person.Gender.MALE;

public class _StreamBasic {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        Set<Person.Gender> genders = people.stream()
                .map(person -> person.gender())
                .collect(Collectors.toSet());

        System.out.println(genders);

        people.stream()
                .map(person -> person.gender())
                .collect(Collectors.toSet())
                .forEach(gender -> System.out.println(gender));


        Function<Person, String> personStringFunction = Person::name;
        Function<String, Integer> length = String::length;
        Consumer<Integer> println = System.out::println;
        people.stream()
                .map(personStringFunction)
                .map(length)
                .forEach(println);

    }

    }

    record Person(
            String name,
            Person.Gender gender
    ) {

        enum Gender {
            MALE,
            FEMALE
        }
}
