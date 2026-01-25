package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.tasks.Task;

public class SignInClient {
  public String getPhoneNumberFromIntent(Intent data) {
    throw new UnsupportedOperationException();
  }

  public Task<PendingIntent> getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest) {
    return new Task<PendingIntent>();
  }
}
