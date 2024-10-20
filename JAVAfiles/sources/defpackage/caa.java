package defpackage;

import defpackage.bwj;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class caa {
    public final cab a;
    public final int[] b;
    public final int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    private final Object[] l;
    private final int m;
    private final bxr n;

    public caa(cab cabVar) {
        this.a = cabVar;
        this.b = cabVar.a;
        int i = cabVar.b;
        this.c = i;
        this.l = cabVar.c;
        this.m = cabVar.d;
        this.f = i;
        this.g = -1;
        this.n = new bxr();
    }

    private final Object A(int[] iArr, int i) {
        if (cad.s(iArr, i)) {
            Object[] objArr = this.l;
            int i2 = i * 5;
            int length = iArr.length;
            if (i2 < length) {
                length = iArr[i2 + 4] + cad.a(iArr[i2 + 1] >> 29);
            }
            return objArr[length];
        }
        return bwj.a.a;
    }

    public final int a() {
        int i = this.e;
        if (i < this.f) {
            return cad.d(this.b, i);
        }
        return 0;
    }

    public final int b(int i) {
        return cad.d(this.b, i);
    }

    public final int c(int i) {
        return cad.c(this.b, i);
    }

    public final int d(int i) {
        return cad.f(this.b, i);
    }

    public final int e(int i) {
        return cad.h(this.b, i);
    }

    public final int f() {
        int f;
        if (this.h != 0) {
            bwp.i("Cannot skip while in an empty region");
        }
        if (cad.v(this.b, this.e)) {
            f = 1;
        } else {
            f = cad.f(this.b, this.e);
        }
        int i = this.e;
        this.e = i + cad.c(this.b, i);
        return f;
    }

    public final bwa g(int i) {
        ArrayList arrayList = this.a.h;
        int i2 = cad.i(arrayList, i, this.c);
        if (i2 < 0) {
            bwa bwaVar = new bwa(i);
            arrayList.add(-(i2 + 1), bwaVar);
            return bwaVar;
        }
        return (bwa) arrayList.get(i2);
    }

    public final Object h() {
        int i = this.e;
        if (i < this.f) {
            return A(this.b, i);
        }
        return 0;
    }

    public final Object i() {
        int i = this.e;
        if (i < this.f) {
            return p(this.b, i);
        }
        return null;
    }

    public final Object j(int i) {
        return A(this.b, i);
    }

    public final Object k(int i) {
        return l(this.e, i);
    }

    public final Object l(int i, int i2) {
        int i3;
        int j = cad.j(this.b, i);
        int i4 = i + 1;
        if (i4 < this.c) {
            i3 = cad.b(this.b, i4);
        } else {
            i3 = this.m;
        }
        int i5 = j + i2;
        if (i5 < i3) {
            return this.l[i5];
        }
        return bwj.a.a;
    }

    public final Object m(int i) {
        return p(this.b, i);
    }

    public final Object n() {
        int i;
        if (this.h <= 0 && (i = this.i) < this.j) {
            this.k = true;
            Object[] objArr = this.l;
            this.i = i + 1;
            return objArr[i];
        }
        this.k = false;
        return bwj.a.a;
    }

    public final Object o(int i) {
        if (cad.v(this.b, i)) {
            int[] iArr = this.b;
            if (cad.v(iArr, i)) {
                return this.l[iArr[(i * 5) + 4]];
            }
            return bwj.a.a;
        }
        return null;
    }

    public final Object p(int[] iArr, int i) {
        if (cad.u(iArr, i)) {
            return this.l[cad.g(iArr, i)];
        }
        return null;
    }

    public final void q() {
        this.h++;
    }

    public final void r() {
        this.d = true;
        if (this.a.e <= 0) {
            bwp.i("Unexpected reader close()");
        }
        r0.e--;
    }

    public final void s() {
        int c;
        int b;
        if (this.h == 0) {
            if (this.e != this.f) {
                bwp.i("endGroup() not called at the end of a group");
            }
            int h = cad.h(this.b, this.g);
            this.g = h;
            if (h < 0) {
                c = this.c;
            } else {
                c = cad.c(this.b, h) + h;
            }
            this.f = c;
            int c2 = this.n.c();
            if (c2 < 0) {
                this.i = 0;
                this.j = 0;
                return;
            }
            this.i = c2;
            if (h >= this.c - 1) {
                b = this.m;
            } else {
                b = cad.b(this.b, h + 1);
            }
            this.j = b;
        }
    }

    public final void t(int i) {
        int i2;
        if (this.h != 0) {
            bwp.i("Cannot reposition while in an empty region");
        }
        this.e = i;
        if (i < this.c) {
            i2 = cad.h(this.b, i);
        } else {
            i2 = -1;
        }
        this.g = i2;
        if (i2 < 0) {
            this.f = this.c;
        } else {
            this.f = i2 + cad.c(this.b, i2);
        }
        this.i = 0;
        this.j = 0;
    }

    public final String toString() {
        return "SlotReader(current=" + this.e + ", key=" + a() + ", parent=" + this.g + ", end=" + this.f + ')';
    }

    public final void u() {
        if (this.h != 0) {
            bwp.i("Cannot skip the enclosing group while in an empty region");
        }
        this.e = this.f;
        this.i = 0;
        this.j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            r5 = this;
            int r0 = r5.h
            if (r0 > 0) goto L4f
            int r0 = r5.g
            int r1 = r5.e
            int[] r2 = r5.b
            int r2 = defpackage.cad.h(r2, r1)
            if (r2 == r0) goto L15
            java.lang.String r0 = "Invalid slot table detected"
            defpackage.byy.a(r0)
        L15:
            bxr r0 = r5.n
            int r2 = r5.i
            int r3 = r5.j
            r4 = -1
            if (r2 != 0) goto L25
            if (r3 != 0) goto L24
            r0.e(r4)
            goto L28
        L24:
            r2 = 0
        L25:
            r0.e(r2)
        L28:
            r5.g = r1
            int[] r0 = r5.b
            int r0 = defpackage.cad.c(r0, r1)
            int r0 = r0 + r1
            r5.f = r0
            int r0 = r1 + 1
            r5.e = r0
            int[] r2 = r5.b
            int r2 = defpackage.cad.j(r2, r1)
            r5.i = r2
            int r2 = r5.c
            int r2 = r2 + r4
            if (r1 < r2) goto L47
            int r0 = r5.m
            goto L4d
        L47:
            int[] r1 = r5.b
            int r0 = defpackage.cad.b(r1, r0)
        L4d:
            r5.j = r0
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caa.v():void");
    }

    public final boolean w() {
        if (this.h > 0) {
            return true;
        }
        return false;
    }

    public final boolean x(int i) {
        return cad.u(this.b, i);
    }

    public final boolean y() {
        if (!w() && this.e != this.f) {
            return false;
        }
        return true;
    }

    public final boolean z(int i) {
        return cad.v(this.b, i);
    }
}
