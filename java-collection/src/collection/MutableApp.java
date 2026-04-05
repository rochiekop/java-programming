package collection;

import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Eko");

        person.addHobbies("Coding");
        person.addHobbies("Gaming");

        doSomething(person.getHobbies());

        for (var val:person.getHobbies()){
            System.out.println(val);
        }
        //System.out.println(person.getName());

    }


    public static void doSomething(List<String> hobbies){
        hobbies.add("This is not hobby");
    }
}
