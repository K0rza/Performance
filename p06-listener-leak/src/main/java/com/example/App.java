package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Subject subject = new Subject();

        while(true) {
            subject.subscribe(new Observer());

            try { Thread.sleep(1); } 
            catch (InterruptedException e) {}    
        }
    }
}
