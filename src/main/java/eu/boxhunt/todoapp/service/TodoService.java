package eu.boxhunt.todoapp.service;

import eu.boxhunt.todoapp.object.Todo;
import eu.boxhunt.todoapp.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(String id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(String id, Todo todoDetails) {
        Optional<Todo> todo = todoRepository.findById(id);
        if (todo.isPresent()) {
            Todo existingTodo = todo.get();
            existingTodo.setText(todoDetails.getText());
            existingTodo.setCompleted(todoDetails.isCompleted());
            return todoRepository.save(existingTodo);
        }
        return null;
    }

    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }
}