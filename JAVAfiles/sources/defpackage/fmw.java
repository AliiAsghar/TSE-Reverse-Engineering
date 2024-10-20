package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmw implements flu {
    public fmz[] a;
    private final euf b;
    private final boolean c;
    private final frj d;
    private int e;
    private flw f;
    private fmx g;
    private long h;
    private long i;
    private fmz j;
    private int k;
    private long l;
    private long m;
    private int n;
    private boolean o;
    private final abyc p;

    @Deprecated
    public fmw() {
        this(1, frj.a);
    }

    private final fmz a(int i) {
        for (fmz fmzVar : this.a) {
            if (fmzVar.b == i || fmzVar.c == i) {
                return fmzVar;
            }
        }
        return null;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.e = 0;
        if (this.c) {
            flwVar = new frm(flwVar, this.d);
        }
        this.f = flwVar;
        this.i = -1L;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.i = -1L;
        this.j = null;
        int i = 0;
        for (fmz fmzVar : this.a) {
            if (fmzVar.h == 0) {
                fmzVar.f = 0;
            } else {
                fmzVar.f = fmzVar.k[eul.ai(fmzVar.j, j, true)];
            }
        }
        if (j == 0) {
            if (this.a.length != 0) {
                i = 3;
            }
            this.e = i;
            return;
        }
        this.e = 6;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        flvVar.j(this.b.a, 0, 12);
        this.b.J(0);
        if (this.b.f() != 1179011410) {
            return false;
        }
        this.b.K(4);
        if (this.b.f() != 541677121) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // defpackage.flu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(defpackage.flv r24, defpackage.vtk r25) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmw.i(flv, vtk):int");
    }

    public fmw(int i, frj frjVar) {
        this.d = frjVar;
        this.c = 1 == (i ^ 1);
        this.b = new euf(12);
        this.p = new abyc(null, null);
        this.f = new fmh(0);
        this.a = new fmz[0];
        this.l = -1L;
        this.m = -1L;
        this.k = -1;
        this.h = -9223372036854775807L;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
