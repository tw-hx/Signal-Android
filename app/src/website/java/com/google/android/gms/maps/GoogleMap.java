package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.LatLng;
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

  public interface cb0 {
    public void function();
  }

  public void setOnCameraIdleListener(cb0 callback) {
  }

  public interface cb1 {
    public void function(Object o);
  }

  public void setOnCameraMoveStartedListener(cb1 callback) {
  }

  public interface OnMapLoadedCallback {
    public void onMapLoaded();
  }

  public void setOnMapLoadedCallback(GoogleMap.OnMapLoadedCallback callback) {
  }

  public static interface SnapshotReadyCallback {
    public void onSnapshotReady(Bitmap bitmap);
  }

  public void snapshot(GoogleMap.SnapshotReadyCallback callback) {
  }
}
