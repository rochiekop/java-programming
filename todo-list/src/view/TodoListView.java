package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;


    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void displayTodoList(){
        while (true) {
            todoListService.displayTodoList();
            System.out.println("PILIHAN : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Exit");

            var pilihan = InputUtil.input("Pilih");

            if (pilihan.equals("1")) {
                addTodoList();
            } else if (pilihan.equals("2")) {
                removeTodoList();
            } else if (pilihan.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak tersedia");
            }
        }
    }

    public void addTodoList(){
        System.out.println("Add TODO List");

        var todo = InputUtil.input("Todo (x jika batal)");

        if(todo.equals("x")){
            /**/
        }else{
            todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList(){
        System.out.println("Remove TODO List");

        var idx = InputUtil.input("Remove data");

        if(idx.equals("x")){
            //pass
        }else{
            todoListService.removeTodoList(Integer.parseInt(idx));
        }
    }
}
