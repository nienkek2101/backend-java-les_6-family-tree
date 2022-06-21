import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
//    private String mother;
//    private String father;
    private Person mother;
    private Person father;

    // list
//    private String siblings;
//    private String children;
//    private String pets;
    private List<Person> siblings;
    private List<Person> children;
    private List<Pet> pets;



    public Person(String name, String lastName, String sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, String sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public Person getMother() {
        return mother;
    }

    public Person getFather() {
        return father;
    }

    public List<Person> getSiblings() {
        return siblings;
    }

    public List<Person> getChildren() {
        return children;
    }

    public List<Pet> getPets() {
        return pets;
    }

// Setters
    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public void setSiblings(List<Person> siblings) {
        this.siblings = siblings;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    // Methodes
    public void addParents(Person father, Person mother, Person child) {
        child.setMother(mother);
        mother.addChildToChildren(mother, child);
        child.setFather(father);
        father.addChildToChildren(father, child);
    }

    public void addChildToChildren(Person parent, Person child) {
        List<Person> kids = new ArrayList<>();
        if(parent.getChildren() != null) { // check of de lijst van kinderen niet leeg is
            for (Person person : parent.getChildren()) { // voor alle kinderen in de lijst,
                kids.add(person); // voeg deze toe aan de nieuwe lijst
            }
        }
        kids.add(child); // voeg kind uit parameter toe aan de lijst
        parent.setChildren(kids); // voeg de zojuist aangemaakte lijst toe aan de persoon parent
    }

    public void addPet(Person person, Pet pet) {
        List<Pet> pets = new ArrayList<>();
        if(person.getPets() != null) {
            pets.addAll(person.getPets());
//            for (Pet banaan : person.getPets()) {
//                pets.add(banaan);
//            }
        }
        pets.add(pet);
        person.setPets(pets);
    }

    public void addSibling(Person person, Person sibling) {
        // waarom is deze anders van de mother/father
        List<Person> family = new ArrayList<>();
        if(person.getSiblings() != null) {
            for (Person people : person.getSiblings()) {
                family.add(people);
            }
        }
        family.add(sibling);
        person.setSiblings(family);
    }

    public List<Person> getGrandChildren(Person person) {
        List<Person> grandChildren = new ArrayList<>();
        if(person.getChildren() != null) {
            for (Person children : person.getChildren()) {
                if (children.getChildren() != null) {
                    for (Person grandChild : children.getChildren()) {
                        grandChildren.add(grandChild);
                    }
                }
            }
        }
        return grandChildren;
    }
}
