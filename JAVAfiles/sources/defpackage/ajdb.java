package defpackage;

import android.view.ScaleGestureDetector;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajdb extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public ajdb(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.j != null && !zoomableImageView.g()) {
            ZoomableImageView zoomableImageView2 = this.a;
            float f = zoomableImageView2.j.c;
            float f2 = 10.0f * f;
            float f3 = f * 0.7f;
            ajdc ajdcVar = new ajdc(zoomableImageView2.e);
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            float f4 = ajdcVar.c * scaleFactor;
            ajdcVar.c = f4;
            if (f4 >= f3 && f4 < f2) {
                ZoomableImageView zoomableImageView3 = this.a;
                zoomableImageView3.e.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                zoomableImageView3.b(zoomableImageView3.e);
                zoomableImageView3.setImageMatrix(zoomableImageView3.e);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ZoomableImageView zoomableImageView = this.a;
        if (zoomableImageView.j != null && !zoomableImageView.g()) {
            float f = new ajdc(this.a.e).c;
            ZoomableImageView zoomableImageView2 = this.a;
            if (f < zoomableImageView2.j.c) {
                zoomableImageView2.e(zoomableImageView2.d);
            }
        }
    }
}
