package Classes;

public class GenericsAPP {

    public static void requireNonNull(String name) {
        if (name == null) {
            throw new NullPointerException("Please Enter Name");
        }
    }

    public static void requireNonNull(Integer age) {
        if (age == null) {
            throw new NullPointerException("Please Enter Age");
        }
    }


}
