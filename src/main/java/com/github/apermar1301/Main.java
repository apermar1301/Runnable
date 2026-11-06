package com.github.apermar1301;

public class Main {



    public static void main(String[] args) {
        Thread thread;
        int priority = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                priority = Thread.MAX_PRIORITY;
            } else {
                priority = Thread.MIN_PRIORITY;
            }
            thread = new Thread(new Power(i), "Thread-" + i);
            thread.setPriority(priority);
            thread.start();
        }
    }
}