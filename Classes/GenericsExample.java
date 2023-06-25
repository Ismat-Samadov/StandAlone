package Classes;

public class GenericsExample {

    public static class Box<T> {
        private T content;

        public void setContent(T content) {
            this.content = content;
        }

        public T getContent() {
            return content;
        }
    }

    public static class Utils {
        public static <T> void printArray(T[] array) {
            for (T element : array) {
                System.out.println(element);
            }
        }
    }

    public static class Calculator<T extends Number> {
        private T operand1;
        private T operand2;

        public Calculator(T operand1, T operand2) {
            this.operand1 = operand1;
            this.operand2 = operand2;
        }

        public double sum() {
            return operand1.doubleValue() + operand2.doubleValue();
        }
    }

    public static void main(String[] args) {
        // Box Example
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello, Generics!");
        String content = stringBox.getContent();
        System.out.println(content); // Output: Hello, Generics!

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(42);
        int value = integerBox.getContent();
        System.out.println(value); // Output: 42

        // Utils Example
        Integer[] numbers = {1, 2, 3, 4, 5};
        Utils.printArray(numbers);

        String[] names = {"John", "Jane", "Mike"};
        Utils.printArray(names);

        // Calculator Example
        Calculator<Integer> intCalculator = new Calculator<>(5, 10);
        double intSum = intCalculator.sum();
        System.out.println(intSum); // Output: 15.0

        Calculator<Double> doubleCalculator = new Calculator<>(3.14, 2.71);
        double doubleSum = doubleCalculator.sum();
        System.out.println(doubleSum); // Output: 5.85
    }
}

