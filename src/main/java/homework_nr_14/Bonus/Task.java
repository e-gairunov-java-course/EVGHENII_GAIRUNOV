package homework_nr_14.Bonus;

import homework_nr_7.Date;

public class Task {
    private String name;
    private String description;
    private Priority priority;
    private Date deadline;
    private Status status;

    public Task(String name, String description, Priority priority, Date deadline, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadline = deadline;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Date getDeadline() {
        return deadline;
    }
}
