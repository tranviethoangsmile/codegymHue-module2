package com.codegymhueJava;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;

    public RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running " + threadName);
        for(int i = 4; i > 0; i--) {
            System.out.println("thread: " + threadName + "," + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread: " + threadName + "Exiting");
    }
    public void start() {
        System.out.println("Start: " + threadName);
            if(t == null) {
                t = new Thread(this,threadName);
                t.start();
            }
    }
}
