package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class FirebaseMessagingService extends Service {
  @Override
  public IBinder onBind(Intent intent) {
    return null;
  }

  public abstract void onDeletedMessages();

  public abstract void onMessageReceived(RemoteMessage remoteMessage);

  public abstract void onNewToken(String token);
}
