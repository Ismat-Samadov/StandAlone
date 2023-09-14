package Classes;

public class BitwiseOperationsExample {
    public static void main(String[] args) {
        int a = 5;    // Binary: 0101
        int b = 3;    // Binary: 0011

        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseNotA = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int unsignedRightShift = a >>> 1;

        System.out.println("Bitwise AND: " + bitwiseAnd);            // Output: 1
        System.out.println("Bitwise OR: " + bitwiseOr);              // Output: 7
        System.out.println("Bitwise XOR: " + bitwiseXor);            // Output: 6
        System.out.println("Bitwise NOT (a): " + bitwiseNotA);       // Output: -6
        System.out.println("Left Shift: " + leftShift);              // Output: 10
        System.out.println("Right Shift: " + rightShift);            // Output: 2
        System.out.println("Unsigned Right Shift: " + unsignedRightShift);  // Output: 2
    }
}

