package com.example;

public class Handler {

    public synchronized void processBigMsg(int[] buffer) {
        int[] resBuffer = buffer.clone();
        for(int i = 0; i<buffer.length; i++) {
            resBuffer[i] = i*5698523 / 21113 + 153213213 % 35659 >> 3 & 0x01;
            try {Thread.sleep(10); } 
            catch (InterruptedException e) {}
        }

    }

}
