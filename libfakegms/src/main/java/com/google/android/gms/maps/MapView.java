package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class MapView extends View {
  public MapView(Context context) {
    super(context);
  }

  public MapView(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  public MapView(Context context, AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  public void getMapAsync(OnMapReadyCallback cb) {
  }

  public void onCreate(Object o) {
  }

  public void onDestroy() {
  }

  public void onPause() {
  }

  public void onResume() {
  }
}
