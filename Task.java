public class Task {
    int timeLength;
    int severity;
    String taskName;
    String taskDescription;

    public Task(int timeLength, int severity, String taskName, String taskDescription) {
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

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
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
