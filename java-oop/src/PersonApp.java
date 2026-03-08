public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Echo";
        person.address = "Bandung";

        person.sayHello("Budi");

        var person1 = new Person();
        person1.sayHello("Eko");
    }
}
