package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fql {
    public final fqj a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public fql(fqj fqjVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        int length3 = jArr.length;
        if (length3 == length2) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.s(z2);
        int length4 = iArr2.length;
        d.s(length4 == length2);
        this.a = fqjVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int ai = eul.ai(this.f, j, false); ai >= 0; ai--) {
            if ((this.g[ai] & 1) != 0) {
                return ai;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int ah = eul.ah(this.f, j, true); ah < this.f.length; ah++) {
            if ((this.g[ah] & 1) != 0) {
                return ah;
            }
        }
        return -1;
    }
}
