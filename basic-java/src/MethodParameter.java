public class MethodParameter {
    public static void main(String[] args) {
        greetsHello("Jhon","Doe 1");
        greetsHello("Jhon","Doe 2");
    }

    static void greetsHello(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName +" Welcome to application");
    }
}
