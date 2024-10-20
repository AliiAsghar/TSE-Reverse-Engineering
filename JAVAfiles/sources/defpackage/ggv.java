package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggv implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {
    private final ico a;

    public ggv() {
        GestureDetector.SimpleOnGestureListener simpleOnGestureListener = new GestureDetector.SimpleOnGestureListener();
        d.s(true);
        this.a = new ico(simpleOnGestureListener);
    }

    public final void a(int i, GestureDetector.OnGestureListener onGestureListener) {
        this.a.B(i, onGestureListener);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.A(motionEvent))).onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.A(motionEvent))).onDoubleTapEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.a.A(motionEvent)).onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.a.A(motionEvent2)).onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.a.A(motionEvent)).onLongPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.a.A(motionEvent2)).onScroll(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.a.A(motionEvent)).onShowPress(motionEvent);
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.a.A(motionEvent))).onSingleTapConfirmed(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.a.A(motionEvent)).onSingleTapUp(motionEvent);
    }
}
