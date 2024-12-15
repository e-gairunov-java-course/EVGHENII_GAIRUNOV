package homework_nr_14.Bonus;

import homework_nr_7.Date;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.showTaskList();
        Task t1 = taskManager.addTask("Task1","task1",Priority.HIGH,new Date(10,12,2020));
        Task t2 = taskManager.addTask("Task2","task2",Priority.MEDIUM,new Date(11,11,2021));
        Task t3 = taskManager.addTask("Task3","task3",Priority.LOW,new Date(12,10,2022));
        Task t4 = taskManager.addTask("Task4","task4",Priority.HIGH,new Date(13,9,2023));
        Task t5 = taskManager.addTask("Task5","task5",Priority.MEDIUM,new Date(14,8,2024));
        Task t6 = taskManager.addTask("Task6","task6",Priority.LOW,new Date(15,7,2025));
        Task t7 = taskManager.addTask("Task7","task7",Priority.HIGH,new Date(16,6,2026));
        Task t8 = taskManager.addTask("Task8","task8",Priority.MEDIUM,new Date(17,5,2027));
        Task t9 = taskManager.addTask("Task9","task9",Priority.LOW,new Date(18,4,2028));
        Task t0 = taskManager.addTask("Task0","task0",Priority.HIGH,new Date(19,3,2029));
        System.out.println("-------------------");
        taskManager.showTaskList();

        taskManager.completeTask(t3);
        taskManager.completeTask(t2);
        taskManager.completeTask(t5);
        taskManager.completeTask(t8);
        taskManager.completeTask(t0);
        System.out.println("-------------------");
        taskManager.showTaskList();

        taskManager.removeTask(t1);
        taskManager.removeTask(t3);
        taskManager.removeTask(t5);
        taskManager.removeTask(t7);
        taskManager.removeTask(t9);
        System.out.println("-------------------");
        taskManager.showTaskList();
    }
}
