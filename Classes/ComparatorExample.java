package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class person {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

class AgeComparator implements Comparator<person> {
    @Override
    public int compare(person person1, person person2) {
        return person1.getAge() - person2.getAge();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<person> people = new ArrayList<>();
        people.add(new person("Alice", 25));
        people.add(new person("Bob", 30));
        people.add(new person("Charlie", 20));

        // Sort the list based on age using AgeComparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(people, ageComparator);

        // Print the sorted list
        for (Classes.person person : people) {
            System.out.println(person);
        }
    }
}
