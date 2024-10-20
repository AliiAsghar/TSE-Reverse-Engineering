package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnh implements flu {
    private flw f;
    private boolean h;
    private long i;
    private int j;
    private int k;
    private int l;
    private long m;
    private boolean n;
    private fng o;
    private fnl p;
    private final euf a = new euf(4);
    private final euf b = new euf(9);
    private final euf c = new euf(11);
    private final euf d = new euf();
    private final fni e = new fni();
    private int g = 1;

    private final euf a(flv flvVar) {
        if (this.l > this.d.c()) {
            euf eufVar = this.d;
            int c = eufVar.c();
            eufVar.H(new byte[Math.max(c + c, this.l)], 0);
        } else {
            this.d.J(0);
        }
        this.d.I(this.l);
        flvVar.k(this.d.a, 0, this.l);
        return this.d;
    }

    private final void b() {
        if (!this.n) {
            this.f.w(new fmj(-9223372036854775807L));
            this.n = true;
        }
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.f = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        flvVar.j(this.a.a, 0, 3);
        this.a.J(0);
        if (this.a.l() != 4607062) {
            return false;
        }
        flvVar.j(this.a.a, 0, 2);
        this.a.J(0);
        if ((this.a.n() & 250) != 0) {
            return false;
        }
        flvVar.j(this.a.a, 0, 4);
        this.a.J(0);
        int e = this.a.e();
        flvVar.l();
        flvVar.g(e);
        flvVar.j(this.a.a, 0, 4);
        this.a.J(0);
        if (this.a.e() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0009 A[SYNTHETIC] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r17, defpackage.vtk r18) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnh.i(flv, vtk):int");
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
