package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggu implements oa, ghg {
    private boolean a;
    private final /* synthetic */ int b;
    private final Object c;

    public ggu(oa oaVar, int i) {
        this.b = i;
        this.c = oaVar;
    }

    private final void c() {
        ((GestureDetector) this.c).onTouchEvent(MotionEvent.obtain(0L, 1L, 3, brg.a, brg.a, 0));
    }

    @Override // defpackage.ghg
    public final void a() {
        int i = this.b;
        this.a = false;
        if (i != 0) {
            return;
        }
        c();
    }

    @Override // defpackage.ghg
    public final boolean b() {
        if (this.b != 0) {
            return this.a;
        }
        return true;
    }

    @Override // defpackage.oa
    public final void d(boolean z) {
        if (this.b != 0) {
            this.a = true;
        } else {
            if (!z) {
                return;
            }
            this.a = true;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oa, java.lang.Object] */
    @Override // defpackage.oa
    public final void e(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b != 0) {
            this.c.k(recyclerView, motionEvent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [oa, java.lang.Object] */
    @Override // defpackage.oa
    public final boolean k(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b != 0) {
            if (this.a && nq.v(motionEvent)) {
                this.a = false;
            }
            if (!this.a && this.c.k(recyclerView, motionEvent)) {
                return true;
            }
            return false;
        }
        if (this.a && nq.v(motionEvent)) {
            this.a = false;
        }
        if (!this.a && ((GestureDetector) this.c).onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public ggu(GestureDetector gestureDetector, int i) {
        this.b = i;
        d.s(true);
        this.c = gestureDetector;
    }
}
