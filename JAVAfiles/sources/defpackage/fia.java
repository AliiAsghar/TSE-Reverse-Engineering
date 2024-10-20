package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fia implements fhv {
    public final fhv a;
    private final long b;

    public fia(fhv fhvVar, long j) {
        this.a = fhvVar;
        this.b = j;
    }

    @Override // defpackage.fhv
    public final int a(long j) {
        return this.a.a(j - this.b);
    }

    @Override // defpackage.fhv
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.fhv
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.fhv
    public final int d(fqu fquVar, ewl ewlVar, int i) {
        int d = this.a.d(fquVar, ewlVar, i);
        if (d == -4) {
            ewlVar.f += this.b;
            return -4;
        }
        return d;
    }
}
