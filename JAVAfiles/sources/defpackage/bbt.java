package defpackage;

import defpackage.dli;
import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbt {
    public String a;
    public dli.a b;
    public int c;
    public boolean d;
    public int e;
    public dqv f;
    public die g;
    public boolean h;
    public dih j;
    public drk k;
    private dje m;
    private long n = bbq.a;
    public long i = 0;
    public long l = dqs.a.c(0, 0);
    private int o = -1;
    private int p = -1;

    public /* synthetic */ bbt(String str, dje djeVar, dli.a aVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = djeVar;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
    }

    private final void f() {
        this.g = null;
        this.j = null;
        this.k = null;
        this.o = -1;
        this.p = -1;
        this.l = dqs.a.c(0, 0);
        this.i = 0L;
        this.h = false;
    }

    public final int a(int i, drk drkVar) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        int a = ayr.a(b(dqt.d(0, i, 0, Integer.MAX_VALUE), drkVar).b());
        this.o = i;
        this.p = a;
        return a;
    }

    public final die b(long j, drk drkVar) {
        dih c = c(drkVar);
        long b = bbr.b(j, this.d, this.c, c.a());
        boolean z = this.d;
        int i = this.c;
        return new dhu((dpg) c, bbr.a(z, i, this.e), i, b);
    }

    public final dih c(drk drkVar) {
        dih dihVar = this.j;
        if (dihVar == null || drkVar != this.k || dihVar.c()) {
            this.k = drkVar;
            String str = this.a;
            dje a = djf.a(this.m, drkVar);
            dqv dqvVar = this.f;
            dqvVar.getClass();
            dli.a aVar = this.b;
            arnv arnvVar = arnv.a;
            dihVar = new dpg(str, a, arnvVar, arnvVar, aVar, dqvVar);
        }
        this.j = dihVar;
        return dihVar;
    }

    public final void d(dqv dqvVar) {
        long j;
        dqv dqvVar2 = this.f;
        if (dqvVar != null) {
            j = bbq.a(dqvVar);
        } else {
            j = bbq.a;
        }
        if (dqvVar2 == null) {
            this.f = dqvVar;
            this.n = j;
        } else {
            if (dqvVar != null && a.bB(this.n, j)) {
                return;
            }
            this.f = dqvVar;
            this.n = j;
            f();
        }
    }

    public final void e(String str, dje djeVar, dli.a aVar, int i, boolean z, int i2) {
        this.a = str;
        this.m = djeVar;
        this.b = aVar;
        this.c = i;
        this.d = z;
        this.e = i2;
        f();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.g != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        long j = this.n;
        sb.append((Object) ("InlineDensity(density=" + Float.intBitsToFloat((int) (j >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j & 4294967295L)) + ')'));
        sb.append(')');
        return sb.toString();
    }
}
