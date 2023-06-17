package Classes;

public class Animal {
    private String species;
    public double weight;
    public double height;
    public String name;

    public Animal(String species, double weight, double height, String name) {
        this.species = species;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

}



