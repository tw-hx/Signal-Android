package com.google.firebase.database;

public class DataSnapshot {

    public <T> T getValue(Class<T> c) {
        return null;
    }

    public DataSnapshot[] getChildren() {
        return new DataSnapshot[]{};
    }

    public boolean hasChild(String var1) {
        return false;
    }

    public String getKey() {
        return "";
    }

}
