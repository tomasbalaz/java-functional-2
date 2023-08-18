package combinatornpattern;

import java.time.LocalDate;

import static combinatornpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gamil.com",
                "+0898989898",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidatorService().isCustomerValid(customer));

        //Using combinator pattern

        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);


        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());

        }
        System.out.println(result);

        //if valid we can store customer in DB.
    }
}
