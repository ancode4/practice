package com.example.multithreading;

public class Processor {
    int value = 1;

    public void send() throws InterruptedException {
        synchronized (this){
            System.out.println("Initial value: " + value);
            value++;
            System.out.println("Sender is executing, incrementing value\n Value = " + value);
            wait();
            System.out.println("---send() wait over-----");

            System.out.println("Value: " + value);
        }
    }
    public void consume() throws InterruptedException {
        Thread.sleep(3000);
        synchronized (this) {
            System.out.println("-------------------------");
            System.out.println("Consumer started executing");
            System.out.println("Value: " + value);
            value++;
            System.out.println("Value is incremented, value = " + value);
            notify();
        }
    }
}
