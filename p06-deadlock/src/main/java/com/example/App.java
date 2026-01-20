package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Object LOCK_1 = new Object();
    private static final Object LOCK_2 = new Object();

    public static void main( String[] args ) {
        System.out.println( "application begins." );

        Thread t1 = new Thread(() ->{
            synchronized (LOCK_1) {
                try {
                    System.out.println("Thread-1 Locked by LOCK_1");
                    Thread.sleep(1000);
                    System.out.println("Thread-1 waiting for LOCK_2");
                    synchronized(LOCK_2) {
                        System.out.println("Thread-1 Locked by LOCK_2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-1");

        Thread t2 = new Thread(() ->{
            synchronized (LOCK_2) {
                try {
                    System.out.println("Thread-2 Locked by LOCK_2");
                    Thread.sleep(1000);
                    System.out.println("Thread-2 waiting for LOCK_1");
                    synchronized(LOCK_1) {
                        System.out.println("Thread-2 Locked by LOCK_1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Thread-2");


        t1.start();
        t2.start();
    }
}
