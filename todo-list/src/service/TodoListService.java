package service;


public interface TodoListService {
    void displayTodoList();

    void displayTodoList(String todo);

    void removeTodoList(int index);
}
