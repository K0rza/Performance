package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        while(true) {
            new Thread(App::processMsg).start();
            try {Thread.sleep(100); } 
            catch (InterruptedException e) {}
        }
    }

    private static void processMsg() {
        System.out.println("TEST");
    }
}
