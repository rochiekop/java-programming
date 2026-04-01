package application;

import generic.Person;

import java.util.Arrays;

public class PersonApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Rochi","Indonesia"),
                new Person("Eko","Indonesia"),
                new Person("Pambudi","Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
