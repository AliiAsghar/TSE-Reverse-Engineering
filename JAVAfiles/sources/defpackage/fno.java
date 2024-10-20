package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fno implements flu {
    private flw b;
    private int c;
    private int d;
    private int e;
    private fou g;
    private flv h;
    private fnp i;
    private fqg j;
    private final euf a = new euf(6);
    private long f = -1;

    private final int a(flv flvVar) {
        this.a.F(2);
        flvVar.j(this.a.a, 0, 2);
        return this.a.n();
    }

    private final void b() {
        flw flwVar = this.b;
        dzg.g(flwVar);
        flwVar.r();
        this.b.w(new fmj(-9223372036854775807L));
        this.c = 6;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.b = flwVar;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            fqg fqgVar = this.j;
            dzg.g(fqgVar);
            fqgVar.f(j, j2);
        }
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        if (a(flvVar) != 65496) {
            return false;
        }
        int a = a(flvVar);
        this.d = a;
        if (a == 65504) {
            this.a.F(2);
            flvVar.j(this.a.a, 0, 2);
            flvVar.g(this.a.n() - 2);
            a = a(flvVar);
            this.d = a;
        }
        if (a != 65505) {
            return false;
        }
        flvVar.g(2);
        this.a.F(6);
        flvVar.j(this.a.a, 0, 6);
        if (this.a.r() != 1165519206 || this.a.n() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0178  */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r24, defpackage.vtk r25) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fno.i(flv, vtk):int");
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
