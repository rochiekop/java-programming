public class AplikasiTodoList {
    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewDisplayTodoList();
    }

    /**
     * Function to Display data
     */
    public static void displayTodoList() {
        System.out.println("TODO LIST");
        for (var count = 0; count < model.length; count++) {
            if (model[count] != null) {
                System.out.println(count + 1 + ". " + model[count]);
            }
        }
    }

    /**
     * Test
     */

    public static void testDisplayTodoList() {
        model[0] = "Hello World!";
        model[1] = "Java Fundamental";
        displayTodoList();
    }

    /**
     * Function to add data
     */
    public static void addTodoList(String todo) {
        /*Let's check availability model list*/
        boolean isFull = true;
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                isFull = false;
                break;
            }
        }

        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            /*Fill temp value to new array*/
            for (var i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }


        //add to model
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        for (var i = 0; i < 11; i++) {
            addTodoList("Number of data " + (i + 1));
        }
        displayTodoList();
    }

    /**
     * Function to remove data
     */
    public static boolean removeTodoList(int index) {

        if ((index - 1) >= model.length) {
            return false;
        } else if (model[index - 1] == null) {
            return false;
        } else {
            for (var i = (index - 1); i < model.length; i++) {
                if (i == (model.length - 1)) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }

            }
            return true;
        }
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");

        System.out.println(removeTodoList(2));
        System.out.println(removeTodoList(20));
        System.out.println(removeTodoList(10));

        displayTodoList();


    }

    public static String input(String value) {
        System.out.print(value + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Name");
        var address = input("Address");
        System.out.println(name);
        System.out.println(address);
    }

    /**
     * CREATE VIEW
     */

    public static void viewDisplayTodoList() {
        while (true) {
            displayTodoList();
            System.out.println("PILIHAN : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Exit");

            var pilihan = input("Pilih");

            if (pilihan.equals("1")) {
                viewAddTodoList();
            } else if (pilihan.equals("2")) {
                viewRemoveTodoList();
            } else if (pilihan.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }

    }

    public static void testViewDisplayTodoList(){
        addTodoList("Hello World");
        addTodoList("Java Fundamental");
        addTodoList("App Todo List");
        viewDisplayTodoList();
    }

    public static void viewAddTodoList() {
        System.out.println("Add TODO List");

        var todo = input("Todo (x jika batal)");

        if(todo.equals("x")){
            /**/
        }else{
            addTodoList(todo);
        }

    }

    public static void testviewAddTodoList(){
        addTodoList("Test 1");
        addTodoList("Test 2");
        viewAddTodoList();
        displayTodoList();
    }

    public static void viewRemoveTodoList() {
        System.out.println("Remove TODO List");

        var idx = input("Remove data");

        if(idx.equals("x")){
            //pass
        }else{
            boolean success = removeTodoList(Integer.valueOf(idx));
            if(!success){
                System.out.println("Gagal Mengapus todolist "+idx);
            }
        }
    }


    public static void testViewRemoveTodoList(){
        addTodoList("Test 1");
        addTodoList("Test 2");
        displayTodoList();
        viewRemoveTodoList();
        displayTodoList();
    }
}
