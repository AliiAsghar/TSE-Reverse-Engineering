package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nt {
    public qdq d = null;
    private final ArrayList e = new ArrayList();
    public long a = 120;
    public long b = 120;
    public long c = 250;

    public static int a(oo ooVar) {
        int i = ooVar.j;
        int i2 = i & 14;
        if (ooVar.t()) {
            return 4;
        }
        if ((i & 4) == 0) {
            int i3 = ooVar.d;
            int a = ooVar.a();
            if (i3 != -1 && a != -1 && i3 != a) {
                return i2 | 2048;
            }
        }
        return i2;
    }

    public long b() {
        return this.c;
    }

    public ns c(ol olVar, oo ooVar) {
        ns nsVar = new ns();
        nsVar.a(ooVar);
        return nsVar;
    }

    public ns d(ol olVar, oo ooVar, int i, List list) {
        ns nsVar = new ns();
        nsVar.a(ooVar);
        return nsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.oo r9) {
        /*
            r8 = this;
            qdq r0 = r8.d
            if (r0 == 0) goto L9d
            r1 = 1
            r9.n(r1)
            oo r2 = r9.h
            r3 = 0
            if (r2 == 0) goto L13
            oo r2 = r9.i
            if (r2 != 0) goto L13
            r9.h = r3
        L13:
            r9.i = r3
            int r2 = r9.j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto L9d
        L1d:
            android.view.View r2 = r9.a
            java.lang.Object r3 = r0.a
            android.support.v7.widget.RecyclerView r3 = (android.support.v7.widget.RecyclerView) r3
            r3.ap()
            lp r4 = r3.g
            int r5 = r4.c
            r6 = 0
            if (r5 != r1) goto L3b
            android.view.View r1 = r4.d
            if (r1 != r2) goto L33
        L31:
            r1 = r6
            goto L6a
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r9.<init>(r0)
            throw r9
        L3b:
            r7 = 2
            if (r5 == r7) goto L95
            r4.c = r7     // Catch: java.lang.Throwable -> L91
            qdq r5 = r4.e     // Catch: java.lang.Throwable -> L91
            int r5 = r5.V(r2)     // Catch: java.lang.Throwable -> L91
            r7 = -1
            if (r5 != r7) goto L4f
            r4.l(r2)     // Catch: java.lang.Throwable -> L91
            r4.c = r6
            goto L6a
        L4f:
            lo r7 = r4.a     // Catch: java.lang.Throwable -> L91
            boolean r7 = r7.f(r5)     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto L67
            lo r7 = r4.a     // Catch: java.lang.Throwable -> L91
            r7.g(r5)     // Catch: java.lang.Throwable -> L91
            r4.l(r2)     // Catch: java.lang.Throwable -> L91
            qdq r7 = r4.e     // Catch: java.lang.Throwable -> L91
            r7.Y(r5)     // Catch: java.lang.Throwable -> L91
            r4.c = r6
            goto L6a
        L67:
            r4.c = r6
            goto L31
        L6a:
            if (r1 == 0) goto L7a
            oo r2 = android.support.v7.widget.RecyclerView.k(r2)
            od r4 = r3.e
            r4.o(r2)
            od r4 = r3.e
            r4.m(r2)
        L7a:
            r2 = r1 ^ 1
            r3.aq(r2)
            if (r1 != 0) goto L9d
            boolean r1 = r9.x()
            if (r1 == 0) goto L9d
            java.lang.Object r0 = r0.a
            android.view.View r9 = r9.a
            android.support.v7.widget.RecyclerView r0 = (android.support.v7.widget.RecyclerView) r0
            r0.removeDetachedView(r9, r6)
            return
        L91:
            r9 = move-exception
            r4.c = r6
            throw r9
        L95:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r9.<init>(r0)
            throw r9
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nt.e(oo):void");
    }

    public final void f() {
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            ((nr) this.e.get(i)).a();
        }
        this.e.clear();
    }

    public abstract void g(oo ooVar);

    public abstract void h();

    public abstract void i();

    public abstract boolean j(oo ooVar, ns nsVar, ns nsVar2);

    public abstract boolean k(oo ooVar, oo ooVar2, ns nsVar, ns nsVar2);

    public abstract boolean l(oo ooVar, ns nsVar, ns nsVar2);

    public abstract boolean m(oo ooVar, ns nsVar, ns nsVar2);

    public boolean n(oo ooVar) {
        throw null;
    }

    public boolean o(oo ooVar, List list) {
        return n(ooVar);
    }

    public abstract boolean p();
}
