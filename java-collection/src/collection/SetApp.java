package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetApp {
    public static void main(String[] args) {
        //HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        hashSet.add("Eko");
        hashSet.add("Rochi");
        hashSet.add("Pambudi");
        hashSet.add("Eko");
        hashSet.add("Rochi");
        hashSet.add("Pambudi");

        System.out.println(hashSet);

        for (var name : hashSet){
            System.out.println(name);
        }
    }
}
