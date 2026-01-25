package org.signal.billing

import android.content.Context
import org.signal.core.util.billing.BillingApi
import org.signal.core.util.billing.BillingDependencies
import org.signal.core.util.billing.OneTimePurchaseApi

/**
 * Website builds do not support google play billing.
 */
object BillingFactory {
  @JvmStatic
  fun create(billingDependencies: BillingDependencies, isBackupsAvailable: Boolean): BillingApi {
    return BillingApi.Empty
  }

  fun createOneTimePurchaseApi(context: Context, isAvailable: Boolean): OneTimePurchaseApi {
    return OneTimePurchaseApi.Empty
  }
}
