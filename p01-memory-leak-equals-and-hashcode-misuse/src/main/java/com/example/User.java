package com.example;

public class User {
    private String id;
    private String name;
    private byte[] bigData = new byte[1024]; // 1 KB

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof User)) return false;
        return id.equals(((User) obj).id);
    }

    //no hashcode() implementation!

}
