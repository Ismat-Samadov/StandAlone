package Classes;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        int result = 17; // Choose a prime number as the initial value
        result = 31 * result + name.hashCode(); // Use the hash code of 'name' field
        result = 31 * result + age; // Include the 'age' field directly
        return result;
    }

    // Rest of the class implementation...
}

