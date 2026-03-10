package pzn.java.oop.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " Pambudi";
        System.out.println(first);
        String second = "Eko Pambudi";
        System.out.println(second);

        System.out.println(first == second);

        String third = "Eko Pambudi";
        System.out.println(third == second);
    }
}
