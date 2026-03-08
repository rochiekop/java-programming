public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("Echo", "Bandung");
        person.sayHello("Budi");

        var person1 = new Person("Echo");
        person1.sayHello("John");

        var person2 = new Person();
        person2.name = "Echo";
        person2.address = "Bandung";
        person2.sayHello("Siun");
    }
}
