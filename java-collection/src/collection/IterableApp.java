package collection;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        System.out.println("");
        Iterable<String> names = List.of("Rochi","Eko","Pambudi");

        for(var name : names){
            System.out.println(name);
        }


        System.out.println("ITERATOR");

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

    }
}
