package com.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws InterruptedException
    {
        Handler handler = new Handler();

        while(true) {
            handler.handleRequestsInQueue();
            Thread.sleep(1);
        }
    }
}
