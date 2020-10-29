package com.google.android.gms.tasks;

public class Task<TResult> {
  public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> listener) {
    listener.onComplete(new Task<TResult>());
    return this;
  }

  public Task<TResult> addOnFailureListener(OnFailureListener<TResult> listener) {
    listener.onFailure(new UnsupportedOperationException());
    return this;
  }

  public Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> listener) {
    return this;
  }

  public TResult getResult() {
    return null;
  }

  public boolean isSuccessful() {
    return false;
  }

  public TResult result = null;

  public Exception exception = null;
}
