package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

public class FirebaseInstanceId {

    public static FirebaseInstanceId getInstance() {
        return new FirebaseInstanceId();
    }

    public static Task<Void> getInstanceId() {
        return new Task();
    }

    public void deleteInstanceId() {
    }


    public String getToken() {
        return "";
    }

}
