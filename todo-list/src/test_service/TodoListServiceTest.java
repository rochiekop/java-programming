package test_service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRespositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListServiceTest {
    public static void main(String[] args) {
        //testAddTodoList();
        testRemoveTodoList();
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

    public static void testAddTodoList(){

        TodoListRepository todoListRepository = new TodoListRespositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Java Basic");
        todoListService.addTodoList("Java Standard Clasess");
        todoListService.addTodoList("Java Todo List");

        //todoListService.removeTodoList(2);

        todoListView.addTodoList();


        /**
         * Display
         */

        todoListService.displayTodoList();
    }


    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRespositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView  = new TodoListView(todoListService);

        todoListService.addTodoList("Java Basic");
        todoListService.addTodoList("Java Standard Clasess");
        todoListService.addTodoList("Java Todo List");

        /**
         * Display
         */
        todoListService.displayTodoList();
        todoListView.removeTodoList();
        todoListService.displayTodoList();
    }


}

