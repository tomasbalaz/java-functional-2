package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen
                = incrementByFunction.andThen(multiplyByFunction);
        System.out.println(addByOneAndThenMultiplyByTen.apply(4));
    }

    static int increment(int number) {
        return number + 1;
    }
    static Function<Integer, Integer> incrementByFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyByFunction = number -> number * 10;
}
