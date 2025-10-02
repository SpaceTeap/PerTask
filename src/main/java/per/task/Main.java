package per.task;


import per.task.Connection.DatabaseConnector;

public class Main {
    public static void main(String[] args) {
        DatabaseConnector.connect();
        System.out.println("Hello world!");
    }
}