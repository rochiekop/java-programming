package service;


public interface TodoListService {
    void displayTodoList();

    void addTodoList(String todo);

    void removeTodoList(int index);
}
