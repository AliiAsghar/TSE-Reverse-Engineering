package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftt {
    public final byte[] c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    private final fmq n;
    public final boolean a = false;
    public final boolean b = false;
    private final SparseArray o = new SparseArray();
    private final SparseArray p = new SparseArray();
    public final dye m = new dye();

    public ftt(fmq fmqVar) {
        this.n = fmqVar;
        byte[] bArr = new byte[128];
        this.c = bArr;
        new gku(bArr, 0, 0);
        c();
    }

    public final void a(int i) {
        long j = this.j;
        if (j == -9223372036854775807L) {
            return;
        }
        boolean z = this.k;
        long j2 = this.e - this.i;
        this.n.n(j, z ? 1 : 0, (int) j2, i, null);
    }

    public final void b(euv euvVar) {
        this.o.append(euvVar.d, euvVar);
    }

    public final void c() {
        this.f = false;
        this.h = false;
    }

    public final void d() {
        boolean z = this.l;
        boolean z2 = this.k;
        int i = this.d;
        boolean z3 = true;
        if (i != 5 && (!z || i != 1)) {
            z3 = false;
        }
        this.k = z2 | z3;
    }

    public final void e(xzg xzgVar) {
        this.p.append(xzgVar.a, xzgVar);
    }
}
