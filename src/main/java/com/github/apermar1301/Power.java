package com.github.apermar1301;

public class Power implements Runnable {

    private final int number;

    public Power(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        for (int i = 0; i <= 10 ; i++) {
            System.out.printf("%s: %d ^ %d = %d%n", Thread.currentThread().getName(), number, i, (long) Math.pow(number, i));
        }

    }
}
