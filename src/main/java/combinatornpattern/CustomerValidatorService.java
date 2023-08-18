package combinatornpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isCustomerValid(Customer customer) {
        return isEmailValid(customer.email()) &&
                isPhoneNumberValid(customer.phoneNumber()) &&
                isAdult(customer.dob());
    }

    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+0");
    }

    private boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }
}
