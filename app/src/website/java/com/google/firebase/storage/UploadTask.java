package com.google.firebase.storage;

import android.net.Uri;

import com.google.android.gms.tasks.OnSuccessListener;

public class UploadTask {

    public interface TaskSnapshot {
        Uri getDownloadUrl();
    }

    public void addOnSuccessListener(OnSuccessListener a) {
    }

}
