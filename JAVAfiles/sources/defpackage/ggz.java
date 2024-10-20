package defpackage;

import android.util.Log;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggz extends ggy {
    private boolean b;
    private boolean c;
    private final ico d;

    public ggz(ghj ghjVar, ico icoVar, gvf gvfVar, gvf gvfVar2) {
        super(ghjVar);
        boolean z;
        d.s(true);
        if (gvfVar != null) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        d.s(gvfVar2 != null);
        this.d = icoVar;
    }

    private final void d(ggx ggxVar, MotionEvent motionEvent) {
        boolean z;
        if (!nq.z(motionEvent)) {
            if (ggxVar != null) {
                z = true;
            } else {
                z = false;
            }
            d.s(z);
            d.s(ggy.a(ggxVar));
            this.a.h();
            return;
        }
        b(ggxVar);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.b = false;
        if (this.d.D(motionEvent) && !nq.B(motionEvent)) {
            this.d.E(motionEvent);
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ggx E;
        if ((nq.u(motionEvent.getMetaState(), 2) && nq.A(motionEvent)) || nq.y(motionEvent, 2)) {
            this.c = true;
            if (this.d.D(motionEvent) && (E = this.d.E(motionEvent)) != null && !this.a.k(E.a)) {
                this.a.h();
                b(E);
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent2.getToolType(0) == 3 && nq.w(motionEvent2) && motionEvent2.getButtonState() == 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ggx E;
        if (this.b) {
            this.b = false;
            return false;
        }
        if (this.a.i() || !this.d.C(motionEvent) || nq.B(motionEvent) || (E = this.d.E(motionEvent)) == null || !E.a()) {
            return false;
        }
        d(E, motionEvent);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        boolean z = false;
        if (this.c) {
            this.c = false;
            return false;
        }
        if (!this.d.D(motionEvent)) {
            this.a.h();
            return false;
        }
        if (nq.B(motionEvent) || !this.a.i()) {
            return false;
        }
        ggx E = this.d.E(motionEvent);
        if (!this.a.i()) {
            Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
        } else {
            if (E != null) {
                z = true;
            }
            d.s(z);
            c(motionEvent);
            if (!nq.z(motionEvent) && !this.a.k(E.a)) {
                this.a.h();
            }
            if (this.a.k(E.a)) {
                this.a.l(E.a);
            } else {
                d(E, motionEvent);
            }
        }
        this.b = true;
        return true;
    }
}
