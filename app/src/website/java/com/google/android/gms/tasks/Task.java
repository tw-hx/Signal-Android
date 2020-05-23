package com.google.android.gms.tasks;

public class Task<T> {
  public interface OnCompleteListener {
    public void runCB(Task<Void> task);
  }
  
  public void OCLCB(OnCompleteListener listener) {
    listener.runCB(new Task());
  }

  public void addOnCompleteListener(OnCompleteListener listener) {
    OCLCB(listener);
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

  public class TResult {
    public String getToken() {
      return "";
    }
  }

  public TResult getResult() {
    return new TResult();
  }

  public Throwable getException() {
    return new Throwable("");
  }
}
