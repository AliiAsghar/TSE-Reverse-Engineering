package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qt extends GestureDetector.SimpleOnGestureListener {
    public boolean a = true;
    final /* synthetic */ qx b;

    public qt(qx qxVar) {
        this.b = qxVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        View k;
        oo j;
        if (this.a && (k = this.b.k(motionEvent)) != null && (j = this.b.m.j(k)) != null) {
            qx qxVar = this.b;
            if (qxVar.j.i(qxVar.m, j)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = this.b.i;
                if (pointerId == i) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    qx qxVar2 = this.b;
                    qxVar2.c = x;
                    qxVar2.d = y;
                    qxVar2.f = brg.a;
                    qxVar2.e = brg.a;
                    if (qxVar2.j.k()) {
                        this.b.ac(j, 2);
                    }
                }
            }
        }
    }
}
