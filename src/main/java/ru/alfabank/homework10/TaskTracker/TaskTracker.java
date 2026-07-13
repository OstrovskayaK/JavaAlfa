package ru.alfabank.homework10.tasktracker;

import java.util.ArrayList;

public class TaskTracker {

    private ArrayList<Task> tasks;

    public TaskTracker() {
        this.tasks = new ArrayList<>();
    }
    // добавляем задачув список
    public void addTask(String name) {
        Task newTask = new Task(name);
        tasks.add(newTask);
        System.out.println("Task " + name + " added");
    }
// показываем все задачи
    public void showAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
            return;
        }
        System.out.println("Your tasks: ");
        for (Task task : tasks) {
            task.showTaskInfo();
        }
    }
}
