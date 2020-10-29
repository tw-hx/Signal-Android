package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.MarkerOptions;

public final class GoogleMap {
  public static int MAP_TYPE_NORMAL = 1;

  public void addMarker(MarkerOptions options) {
  }

  public CameraPosition getCameraPosition() {
    return new CameraPosition();
  }

  public UiSettings getUiSettings() {
    return new UiSettings();
  }

  public void moveCamera(CameraUpdate update) {
  }

  public void setBuildingsEnabled(boolean enabled) {
  }

  public void setMapType(int type) {
  }

  public void setMyLocationEnabled(boolean bool) {
  }

  public interface OnCameraIdleListener {
    void function();
  }

  public void setOnCameraIdleListener(GoogleMap.OnCameraIdleListener callback) {
  }

  public interface OnCameraMoveStartedListener {
    void function(Object o);
  }

  public void setOnCameraMoveStartedListener(GoogleMap.OnCameraMoveStartedListener callback) {
  }

  public interface OnMapLoadedCallback {
    void onMapLoaded();
  }

  public void setOnMapLoadedCallback(GoogleMap.OnMapLoadedCallback callback) {
  }

  public static interface SnapshotReadyCallback {
    void onSnapshotReady(Bitmap bitmap);
  }

  public void snapshot(GoogleMap.SnapshotReadyCallback callback) {
  }
}
