package Classes;

public class HumanApp {
    public static void main(String[] args) {
        Human empty = new Human();
        System.out.println(empty);
        Human IsmatS = new Human(29, 1.75, 85.9, "Ismat");
        Human QismatS = new Human(27, 78.0, 1.87, "Qismat");
        IsmatS.sleeping();
        QismatS.walking();
        QismatS.speaking();
        IsmatS.wakeUp(true);
    }


}