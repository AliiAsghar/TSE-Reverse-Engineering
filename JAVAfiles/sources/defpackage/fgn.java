package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgn implements fgt, fgs {
    public final fgv a;
    public final long b;
    public fgx c;
    public fgt d;
    public long e = -9223372036854775807L;
    private fgs f;
    private final fjl g;

    public fgn(fgv fgvVar, fjl fjlVar, long j) {
        this.a = fgvVar;
        this.g = fjlVar;
        this.b = j;
    }

    private final long p(long j) {
        long j2 = this.e;
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return j;
    }

    @Override // defpackage.fgt
    public final long a(long j, fbi fbiVar) {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.a(j, fbiVar);
    }

    @Override // defpackage.fhw
    public final /* bridge */ /* synthetic */ void b(fhx fhxVar) {
        fgs fgsVar = this.f;
        int i = eul.a;
        fgsVar.b(this);
    }

    @Override // defpackage.fgs
    public final void c(fgt fgtVar) {
        fgs fgsVar = this.f;
        int i = eul.a;
        fgsVar.c(this);
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long d() {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.d();
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final long e() {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.e();
    }

    @Override // defpackage.fgt
    public final long f() {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.f();
    }

    @Override // defpackage.fgt
    public final long g(long j) {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.g(j);
    }

    @Override // defpackage.fgt
    public final long h(fje[] fjeVarArr, boolean[] zArr, fhv[] fhvVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.e;
        if (j3 != -9223372036854775807L && j == this.b) {
            j2 = j3;
        } else {
            j2 = j;
        }
        this.e = -9223372036854775807L;
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.h(fjeVarArr, zArr, fhvVarArr, zArr2, j2);
    }

    @Override // defpackage.fgt
    public final fid i() {
        fgt fgtVar = this.d;
        int i = eul.a;
        return fgtVar.i();
    }

    @Override // defpackage.fgt
    public final void j() {
        fgt fgtVar = this.d;
        if (fgtVar != null) {
            fgtVar.j();
            return;
        }
        fgx fgxVar = this.c;
        if (fgxVar != null) {
            fgxVar.t();
        }
    }

    @Override // defpackage.fgt
    public final void k(fgs fgsVar, long j) {
        this.f = fgsVar;
        fgt fgtVar = this.d;
        if (fgtVar != null) {
            fgtVar.k(this, p(this.b));
        }
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final void l(long j) {
        fgt fgtVar = this.d;
        int i = eul.a;
        fgtVar.l(j);
    }

    public final void m(fgv fgvVar) {
        long p = p(this.b);
        fgx fgxVar = this.c;
        dzg.g(fgxVar);
        fgt w = fgxVar.w(fgvVar, this.g, p);
        this.d = w;
        if (this.f != null) {
            w.k(this, p);
        }
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean n(fam famVar) {
        fgt fgtVar = this.d;
        if (fgtVar != null && fgtVar.n(famVar)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fgt, defpackage.fhx
    public final boolean o() {
        fgt fgtVar = this.d;
        if (fgtVar != null && fgtVar.o()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fgt
    public final void q(long j) {
        fgt fgtVar = this.d;
        int i = eul.a;
        fgtVar.q(j);
    }
}
