package Classes;

public class Human {
    public int Age;
    public double Height;
    public double Weight;
    public String Name;


    public Human() {
    }

    public Human(int Age, double Height, double Weight, String Name) {
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void sleeping() {
        System.out.println(Name + " is sleeping");
    }

    public void wakeUp(boolean isSleeping) {
        if (isSleeping == true) {
            System.out.println(Name + " is awakened");
        } else {
            System.out.println(Name + " is sleeping");
        }
    }

    public void walking() {
        System.out.println(Name + " is walking");
    }

    public void jumping() {
        System.out.println(Name + " is jumping");
    }

    public void atGym() {
        System.out.println(Name + " at gym");
    }

    public void speeking() {
        System.out.println(Name + " is speaking");
    }



}
