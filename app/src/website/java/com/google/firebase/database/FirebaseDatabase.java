package com.google.firebase.database;

public class FirebaseDatabase {

    public static FirebaseDatabase getInstance() {
        return new FirebaseDatabase();
    }

    public DatabaseReference getReference() {
        return new DatabaseReference();
    }

    public DatabaseReference getReference(String ref) {
        return new DatabaseReference();
    }

    public void goOffline() {
    }

    public void goOnline() {
    }

    public void setLogLevel(Logger.Level l) {
    }

}
