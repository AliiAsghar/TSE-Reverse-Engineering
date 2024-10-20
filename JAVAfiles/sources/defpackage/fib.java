package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fib implements fgt, fgs {
    public final fgt a;
    private final long b;
    private fgs c;

    public fib(fgt fgtVar, long j) {
        this.a = fgtVar;
        this.b = j;
    }

    @Override // defpackage.fgt
    public final long a(long j, fbi fbiVar) {
        long j2 = this.b;
        return this.a.a(j - j2, fbiVar) + j2;
    }

    @Override // defpackage.fhw
    public final /* bridge */ /* synthetic */ void b(fhx fhxVar) {
        fgs fgsVar = this.c;
        dzg.g(fgsVar);
        fgsVar.b(this);
    }

    @Override // defpackage.fgs
    public final void c(fgt fgtVar) {
        fgs fgsVar = this.c;
        dzg.g(fgsVar);
        fgsVar.c(this);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long d() {
        long d = this.a.d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.b;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long e() {
        long e = this.a.e();
        if (e == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return e + this.b;
    }

    @Override // defpackage.fgt
    public final long f() {
        long f = this.a.f();
        if (f == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return f + this.b;
    }

    @Override // defpackage.fgt
    public final long g(long j) {
        long j2 = this.b;
        return this.a.g(j - j2) + j2;
    }

    @Override // defpackage.fgt
    public final long h(fje[] fjeVarArr, boolean[] zArr, fhv[] fhvVarArr, boolean[] zArr2, long j) {
        fhv[] fhvVarArr2 = new fhv[fhvVarArr.length];
        int i = 0;
        while (true) {
            fhv fhvVar = null;
            if (i >= fhvVarArr.length) {
                break;
            }
            fia fiaVar = (fia) fhvVarArr[i];
            if (fiaVar != null) {
                fhvVar = fiaVar.a;
            }
            fhvVarArr2[i] = fhvVar;
            i++;
        }
        long h = this.a.h(fjeVarArr, zArr, fhvVarArr2, zArr2, j - this.b);
        for (int i2 = 0; i2 < fhvVarArr.length; i2++) {
            fhv fhvVar2 = fhvVarArr2[i2];
            if (fhvVar2 == null) {
                fhvVarArr[i2] = null;
            } else {
                fhv fhvVar3 = fhvVarArr[i2];
                if (fhvVar3 == null || ((fia) fhvVar3).a != fhvVar2) {
                    fhvVarArr[i2] = new fia(fhvVar2, this.b);
                }
            }
        }
        return h + this.b;
    }

    @Override // defpackage.fgt
    public final fid i() {
        return this.a.i();
    }

    @Override // defpackage.fgt
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.fgt
    public final void k(fgs fgsVar, long j) {
        this.c = fgsVar;
        this.a.k(this, j - this.b);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final void l(long j) {
        this.a.l(j - this.b);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean n(fam famVar) {
        fal falVar = new fal(famVar);
        falVar.a = famVar.a - this.b;
        return this.a.n(new fam(falVar));
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.fgt
    public final void q(long j) {
        this.a.q(j - this.b);
    }
}
