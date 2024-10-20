package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aacn extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ aaco a;
    final /* synthetic */ iyh b;

    public aacn(aaco aacoVar, iyh iyhVar) {
        this.b = iyhVar;
        this.a = aacoVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.a.b = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.b.d()) {
            Runnable runnable = this.a.c;
            if (runnable != null) {
                runnable.run();
                return true;
            }
            return true;
        }
        return false;
    }
}
