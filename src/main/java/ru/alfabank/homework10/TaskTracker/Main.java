package ru.alfabank.homework10.tasktracker;

public class Main {
    static void main() {
        TaskTracker tasktracker = new TaskTracker();

        tasktracker.addTask("Start doing Java homework");
        tasktracker.addTask("Cry");
        tasktracker.addTask("Finish Java homework");

        System.out.println("All tasks ");
        tasktracker.showAllTasks();

       tasktracker.markAsDoneByName("Cry");

        System.out.println("All tasks ");
        tasktracker.showAllTasks();

        System.out.println("Statistics");
        tasktracker.showStatistics();
    }
}
