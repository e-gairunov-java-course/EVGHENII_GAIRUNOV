package homework_nr_14.Bonus;

import homework_nr_7.Date;

import java.util.LinkedList;
import java.util.List;

public class TaskManager {
    private final List<Task> taskList;

    public TaskManager(List<Task> taskList) {
        this.taskList = taskList;
    }

    public TaskManager() {
        this.taskList = new LinkedList<>();
    }

    public Task createTask(String name, String description, Priority priority, Date deadline){
        return new AddTaskAction(name, description, priority, deadline).perform();
    }

    public boolean addTask(Task task){
        if(task == null) return false;
        taskList.add(task);
        return true;
    }

    public Task addTask(String name, String description, Priority priority, Date deadline){
        Task task = createTask(name, description, priority, deadline);
        if(task != null) addTask(task);
        return task;
    }

    public void showTaskList(){
        if(taskList.isEmpty()){
            System.out.println("There isn't any task in the list.");
            return;
        }
        System.out.println("Current list of tasks is printed below:");
        for(Task task : taskList){
            System.out.println(task.getName() + " \t:\t" + task.getDescription() + " \t:\t" + task.getPriority() + " \t:\t" + task.getStatus() + " \t:\t" + task.getDeadline());
        }
    }

    public Task completeTask(Task task){
        if(task == null){
            System.out.println("Can't terminate nonexistent task.");
            return null;
        }
        return new CompleteTaskAction(task).perform();
    }

    public Task removeTask(Task task){
        if(task == null){
            System.out.println("Can't delete nonexistent task.");
            return null;
        }
        if(taskList.contains(task)){
            taskList.remove(task);
            return task;
        }
        System.out.println("No such task in the list of tasks.");
        return null;
    }
}
