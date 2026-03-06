public class Break {
    public static void main(String[] args) {
        var counter = 0;
        while (true){
            System.out.println("Iteration "+counter);
            counter++;

            if (counter>10){
                break;
            }
        }
    }
}
