package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aavv implements aawc {
    public RenderOverlay a;
    protected boolean b;

    @Override // defpackage.aawc
    public final void a(Canvas canvas) {
        if (this.b) {
            c(canvas);
        }
    }

    public abstract void c(Canvas canvas);

    public final void d(boolean z) {
        this.b = z;
        RenderOverlay renderOverlay = this.a;
        if (renderOverlay != null) {
            renderOverlay.a.invalidate();
        }
    }

    @Override // defpackage.aawc
    public boolean e(MotionEvent motionEvent) {
        throw null;
    }

    @Override // defpackage.aawc
    public void b(int i, int i2, int i3, int i4) {
    }
}
