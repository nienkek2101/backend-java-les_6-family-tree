public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private String sex;
    private int age;
    private String mother;
    private String father;

    // list
    private String siblings;
    private String children;
    private String pets;

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
}
