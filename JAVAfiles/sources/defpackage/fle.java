package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fle implements fmk {
    public final flh a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    private final long f;

    public fle(flh flhVar, long j, long j2, long j3, long j4, long j5) {
        this.a = flhVar;
        this.f = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    @Override // defpackage.fmk
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fmk
    public final fmi b(long j) {
        fml fmlVar = new fml(j, flg.a(this.a.a(j), 0L, this.b, this.c, this.d, this.e));
        return new fmi(fmlVar, fmlVar);
    }

    @Override // defpackage.fmk
    public final boolean c() {
        return true;
    }
}
