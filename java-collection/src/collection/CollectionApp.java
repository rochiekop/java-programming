package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Eko");
        names.add("Rochi");
        names.add("Pambudi");
        names.addAll(Arrays.asList("Java","Programmer"));

        System.out.println(names);

        for(var name : names){
            System.out.println(name);
        }

        System.out.println("REMOVE");

        names.remove("Eko");
        names.removeAll(List.of("Programmer","Rochi"));
        System.out.println(names);


        System.out.println(names.contains("Java"));
        System.out.println(names.containsAll(List.of("Eko","Pambudi")));

    }
}
