package homework_nr_14.Bonus;

import homework_nr_7.Date;

public class AddTaskAction implements TaskAction{
    private final String name;
    private final String description;
    private final Priority priority;
    private final Date deadline;

    public AddTaskAction(String name, String description, Priority priority, Date deadline) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
    }

    @Override
    public Task perform() {
        try {
            return new Task(name, description, priority, deadline, Status.DELAYED);
        }
        catch (RuntimeException e){
            System.out.println("Can't create task.");
            return null;
        }
    }
}
