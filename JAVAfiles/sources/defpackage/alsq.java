package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alsq extends alsp {
    transient long[] g;
    private transient int h;
    private transient int i;

    public alsq() {
        super(3, null);
    }

    private final int q(int i) {
        return (int) (this.g[i] >>> 32);
    }

    private final int r(int i) {
        return (int) this.g[i];
    }

    private final void s(int i, int i2) {
        if (i == -2) {
            this.h = i2;
            i = -2;
        } else {
            long[] jArr = this.g;
            jArr[i] = (jArr[i] & (-4294967296L)) | (i2 & 4294967295L);
        }
        if (i2 == -2) {
            this.i = i;
        } else {
            long[] jArr2 = this.g;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (i << 32);
        }
    }

    @Override // defpackage.alsp
    public final int a() {
        int i = this.h;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.alsp
    public final int e(int i) {
        int r = r(i);
        if (r == -2) {
            return -1;
        }
        return r;
    }

    @Override // defpackage.alsp
    public final void j(int i, Object obj, int i2, int i3) {
        super.j(i, obj, i2, i3);
        s(this.i, i);
        s(i, -2);
    }

    @Override // defpackage.alsp
    public final void k(int i) {
        int i2 = this.c - 1;
        s(q(i), r(i));
        if (i < i2) {
            s(q(i2), i);
            s(i, r(i2));
        }
        super.k(i);
    }

    @Override // defpackage.alsp
    public final void l(int i) {
        super.l(i);
        long[] jArr = this.g;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        this.g = copyOf;
        Arrays.fill(copyOf, length, i, -1L);
    }

    @Override // defpackage.alsp
    public final void n(int i) {
        super.n(i);
        this.h = -2;
        this.i = -2;
        long[] jArr = new long[i];
        this.g = jArr;
        Arrays.fill(jArr, -1L);
    }

    public alsq(alsp alspVar) {
        n(alspVar.c);
        int a = alspVar.a();
        while (a != -1) {
            o(alspVar.h(a), alspVar.c(a));
            a = alspVar.e(a);
        }
    }
}
