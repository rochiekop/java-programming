package data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;
    private List<String> hobbies;


    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<String>();
    }

    public void addHobbies(String hobby){
        this.hobbies.add(hobby);
    }

    public List<String> getHobbies(){

        /**
         * This is mutable data
         */
        //return this.hobbies;

        /**
         * Immutable List
         */
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }
}
