package com.example;

public class Observer {

    private byte[] data = new byte[1024*1024];

    public void update() {
        System.out.println("Notifed");
    }

}
