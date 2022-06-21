public class Main {
    public static void main(String[] args) {
        System.out.println("het werkt");
        Person nienke = new Person("Nienke", "Kapers", "female", 32);
        Person marcel = new Person("Marcel", "Kapers", "male", 37);
        Person sandra = new Person("Sandra", "Grooters", "female", 41);
        Person dick = new Person("Dick", "Kapers", "male", 67);
        Person joke = new Person("Joke", "Kapers", "female", 64);
        nienke.addParents(dick, joke, nienke);
        System.out.println(dick.getChildren());
        joke.addChildToChildren(joke, marcel);
        joke.addChildToChildren(joke, sandra);
        joke.addChildToChildren(joke, marcel);
        System.out.println(joke);

    }
}
