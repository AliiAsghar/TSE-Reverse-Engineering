package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnz extends nq {
    public int a;
    public int b;
    public final gny c;
    public int d;
    public boolean e;
    public gvf f;
    private final ViewPager2 g;
    private final RecyclerView h;
    private final LinearLayoutManager i;
    private int j;
    private boolean k;
    private boolean l;

    public gnz(ViewPager2 viewPager2) {
        this.g = viewPager2;
        RecyclerView recyclerView = viewPager2.e;
        this.h = recyclerView;
        this.i = (LinearLayoutManager) recyclerView.m;
        this.c = new gny();
        aa();
    }

    private final void Z(int i, float f, int i2) {
        gvf gvfVar = this.f;
        if (gvfVar != null) {
            gvfVar.h(i, f, i2);
        }
    }

    private final void aa() {
        this.a = 0;
        this.b = 0;
        this.c.a();
        this.j = -1;
        this.d = -1;
        this.k = false;
        this.l = false;
        this.e = false;
    }

    private final boolean ab() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final void W(int i) {
        if (this.b != i) {
            this.b = i;
            gvf gvfVar = this.f;
            if (gvfVar != null) {
                gvfVar.bT(i);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        if (r7[r3 - 1][1] >= r8) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0116, code lost:
    
        if (r1.at() <= 1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnz.X():void");
    }

    public final boolean Y() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
    
        if (r5 == r3.g.g()) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // defpackage.nq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dG(android.support.v7.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.l = r4
            r3.X()
            boolean r0 = r3.k
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L37
            r3.k = r2
            if (r6 > 0) goto L1f
            if (r6 != 0) goto L29
            if (r5 < 0) goto L16
            r5 = r2
            goto L17
        L16:
            r5 = r4
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.g
            boolean r6 = r6.g()
            if (r5 != r6) goto L29
        L1f:
            gny r5 = r3.c
            int r6 = r5.c
            if (r6 == 0) goto L29
            int r5 = r5.a
            int r5 = r5 + r4
            goto L2d
        L29:
            gny r5 = r3.c
            int r5 = r5.a
        L2d:
            r3.d = r5
            int r6 = r3.j
            if (r6 == r5) goto L45
            r3.k(r5)
            goto L45
        L37:
            int r5 = r3.a
            if (r5 != 0) goto L45
            gny r5 = r3.c
            int r5 = r5.a
            if (r5 != r1) goto L42
            r5 = r2
        L42:
            r3.k(r5)
        L45:
            gny r5 = r3.c
            int r6 = r5.a
            if (r6 != r1) goto L4c
            r6 = r2
        L4c:
            float r0 = r5.b
            int r5 = r5.c
            r3.Z(r6, r0, r5)
            gny r5 = r3.c
            int r6 = r5.a
            int r0 = r3.d
            if (r6 == r0) goto L5d
            if (r0 != r1) goto L6b
        L5d:
            int r5 = r5.c
            if (r5 != 0) goto L6b
            int r5 = r3.b
            if (r5 == r4) goto L6b
            r3.W(r2)
            r3.aa()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnz.dG(android.support.v7.widget.RecyclerView, int, int):void");
    }

    public final void k(int i) {
        gvf gvfVar = this.f;
        if (gvfVar != null) {
            gvfVar.g(i);
        }
    }

    @Override // defpackage.nq
    public final void t(RecyclerView recyclerView, int i) {
        if ((this.a != 1 || this.b != 1) && i == 1) {
            this.a = 1;
            int i2 = this.d;
            if (i2 != -1) {
                this.j = i2;
                this.d = -1;
            } else if (this.j == -1) {
                this.j = this.i.L();
            }
            W(1);
            return;
        }
        if (ab() && i == 2) {
            if (this.l) {
                W(2);
                this.k = true;
                return;
            }
            return;
        }
        if (ab() && i == 0) {
            X();
            if (!this.l) {
                int i3 = this.c.a;
                if (i3 != -1) {
                    Z(i3, brg.a, 0);
                }
            } else {
                gny gnyVar = this.c;
                if (gnyVar.c == 0) {
                    int i4 = this.j;
                    int i5 = gnyVar.a;
                    if (i4 != i5) {
                        k(i5);
                    }
                }
            }
            W(0);
            aa();
        }
        if (this.a == 2 && i == 0 && this.e) {
            X();
            gny gnyVar2 = this.c;
            if (gnyVar2.c == 0) {
                int i6 = this.d;
                int i7 = gnyVar2.a;
                if (i6 != i7) {
                    if (i7 == -1) {
                        i7 = 0;
                    }
                    k(i7);
                }
                W(0);
                aa();
            }
        }
    }
}
