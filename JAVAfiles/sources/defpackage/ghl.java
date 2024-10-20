package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghl extends ggy {
    private final Runnable b;
    private final Runnable c;
    private final Runnable d;
    private final ico e;

    public ghl(ghj ghjVar, ico icoVar, Runnable runnable, gvf gvfVar, gvf gvfVar2, Runnable runnable2, Runnable runnable3) {
        super(ghjVar);
        boolean z;
        d.s(true);
        d.s(true);
        d.s(true);
        if (gvfVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(gvfVar != null);
        d.s(true);
        this.e = icoVar;
        this.b = runnable;
        this.c = runnable2;
        this.d = runnable3;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (nq.x(motionEvent) && onSingleTapUp(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ggx E;
        if (this.e.D(motionEvent) && (E = this.e.E(motionEvent)) != null) {
            this.d.run();
            c(motionEvent);
            if (!this.a.k(E.a)) {
                b(E);
                if (this.a.j()) {
                    this.b.run();
                }
                this.c.run();
            }
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ggx E = this.e.E(motionEvent);
        if (E != null && E.a()) {
            if (this.a.i()) {
                c(motionEvent);
                if (this.a.k(E.a)) {
                    this.a.l(E.a);
                    return true;
                }
                b(E);
                return true;
            }
            return false;
        }
        return this.a.h();
    }
}
