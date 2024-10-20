package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnp extends fma {
    private final long a;

    public fnp(flv flvVar, long j) {
        super(flvVar);
        boolean z;
        if (((fln) flvVar).c >= j) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        this.a = j;
    }

    @Override // defpackage.fma, defpackage.flv
    public final long d() {
        return super.d() - this.a;
    }

    @Override // defpackage.fma, defpackage.flv
    public final long e() {
        return super.e() - this.a;
    }

    @Override // defpackage.fma, defpackage.flv
    public final long f() {
        return super.f() - this.a;
    }
}
