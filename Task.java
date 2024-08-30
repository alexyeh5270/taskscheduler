public class Task {
    int timeLength;
    boolean severity;
    String taskName;
    String taskDescription;

    public Task(int timeLength, boolean severity, String taskName, String taskDescription) {
        this.timeLength = timeLength;
        this.severity = severity;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    public int getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }

    public boolean getSeverity() {
        return severity;
    }

    public void setSeverity(boolean severity) {
        this.severity = severity;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

}
