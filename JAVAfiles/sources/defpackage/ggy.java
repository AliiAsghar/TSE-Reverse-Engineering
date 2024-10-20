package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
class ggy extends GestureDetector.SimpleOnGestureListener {
    protected final ghj a;

    public ggy(ghj ghjVar) {
        d.s(true);
        d.s(true);
        d.s(true);
        this.a = ghjVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(ggx ggxVar) {
        if (ggxVar != null && ggxVar.a != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.ggx r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            defpackage.d.s(r2)
            r2 = -1
            if (r7 == 0) goto L13
            int r3 = r7.b
            if (r3 == r2) goto L14
            r3 = r0
            goto L15
        L13:
            r7 = 0
        L14:
            r3 = r1
        L15:
            defpackage.d.s(r3)
            boolean r3 = a(r7)
            defpackage.d.s(r3)
            ghj r3 = r6.a
            java.lang.String r4 = r7.a
            if (r4 == 0) goto L27
            r5 = r0
            goto L28
        L27:
            r5 = r1
        L28:
            defpackage.d.s(r5)
            ghh r5 = r3.a
            boolean r5 = r5.c(r4)
            if (r5 == 0) goto L34
            goto L64
        L34:
            ghh r5 = r3.a
            java.util.Set r5 = r5.a
            r5.add(r4)
            r3.e(r4, r0)
            r3.f()
            ghj r3 = r6.a
            int r7 = r7.b
            if (r7 == r2) goto L48
            goto L49
        L48:
            r0 = r1
        L49:
            defpackage.d.s(r0)
            qdq r0 = r3.e
            java.lang.String r0 = r0.B(r7)
            ghh r1 = r3.a
            boolean r0 = r1.c(r0)
            defpackage.d.s(r0)
            qdq r0 = r3.d
            ghd r1 = new ghd
            r1.<init>(r7, r0)
            r3.c = r1
        L64:
            ghj r7 = r6.a
            ghh r7 = r7.a
            r7.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggy.b(ggx):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(MotionEvent motionEvent) {
        if (nq.u(motionEvent.getMetaState(), 1)) {
            this.a.j();
        }
    }
}
