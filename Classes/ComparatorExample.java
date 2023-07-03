package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define the Person class
class Person5 {
    private String name;
    private int age;

    public Person5(String name, int age) {
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

// Define the AgeComparator class to compare Person objects based on age
class AgeComparator implements Comparator<Person5> {
    @Override
    public int compare(Person5 person1, Person5 person2) {
        return person1.getAge() - person2.getAge();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of Person5 objects
        List<Person5> people = new ArrayList<>();
        people.add(new Person5("Alice", 25));
        people.add(new Person5("Bob", 30));
        people.add(new Person5("Charlie", 20));

        // Sort the list based on age using AgeComparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(people, ageComparator);

        // Print the sorted list
        for (Person5 person : people) {
            System.out.println(person);
        }
    }
}
