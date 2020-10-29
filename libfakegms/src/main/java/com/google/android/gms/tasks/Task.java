package com.google.android.gms.tasks;

public class Task<T> {
  public void addOnCompleteListener(OnCompleteListener listener) {
    listener.onComplete(new Task<TResult>());
  }

  public Task<T> addOnFailureListener(OnFailureListener listener) {
    return this;
  }

  public Task<T> addOnSuccessListener(OnSuccessListener<T> listener) {
    return this;
  }

  public boolean isSuccessful() {
    return false;
  }

  public TResult getResult() {
    return new TResult();
  }

  public Throwable getException() {
    return new Throwable("");
  }
}
