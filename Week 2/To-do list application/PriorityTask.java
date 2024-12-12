public class PriorityTask extends Task {
    private int priority;

    public PriorityTask(int id, String description, int priority) {
        super(id, description);
        this.priority = priority;
    }

    public int getPriotity() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public void markAsCompleted() {
        setCompleted(true);
    }

    @Override
    public String toString() {
        return "Priority Task [ID= " + getId() + ", Description= " + getDescription() + ", Completed= " + isCompleted() + ", Priority= " + priority + "]";
    }
}
