package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {

        // 'name ->'  this is lambda, 'name' is argument
        // Function<String, String> upperCaseName = name -> name.toUpperCase();
        // Function<String, String> upperCaseName = String::toUpperCase;
        Function<String, String> upperCaseName = name -> {
            //logic
            if(name.isBlank()) throw new IllegalStateException("");
            return name.toUpperCase();
        };

        BiFunction<String, Integer, String> upperCaseNameBi = (name, age) -> {
            //logic
            if(name.isBlank()) throw new IllegalStateException("");
            System.out.println(age);
            return name.toUpperCase();
        };
    }
}
