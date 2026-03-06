public class Variable {
    public static void main(String[] args) {
        String welcome;
        welcome = "Hello World!";

        int age = 10;
        String address = "Indonesia";

        System.out.println("Welcome : "+welcome);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);

        /*We can use var to define variable type but need to add value directly*/

        var firstName="Jhon";
        var lastName ="Doe";
        var year = 2026;
        System.out.println(firstName + " "+lastName);

        /* Use final to make prevent variable change*/

        final String application = "Learn Java";
        System.out.println(application);
    }
}
