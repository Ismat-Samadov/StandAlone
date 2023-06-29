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
class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        return person1.getAge() - person2.getAge();
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 20));

        // Sort the list based on age using AgeComparator
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(people, ageComparator);

        // Print the sorted list
        for (Classes.Person person : people) {
            System.out.println(person);
        }
    }
}
