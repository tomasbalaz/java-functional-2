package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        //Function takes 1 argument and produces 1 result
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen
                = incrementByFunction.andThen(multiplyByFunction);
        System.out.println(addByOneAndThenMultiplyByTen.apply(4));

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneANdMultiplyByFunction.apply(4, 100));
    }

    static int increment(int number) {
        return number + 1;
    }
    static Function<Integer, Integer> incrementByFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByFunction = number -> number * 10;

    static int incrementByOneAndMultiply(int number, int numMultiplyBy) {
        return (number + 1) * numMultiplyBy;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneANdMultiplyByFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;
}
