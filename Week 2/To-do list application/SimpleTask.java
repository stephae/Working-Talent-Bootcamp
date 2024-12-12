public class SimpleTask extends Task {
    public SimpleTask(int id, String description) {
        super(id, description);
    }

    @Override
    public void markAsCompleted() {
        setCompleted(true);
    }

    @Override
    public String toString() {
        return "Simple Task [ID= " + getId() + ", Description= " + getDescription() + ", Completed= " + isCompleted() + "]";
    }
}
