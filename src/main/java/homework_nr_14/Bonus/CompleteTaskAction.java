package homework_nr_14.Bonus;

public class CompleteTaskAction implements TaskAction{
    private Task task;

    public CompleteTaskAction(Task task) {
        if(task == null){
            throw new NonExistentTask("Can't terminate nonexistent task.");
        }
        this.task = task;
    }

    @Override
    public Task perform() {
        task.setStatus(Status.COMPLETED);
        return task;
    }
}
