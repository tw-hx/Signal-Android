package com.google.android.gms.wallet;

import android.app.Activity;
import android.content.Context;

public final class Wallet {
  public static final class WalletOptions {
    public static final class Builder {
      public Builder setEnvironment(int environment)  {
        return this;
    }

      public WalletOptions build()  {
        return new WalletOptions();
      }
    }
  }

  public static PaymentsClient getPaymentsClient(Context context, Wallet.WalletOptions options) {
    return new PaymentsClient();
  }
}
