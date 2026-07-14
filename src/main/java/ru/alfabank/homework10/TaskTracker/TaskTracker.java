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

    //маркируем как сделанную
    public void markAsDoneByName(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(taskName)){
                task.markAsDone();
                return;
            }
        }
        System.out.println("This task do not exist");
    }

    //получаем статус по названию

    public void getStatusByName(String taskName) {
        for (Task task : tasks) {
            if (task.getTaskName().equals(taskName)){
            String status = task.getStatus() ? "done" : "unfinised";
                System.out.println("Task " + taskName + " is " + status);
                return;
            }
        }
        System.out.println("This task do not exist");
    }

    //выводим статистику
    public void showStatistics() {
        int allTasks = tasks.size();
        int complitedTasks = 0;
        for (Task task : tasks) {
            if (task.getStatus()) {
                complitedTasks++;
            }
        }
int unfinishedTasks = allTasks - complitedTasks;
        System.out.println("Total tasks: " + allTasks);
        System.out.println("Finished tasks: " + complitedTasks);
        System.out.println("Unfinished tasks: " + unfinishedTasks);
    }
}
