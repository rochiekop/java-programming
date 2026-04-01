package application;

import generic.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String,Integer>("Eko",1000);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
