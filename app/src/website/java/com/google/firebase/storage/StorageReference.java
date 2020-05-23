package com.google.firebase.storage;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class StorageReference {

    public StorageReference child(String ref) {
        return new StorageReference();
    }

    public UploadTask putBytes(byte[] buf) {
        return new UploadTask();
    }

    public Task<AuthResult> delete() {
        return new Task<>();
    }

}
