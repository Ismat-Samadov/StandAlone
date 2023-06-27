package Classes;

import java.util.List;

class Box2<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class MathUtils2<T extends Number> {
    public double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}

class Pair2<K, V> {
    private final K key;
    private final V value;

    public Pair2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class GenericsExample2 {

    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public double sumList(List<? extends Number> numbers) {
        double sum = 0;
        for (Number num : numbers) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public void addNumbers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        // Generic class example
        Box2<Integer> integerBox = new Box2<>();
        integerBox.setItem(42);
        int value = integerBox.getItem();
        System.out.println("Value: " + value);

        // Bounded type parameter example
        MathUtils2<Double> mathUtils = new MathUtils2<>();
        double result = mathUtils.sum(10.5, 5.2);
        System.out.println("Sum: " + result);

        // Multiple type parameters example
        Pair2<String, Integer> pair = new Pair2<>("Key", 100);
        String key = pair.getKey();
        Integer val = pair.getValue();
        System.out.println("Key: " + key + ", Value: " + val);

        // Generic method example
        GenericsExample2 example = new GenericsExample2();
        String[] stringArray = {"Hello", "World"};
        example.printArray(stringArray);

        // Unbounded wildcard example
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        example.printList(numbers);

        // Upper bounded wildcard example
        double sum = example.sumList(numbers);
        System.out.println("Sum: " + sum);

        // Lower bounded wildcard example
        List<Number> numberList = List.of(0.5, 1, 1.5);
        example.addNumbers(numberList);
        example.printList(numberList);
    }
}

