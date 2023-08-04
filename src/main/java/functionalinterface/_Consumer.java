package functionalinterface;

import java.util.function.BiConsumer;
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

        //Normal Java function
        greetCustomer(maria, false);

        //BiConsumer Functional Interface
        greetCustomerBiConsumer.accept(maria, false);
    }

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.name() +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.phoneNumber(): "**********"));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.name() +
            ", thanks for registering phone number " +
            customer.phoneNumber());


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name() +
                ", thanks for registering phone number " +
                customer.phoneNumber());
    }

    static void greetCustomer(Customer customer, Boolean showPhoneNumber) {
        System.out.println("Hello " + customer.name() +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.phoneNumber(): "**********"));
    }
}

record Customer (
        String name,
        String phoneNumber
) {}
