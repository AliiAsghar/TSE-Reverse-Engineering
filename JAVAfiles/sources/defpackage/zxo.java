package defpackage;

import android.view.ScaleGestureDetector;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxo extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float a = 1.0f;
    private final apwt b;

    public zxo(apwt apwtVar) {
        this.b = apwtVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        super.onScale(scaleGestureDetector);
        ((Optional) this.b.b()).ifPresent(new zcd(this, scaleGestureDetector, 4, null));
        this.a = scaleGestureDetector.getScaleFactor();
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a = 1.0f;
        super.onScaleEnd(scaleGestureDetector);
    }
}
