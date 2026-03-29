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
    public void displayTodoList(String todo) {

    }

    @Override
    public void removeTodoList(int index) {

    }
}
