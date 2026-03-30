package service;

import entity.Todolist;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{


    private TodoListRepository todoListRepository;

    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public void displayTodoList() {

        Todolist[] model = todoListRepository.getAll();

        System.out.println("TODO LIST");
        for (var count = 0; count < model.length; count++) {
            if (model[count] != null) {
                System.out.println(count + 1 + ". " + model[count].getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todoListRepository.add(todolist);

        System.out.println("Succesfully add todolist : "+todo);

    }

    @Override
    public void removeTodoList(int index) {
        boolean isSuccess = todoListRepository.remove(index);
        if(isSuccess){
            System.out.println("Success delete todo list :" +index);
        }else {
            System.out.println("Failed delete todo list :" +index);
        }
    }
}
