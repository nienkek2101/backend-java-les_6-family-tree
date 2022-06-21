import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    void getName() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        String name = person1.getName();

        // Assert
        assertEquals("Nienke", name);

    }

    @Test
    void getMiddleName() {
        // Arrange
        Person person1 = new Person("Mark", "te", "Brake", "male", 30);

        // Act
        String name = person1.getMiddleName();

        // Assert
        assertEquals("te", name);

    }

    @Test
    void getLastName() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        String name = person1.getLastName();

        // Assert
        assertEquals("Kapers", name);
    }

    @Test
    void getSex() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        String sex = person1.getSex();

        // Assert
        assertEquals("female", sex);
    }

    @Test
    void getAge() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        int age = person1.getAge();

        // Assert
        assertEquals(32, age);
    }

    @Test
    void getMother() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Joke", "Kapers", "female", 64);
        person1.setMother(person2);

        // Act
//        String mother = person1.getMother().getName();
        Person mother = person1.getMother();

        // Assert
//        assertEquals("Joke", mother);
        assertEquals(person2, mother);
    }

    @Test
    void getFather() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Dick", "Kapers", "male", 67);
        person1.setFather(person2);

        // Act
        Person father = person1.getFather();

        // Assert
        assertEquals(person2, father);
    }

    @Test
    void getSiblings() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Marcel", "Kapers", "male", 37);
        Person person3 = new Person("Sandra", "Grooters", "female", 41);

        List<Person> kids = new ArrayList<>();
        kids.add(person2);
        kids.add(person3);
        person1.setSiblings(kids);

        // Act
        List<Person> siblings = person1.getSiblings();

        // Assert
        assertEquals(kids, siblings);
    }

    @Test
    void getChildren() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Marcel", "Kapers", "male", 37);
        Person person3 = new Person("Sandra", "Grooters", "female", 41);
        Person father = new Person("Dick", "Kapers", "male", 67);
        List<Person> kids = new ArrayList<>();
        kids.add(person1);
        kids.add(person2);
        kids.add(person3);
        father.setChildren(kids);

        // Act
        List<Person> children = father.getChildren();

        // Assert
        assertEquals(kids, children);
    }

    @Test
    void getPets() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Pet pet1 = new Pet("Koda", 2, "Dog");
        Pet pet2 = new Pet("Harry", 1, "Fly");
        List<Pet> pets = new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);
        person1.setPets(pets);

        // Act
        List<Pet> animals = person1.getPets();

        // Assert
        assertEquals(pets, animals);

    }

    @Test
    void setSex() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        person1.setSex("male");
        String sex = person1.getSex();

        // Assert
        assertEquals("male", sex);
    }

    @Test
    void setAge() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        person1.setAge(33);
        int age = person1.getAge();

        // Assert
        assertEquals(33, age);
    }

    @Test
    void setMother() {
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Joke", "Kapers", "female", 64);

        // Act
//        Person mother = person1.setMother(person2); - waarom kan dit niet
        person1.setMother(person2);
        Person mother = person1.getMother();

        // Assert
        assertEquals(person2, mother);

    }

    @Test
    void addParents() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Joke", "Kapers", "female", 64);
        Person person3 = new Person("Dick", "Kapers", "male", 67);

        // Act
        person1.addParents(person3, person2, person1);
        Person mother = person1.getMother();
        Person father = person2.getFather();

        // Assert
        assertEquals(mother, person2);
        assertEquals(father, person3);

    }

    @Test
    void addChildToChildren() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Joke", "Kapers", "female", 64);
        Person person3 = new Person("Marcel", "Kapers", "male", 37);
        List<Person> kids = new ArrayList<>();
        kids.add(person1);
        kids.add(person3);


        // Act
        person2.addChildToChildren(person2, person1);
        person2.addChildToChildren(person2, person3);
        List<Person> children = person2.getChildren();

        // Assert
        assertEquals(kids, children);
    }

    @Test
    void addPet() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Pet dog = new Pet("Koda", 2, "dog");
        List<Pet> animals = new ArrayList<>();
        animals.add(dog);

        // Act
        person1.addPet(person1, dog);
        List<Pet> pets = person1.getPets();

        // Assert
        assertEquals(animals, pets);

    }

    @Test
    void addSibling() {
        // Arrange
        Person person1 = new Person("Nienke", "Kapers", "female", 32);
        Person person2 = new Person("Marcel", "Kapers", "male", 37);
        Person person3 = new Person("Sandra", "Grooters", "female", 41);
        List<Person> family = new ArrayList<>();
        family.add(person2);
        family.add(person3);

        // Act
        person1.addSibling(person1, person2);
        person1.addSibling(person1, person3);
        List<Person> siblings = person1.getSiblings();

        // Assert
        assertEquals(family, siblings);
    }

    @Test
    void getGrandChildren() {
        // Arrange
        Person person1 = new Person("Joke", "Kapers", "female", 64);
        Person person2 = new Person("Sandra", "Grooters", "female", 41);
        Person person3 = new Person("Sofie", "Grooters", "female", 8);
        Person person4 = new Person("Lisa", "Grooters", "female", 5);
        List<Person> testGrandchildren = new ArrayList<>();
        testGrandchildren.add(person3);
        testGrandchildren.add(person4);

        // Act
        person1.addChildToChildren(person1, person2);
        person2.addChildToChildren(person2, person3);
        person2.addChildToChildren(person2, person4);
        List<Person> outcomeGrandChildren = person1.getGrandChildren(person1);

        // Assert
        assertEquals(testGrandchildren, outcomeGrandChildren);
    }

}
