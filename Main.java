import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task(120, true, "Task 1", "Fix bug in login system"));
        tasks.add(new Task(60, false, "Task 2", "Write documentation for API"));
        tasks.add(new Task(180, true, "Task 3", "Design database schema"));
        tasks.add(new Task(90, false, "Task 4", "Test user interface"));
        tasks.add(new Task(45, true, "Task 5", "Update dependencies"));
        tasks.add(new Task(150, true, "Task 6", "Refactor codebase"));
        tasks.add(new Task(200, true, "Task 7", "Optimize performance"));
        tasks.add(new Task(30, false, "Task 8", "Client meeting"));
        tasks.add(new Task(75, false, "Task 9", "Code review"));
        tasks.add(new Task(100, false, "Task 10", "Create unit tests"));

        tasks = scheduleTasks(tasks);

        for (Task task : tasks) {
            printTask(task);
            System.out.println();
        }
    
    }

    public static void printTask(Task task) {
        System.out.println("Task Name: " + task.getTaskName());
        System.out.println("Task Description: " + task.getTaskDescription());
        System.out.println("Time Length: " + task.getTimeLength());
        System.out.println("Severity: " + task.getSeverity());
    }

    public static ArrayList<Task> scheduleTasks(ArrayList<Task> tasks) {
        ArrayList<Task> nonSeverityOrderedTasks = new ArrayList<Task>();
        ArrayList<Task> severityOrderedTasks = new ArrayList<Task>();
        ArrayList<Task> scheduledTasks = new ArrayList<Task>();

        for (Task task : tasks) {
            if (task.getSeverity()) {
                severityOrderedTasks.add(task);
            } else {
                nonSeverityOrderedTasks.add(task);
            }
        }

        severityOrderedTasks = quickSort(severityOrderedTasks, 0, severityOrderedTasks.size() - 1);
        nonSeverityOrderedTasks = quickSort(nonSeverityOrderedTasks, 0, nonSeverityOrderedTasks.size() - 1);

        scheduledTasks.addAll(severityOrderedTasks);
        scheduledTasks.addAll(nonSeverityOrderedTasks);



        return scheduledTasks;
    }

    public static int partition(ArrayList<Task> tasks, int low, int high) {
        Task pivot = tasks.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tasks.get(j).getTimeLength() < pivot.getTimeLength()) {
                i++;
                Task temp = tasks.get(i);
                tasks.set(i, tasks.get(j));
                tasks.set(j, temp);
            }
        }

        Task temp = tasks.get(i + 1);
        tasks.set(i + 1, tasks.get(high));
        tasks.set(high, temp);

        return i + 1;
    }

    public static ArrayList<Task> quickSort(ArrayList<Task> tasks, int low, int high) {
        if (low < high) {
            int pi = partition(tasks, low, high);

            quickSort(tasks, low, pi - 1);
            quickSort(tasks, pi + 1, high);
        }

        return tasks;
    }


}
