package com.example;

import java.util.ArrayList;
import java.util.List;

public class Handler {

    private final List<Message> data = new ArrayList<>();

    public void handleRequestsInQueue() {
        data.add(new Message());
    }

}
