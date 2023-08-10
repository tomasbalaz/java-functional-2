package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("0712"));
        System.out.println(isPhoneNumberValid("0822"));
        System.out.println(isPhoneNumberValid("08222"));


        System.out.println("With predicate");
        System.out.println(isPhoneNumberValidByPredicate.test("0712"));
        System.out.println(isPhoneNumberValidByPredicate.test("0822"));
        System.out.println(isPhoneNumberValidByPredicate.test("08222"));
        System.out.println(isPhoneNumberValidByPredicate.and(containsNumber3).test("0713"));
        System.out.println(isPhoneNumberValidByPredicate.and(containsNumber3).test("0712"));
        System.out.println(isPhoneNumberValidByPredicate.or(containsNumber3).test("0712"));

    }

    static boolean isPhoneNumberValid(String phoneNumber ) {
        return  phoneNumber.startsWith("07") && phoneNumber.length() == 4;
    }

    static Predicate<String> isPhoneNumberValidByPredicate =
            phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 4;

    static Predicate<String> containsNumber3 =
            phoneNumber -> phoneNumber.contains("3");
}
