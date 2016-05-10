package gen;
import java.util.ArrayList;
import java.util.List;

public class Execut<T> implements Executor<T> {
    private List<Task<? extends T>> tasks = new ArrayList<>();
    private List<T> validRes = new ArrayList<>();
    private List<T> invalidRes = new ArrayList<>();
    private Validator<? super T> validator;
    private boolean tasksExecuted;

    @Override
    public void addTask(Task<? extends T> task) {

        tasks.add(task);

    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) {

        this.validator = validator;
        tasks.add(task);

    }

    @Override
    public void execute() {
        for (Task<? extends T> task : tasks) {
            task.execute();
            T item = task.getResult();

            if (validator.isValid(item)) {
                validRes.add(item);
            } else {
                invalidRes.add(item);
            }
        }

        tasksExecuted = true;
    }

    @Override
    public List<T> getValidResults() {
        checkIfTasksAreExecuted();
        return validRes;
    }

    private void checkIfTasksAreExecuted() {
        if (!tasksExecuted){
        }
    }

    @Override
    public List<T> getInvalidResults() {
        checkIfTasksAreExecuted();
        return invalidRes;
    }
}