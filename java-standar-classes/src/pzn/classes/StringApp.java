package pzn.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Eko Pambudi";
        String  lowerName = name.toLowerCase();
        System.out.println(lowerName);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        String[] splitName = name.split(" ");
        for(var i:splitName){
            System.out.println(i);
        }
    }
}
