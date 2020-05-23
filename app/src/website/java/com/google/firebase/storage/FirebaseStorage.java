package com.google.firebase.storage;

public class FirebaseStorage {

    public static FirebaseStorage getInstance() {
        return new FirebaseStorage();
    }

    public StorageReference getReference() {
        return new StorageReference();
    }

    public StorageReference getReferenceFromUrl(String u) {
        return new StorageReference();
    }

}
