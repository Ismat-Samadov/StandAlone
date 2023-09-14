import java.util.Scanner;

public class sign {
    public static int sign(int number) {
        int returnvalue;

        if (number == 0) {
            returnvalue = 0;
            return returnvalue;
        } else if (number > 0) {
            returnvalue = 1;
        } else {
            returnvalue = -1;
        }
        return returnvalue;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
