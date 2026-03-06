public class DoWhileLoop {
    public static void main(String[] args) {
        /*Will run at least 1 time*/

        var counter = 100;
        do {
            System.out.println("Iteration "+counter);
            counter++;
        }while (counter<=10);
    }
}
