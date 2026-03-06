public class ForEachLoop {
    public static void main(String[] args) {
        /*Manual use for loop*/

        String[] greets = {
                "Hello","World","!",
                "Java","Languages"
        };

        for (var counter = 0; counter < greets.length;counter++){
            System.out.println(greets[counter]);
        }

        /*use FOR EACH*/
        System.out.println("FOR EACH");
        for (var value:greets) {
            System.out.println(value);
        }
    }
}
