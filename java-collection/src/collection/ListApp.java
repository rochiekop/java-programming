package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //List<String> strings = new LinkedList<>();

        strings.add("Eko");
        strings.add("Rochi");
        strings.add("Pambudi");

        strings.get(2);

        strings.set(0,"Java");

        strings.remove(0);
        System.out.println(strings.size());

        for (var string : strings){
            System.out.println(string);
        }

    }
}
