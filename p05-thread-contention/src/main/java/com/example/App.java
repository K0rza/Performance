package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Object LOCK = new Object();
    
    public static void main( String[] args )
    {
        for (int i=0; i<10; i++) {
            new Thread(() -> work(), "worker-"+i).start();
        }
    }

    private static void work() {
        String threadName = Thread.currentThread().getName();
        
        synchronized(LOCK) {
            System.out.println(threadName + " thread aldı.");

            processBigMsg();

            System.out.println(threadName + " lock bırakıyor.");
        }
    }

    private static void processBigMsg() {
        long processingTime = System.currentTimeMillis() + 10_000;
        while(System.currentTimeMillis() < processingTime){}
    }
}
