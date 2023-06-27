package Classes;

public class GenericsAPP {
    public static void main(String[] args) {
        requireNonNull(22);
    }


//    public static void requireNonNull(String name) {
//        if (name == null) {
//            throw new NullPointerException("Please Enter Name");
//        }
//    }
//
//    public static void requireNonNull(Integer age) {
//        if (age == null) {
//            throw new NullPointerException("Please Enter Age");
//        }
//    }

    public static <T> void requireNonNull(T data) {
        if (data == null) {
            throw new NullPointerException("Please Enter Correct Data");
        } else {
            System.out.println(data);
        }
    }


}
