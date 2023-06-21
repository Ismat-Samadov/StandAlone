package Classes;

class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("This is a " + name + ".");
    }

    public double area() {
        return 0.0;
    }
}

// Extension: Creating a subclass of Shape called Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Overriding the display method of Shape
    public void display() {
        System.out.println("This is a " + name + " with radius " + radius + ".");
    }

    // Overriding the area method of Shape
    public double area() {
        return 3.14 * radius * radius;
    }
}

// Extension: Creating another subclass of Shape called Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    // Overriding the display method of Shape
    public void display() {
        System.out.println("This is a " + name + " with width " + width + " and height " + height + ".");
    }

    // Overriding the area method of Shape
    public double area() {
        return width * height;
    }
}

// Example usage
class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.display();  // Output: This is a Circle with radius 5.
        System.out.println("Area: " + circle.area());  // Output: Area: 78.5

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.display();  // Output: This is a Rectangle with width 4 and height 6.
        System.out.println("Area: " + rectangle.area());  // Output: Area: 24.0
    }
}

