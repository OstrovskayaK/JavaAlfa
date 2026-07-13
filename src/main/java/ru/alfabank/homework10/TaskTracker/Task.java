package ru.alfabank.homework10.tasktracker;

public class Task {
    private String taskName;
    private boolean taskStatus;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskStatus = false;
    }

    // отмечаем задачу выполненной
    private void markAsDone() {
        this.taskStatus = true;
    }

    // получаем ее статус
    private boolean getStatus() {
        return this.taskStatus;
    }

}
