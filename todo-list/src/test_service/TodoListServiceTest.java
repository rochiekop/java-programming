package test_service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRespositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        testShowTodoList();

    }

    public static void testShowTodoList(){
        TodoListRespositoryImpl todoListRespository = new TodoListRespositoryImpl();
        todoListRespository.data[0] = new Todolist("Java Todo List");
        todoListRespository.data[1] = new Todolist("Java OOP");
        todoListRespository.data[2] = new Todolist("Java Standar Clasess");
        TodoListService todoListService = new TodoListServiceImpl(todoListRespository);

        // TODO: 3/29/2026
        todoListService.displayTodoList();

    }

}

