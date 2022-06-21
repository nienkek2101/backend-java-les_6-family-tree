public class Pet {
    private String name;
    private int age;
    private String species;
    // private String owner; - waarom Person ipv String?
    private Person owner;

    // Constructor
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    public Person getOwner() {
        return owner;
    }

    // Setters

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Deze setters zijn niet nodig omdat je ze in de constructor al aan moet maken.

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setSpecies(String species) {
//        this.species = species;
//    }
//
//    public void setOwner(String owner) {
//        this.owner = owner;
//    }

}
