package com.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Set<User> users = new HashSet<>();
        
        while(true) {
            users.add(new User("35", "Enes"));    
        }
    } 
}
