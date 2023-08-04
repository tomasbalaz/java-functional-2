package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByFunction.apply(1);
        System.out.println(increment2);
    }

    static int increment(int number) {
        return number + 1;
    }
    static Function<Integer, Integer> incrementByFunction = number -> number + 1;
}
