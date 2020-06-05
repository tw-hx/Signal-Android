package org.thoughtcrime.securesms.scribbles;

import android.graphics.Bitmap;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

class FirebaseFaceDetector implements FaceDetector {
  // I'm not going to stub this out in the GMS tree, too much for now.
  // OWS needs to replace with OpenCV or similar on their end.

  public List<RectF> detect(Bitmap source) {
    return Collections.emptyList();
  }
}
