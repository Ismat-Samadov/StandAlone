// Singleton Pattern
class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

// Factory Pattern
interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle: draw()");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle: draw()");
    }
}

class ShapeFactory {
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

// Observer Pattern
interface Observer {
    void update(String message);
}

interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}

class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }
}

class NewsChannel implements Observer {
    private String news;

    @Override
    public void update(String news) {
        this.news = news;
        System.out.println("Breaking News: " + news);
    }
}

// Strategy Pattern
interface EncryptionStrategy {
    void encryptData(String data);
}

class AESEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encryptData(String data) {
        System.out.println("Encrypting data using AES: " + data);
    }
}

class DESEncryptionStrategy implements EncryptionStrategy {
    @Override
    public void encryptData(String data) {
        System.out.println("Encrypting data using DES: " + data);
    }
}

class Encryptor {
    private EncryptionStrategy encryptionStrategy;

    public Encryptor(EncryptionStrategy encryptionStrategy) {
        this.encryptionStrategy = encryptionStrategy;
    }

    public void encryptData(String data) {
        encryptionStrategy.encryptData(data);
    }
}

public class DesignPatternExample {
    public static void main(String[] args) {
        // Singleton Pattern
        Singleton singleton = Singleton.getInstance();

        // Factory Pattern
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.createShape("circle");
        circle.draw();
        Shape rectangle = shapeFactory.createShape("rectangle");
        rectangle.draw();

        // Observer Pattern
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel newsChannel = new NewsChannel();
        newsAgency.registerObserver(newsChannel);
        newsAgency.setNews("COVID-19 Update");

        // Strategy Pattern
        Encryptor aesEncryptor = new Encryptor(new AESEncryptionStrategy());
        aesEncryptor.encryptData("Sensitive Data");
        Encryptor desEncryptor = new Encryptor(new DESEncryptionStrategy());
        desEncryptor.encryptData("Confidential Data");
    }
}
