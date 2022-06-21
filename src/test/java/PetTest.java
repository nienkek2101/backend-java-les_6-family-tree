import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetTest {
    @Test
    void getName() {
        // Arrange
        Pet pet1 = new Pet("Koda", 2, "Dog");

        // Act
        String name = pet1.getName();

        // Assert
        assertEquals("Koda", name);

    }

    @Test
    void getAge() {
        // Arrange
        Pet pet1 = new Pet("Koda", 2, "Dog");

        // Act
        int age = pet1.getAge();

        // Assert
        assertEquals(2, age);

    }

    @Test
    void getSpecies() {
        // Arrange
        Pet pet1 = new Pet("Koda", 2, "Dog");

        // Act
        String species = pet1.getSpecies();

        // Assert
        assertEquals("Dog", species);
    }

    @Test
    void getOwner() {
        // Arrange
        Pet pet1 = new Pet("Koda", 2, "Dog");
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        pet1.setOwner(person1);
        Person owner = pet1.getOwner();

        // Assert
        assertEquals(person1, owner);

    }

    @Test
    void setOwner() {
        // Arrange
        Pet pet1 = new Pet("Koda", 2, "Dog");
        Person person1 = new Person("Nienke", "Kapers", "female", 32);

        // Act
        pet1.setOwner(person1);
        String owner = pet1.getOwner().getName();

        // Assert
        assertEquals("Nienke", owner);

    }
}
