package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlBySupplier.get());
        System.out.println(getDbConnectionUrlsBySupplier.get());
    }

    static String getDbConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String>getDbConnectionUrlBySupplier =
            () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDbConnectionUrlsBySupplier =
            () -> List.of(
                    "jdbc://localhost:5432/users",
                    "jdbc://localhost:5432/users");
}
