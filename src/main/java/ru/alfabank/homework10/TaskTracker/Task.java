package ru.alfabank.homework10.tasktracker;

public class Task {
    private String taskName;
    private boolean taskStatus;

    public Task(String taskName) {
        this.taskName = taskName;
        this.taskStatus = false;
    }

    // отмечаем задачу выполненной
    public void markAsDone() {
        this.taskStatus = true;
    }

    // получаем ее статус
    public boolean getStatus() {
        return this.taskStatus;
    }

    // получаем ее название
    public String getTaskName() {
        return this.taskName;
    }

    // выводим инфо о задаче
    public void showTaskInfo() {
        String statusMark;
        if (this.taskStatus) {
            statusMark = "[x]";
        } else {
            statusMark = "[]";
        }
        System.out.println(statusMark + this.taskName);
    }
}
