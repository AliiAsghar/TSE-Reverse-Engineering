package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fux implements fmk {
    private final fuw a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;

    public fux(fuw fuwVar, int i, long j, long j2) {
        this.a = fuwVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / fuwVar.d;
        this.d = j3;
        this.e = d(j3);
    }

    private final long d(long j) {
        return eul.w(j * this.b, 1000000L, this.a.c);
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.e;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        long q = eul.q((this.a.c * j) / (this.b * 1000000), 0L, this.d - 1);
        long d = d(q);
        fml fmlVar = new fml(d, this.c + (this.a.d * q));
        if (d < j && q != this.d - 1) {
            long j2 = q + 1;
            return new fmi(fmlVar, new fml(d(j2), this.c + (j2 * this.a.d)));
        }
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }
}
