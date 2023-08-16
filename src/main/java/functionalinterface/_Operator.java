package functionalinterface;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class _Operator {
    public static void main(String[] args) {
        System.out.println(stringUnaryOperator.apply("tomas"));
        System.out.println(integerBinaryOperator.apply(1,2));
    }

    static UnaryOperator<String> stringUnaryOperator = s -> "Welcome " + s;

    static BinaryOperator<Integer> integerBinaryOperator =  (integer, integer2) ->
            integer + integer2;
}
