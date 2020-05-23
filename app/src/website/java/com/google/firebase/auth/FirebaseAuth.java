package com.google.firebase.auth;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;

public class FirebaseAuth {

    public static FirebaseAuth getInstance() {
        return new FirebaseAuth();
    }

    public interface AuthStateListener {
        void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth);
    }

    public void addAuthStateListener(AuthStateListener l) {
    }

    public void removeAuthStateListener(AuthStateListener l) {
    }

    public void signOut() {
    }

    public FirebaseUser getCurrentUser() {
        return new FirebaseUser();
    }

    public Task<AuthResult> signInWithEmailAndPassword(String n, String p) {
        return new Task<>();
    }

}
