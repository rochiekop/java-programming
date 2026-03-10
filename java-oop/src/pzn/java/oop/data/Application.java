package pzn.java.oop.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Access class Application");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
