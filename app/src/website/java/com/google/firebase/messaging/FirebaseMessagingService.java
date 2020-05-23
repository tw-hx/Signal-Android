package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.Nullable;

public class FirebaseMessagingService extends Service {

    public void onCreate() {
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {

    }

    public void onNewToken(String token) {
    }

    public void onDeletedMessages() {
    }

}
