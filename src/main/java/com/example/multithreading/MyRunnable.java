package com.example.multithreading;

public class MyRunnable {
    private static class RunnableEg implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("RunnableEg running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable2 = () -> System.out.println("Runnable2 running");

        RunnableEg myRunnable = new RunnableEg();

        Thread egThread = new Thread(myRunnable);
        Thread secondThread = new Thread(runnable2);

        egThread.start();
        //egThread.join(); // main() thread will stop until egThread has finished
        secondThread.start();
    }

}
