package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class crp {
    public static final void a(cqq cqqVar, long j, arqr arqrVar, boolean z) {
        MotionEvent a = cqqVar.a();
        if (a != null) {
            int action = a.getAction();
            if (z) {
                a.setAction(3);
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            arqrVar.a(a);
            a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            a.setAction(action);
            return;
        }
        throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
    }
}
