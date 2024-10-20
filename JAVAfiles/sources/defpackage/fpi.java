package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpi {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final fpl c = new fpl();
    public int d;
    public int e;
    public long f;
    public qdq g;

    public final long a(flv flvVar, int i) {
        flvVar.k(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.a[i2] & 255);
        }
        return j;
    }
}
