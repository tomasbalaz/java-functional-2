package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer maria = new Customer(
                "Maria",
                "99999"
        );

        //Normal Java function
        greetCustomer(maria);

        //Consumer Functional Interface
        greetCustomerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name() +
            ", thanks for registering phone number " +
            customer.phoneNumber());


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name() +
                ", thanks for registering phone number " +
                customer.phoneNumber());
    }
}

record Customer (
        String name,
        String phoneNumber
) {}
