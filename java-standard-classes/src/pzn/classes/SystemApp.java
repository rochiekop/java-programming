package pzn.classes;

public class SystemApp {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("IDEA_INITIAL_DIRECTORY"));
        System.out.println(System.getenv("APP"));

        System.gc();

        System.out.println("before EXIT");
        System.exit(1);
        System.out.println("After EXIT");
    }
}
