package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final int MAX_PROCESSOR_CNT = 6;
    private static boolean validity = false;

    public static void main( String[] args )
    {
    
        for (int i = 0; i < MAX_PROCESSOR_CNT; i++) {
            new Thread(() -> {
                String name = Thread.currentThread().getName();
                System.out.println(name + " başladı");

                while(!validity) {

                }
                System.out.println(name + " devam ediyor");
            }, "worker-" + i).start();
        }

        new Thread(() -> {

            try { Thread.sleep(5000);}
            catch (InterruptedException e) {}

            System.out.println("VALIDTY = TRUE");
            validity = true;
        }, "worker-killer").start();
    }




}
