public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(recursiveLoop(5));
        System.out.println(factorialRecursive(5));

        //loop(10000); Causes StackOverflow
    }

    static int recursiveLoop(int values){
        int total = 1;
        for (int counter=1;counter<=values;counter++){
            total *=counter;
        }
        return total;
    }

    static int factorialRecursive(int values){
        if (values==1){
            return 1;
        }else {
            return values*factorialRecursive(values-1);
        }
    }

    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }
}
