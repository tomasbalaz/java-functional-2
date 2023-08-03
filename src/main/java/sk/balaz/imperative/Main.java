package sk.balaz.imperative;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Person.Gender.MALE),
                new Person("Maria", Person.Gender.FEMALE),
                new Person("Aisha", Person.Gender.FEMALE),
                new Person("Alex", Person.Gender.MALE),
                new Person("Alice", Person.Gender.FEMALE)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Person.Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }
    }

    record Person(
            String name,
            Gender gender
    ) {

        enum Gender {
            MALE,
            FEMALE
        }

    }
}