package com.google.firebase.database;

import com.google.android.gms.tasks.Task;

public class DatabaseReference {

    public DatabaseReference child(String ref) {
        return this;
    }

    public void addValueEventListener(ValueEventListener l) {
    }

    public void addListenerForSingleValueEvent(ValueEventListener s) {
    }

    public void removeEventListener(ValueEventListener l) {
    }

    public DatabaseReference push() {
        return this;
    }

    public String getKey() {
        return "";
    }

    public Task<Void> setValue(Object v) {
        return new Task<>();
    }

    public void removeValue() {
    }

}
