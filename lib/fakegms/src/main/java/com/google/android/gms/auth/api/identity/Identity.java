package com.google.android.gms.auth.api.identity;

import android.content.Context;

public final class Identity {
  private Identity() {
  }

  public static SignInClient getSignInClient(Context context) {
    return new SignInClient();
  }
}
