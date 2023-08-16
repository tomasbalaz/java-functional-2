package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class _OptionalBasic {

    public static void main(String[] args) {

        Object defaultValue = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        System.out.println(defaultValue);

        Object value = Optional.ofNullable("Hello")
                .orElseGet(() -> "default value");

        System.out.println(value);


        Supplier<IllegalArgumentException> exception = () -> new IllegalArgumentException("Exception");
        Optional.ofNullable("Hello")
                .orElseThrow(exception);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to " + email));

        Optional.ofNullable(null)
                .ifPresent(email -> System.out.println("Sending email to " + email));


        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Can not send email")
                );


        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("Sending email to " + email),
                        () -> System.out.println("Can not send email")
                );


    }
}
