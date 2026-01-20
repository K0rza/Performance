package com.example;

public class App 
{
    private static Subject subject = new Subject();
    
    public static void main( String[] args )
    {
        while(true) {
            subject.subscribe(new Observer());

            try { Thread.sleep(1); } 
            catch (InterruptedException e) {}    
        }
    }
}
