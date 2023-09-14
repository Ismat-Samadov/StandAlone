import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persons {
    private final String name;
    private final int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class CombinedComparatorExample {
    public static void main(String[] args) {
        // Sorting strings
        String[] fruits = {"apple", "banana", "orange", "grape"};
        Arrays.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted fruits: " + Arrays.toString(fruits));

        // Sorting custom objects
        List<Persons> people = new ArrayList<>();
        people.add(new Persons("Alice", 25));
        people.add(new Persons("Bob", 30));
        people.add(new Persons("Charlie", 20));
        Collections.sort(people, new Comparator<Persons>() {
            @Override
            public int compare(Persons p1, Persons p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        System.out.println("Sorted people by age:");
        for (Persons person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

