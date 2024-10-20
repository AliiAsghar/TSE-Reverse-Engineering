package defpackage;

import defpackage.csa;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csb {
    public final csa a;
    public final csa b;
    public long c;
    private final csa.a d;

    public csb() {
        csa.a aVar = csa.a.a;
        this.d = aVar;
        this.a = new csa(aVar, 1);
        this.b = new csa(aVar, 1);
    }

    public final void a(long j, long j2) {
        this.a.b(j, Float.intBitsToFloat((int) (j2 >> 32)));
        this.b.b(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public final void b() {
        this.a.c();
        this.b.c();
        this.c = 0L;
    }
}
