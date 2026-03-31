import repository.TodoListRepository;
import repository.TodoListRespositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        TodoListRepository todoListRepository = new TodoListRespositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.displayTodoList();
    }
}