package com.example.multithreading;

public class WaitAndNotify {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Thread threadOne = new Thread(() -> {
            try {
                processor.send();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread threadTwo = new Thread(() -> {
            try {
                processor.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        threadOne.start();
        threadTwo.start();
    }
}
