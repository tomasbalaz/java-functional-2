package combinatornpattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gamil.com",
                "+0898989898",
                LocalDate.of(2000, 1, 1)
        );

        System.out.println(new CustomerValidatorService().isCustomerValid(customer));

        //if valid we can store customer in DB.
    }
}
