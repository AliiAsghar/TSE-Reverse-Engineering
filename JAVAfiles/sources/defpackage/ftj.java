package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftj implements flu {
    private final ftk a;
    private final euf b;
    private final euf c;
    private flw d;
    private long e;
    private long f;
    private boolean g;
    private boolean h;
    private final fjl i;

    public ftj() {
        this(null);
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.d = flwVar;
        this.a.b(flwVar, new fuq(0, 1));
        flwVar.r();
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        this.g = false;
        this.a.e();
        this.e = j2;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        int i = 0;
        while (true) {
            flvVar.j(this.c.a, 0, 10);
            this.c.J(0);
            if (this.c.l() != 4801587) {
                break;
            }
            this.c.K(3);
            int i2 = this.c.i();
            i += i2 + 10;
            flvVar.g(i2);
        }
        flvVar.l();
        flvVar.g(i);
        if (this.f == -1) {
            this.f = i;
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = i;
        do {
            flvVar.j(this.c.a, 0, 2);
            this.c.J(0);
            if (!ftk.f(this.c.n())) {
                i5++;
                flvVar.l();
                flvVar.g(i5);
            } else {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                flvVar.j(this.c.a, 0, 4);
                this.i.q(14);
                int i6 = this.i.i(13);
                if (i6 <= 6) {
                    i5++;
                    flvVar.l();
                    flvVar.g(i5);
                } else {
                    flvVar.g(i6 - 6);
                    i4 += i6;
                }
            }
            i3 = 0;
            i4 = 0;
        } while (i5 - i < 8192);
        return false;
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        dzg.h(this.d);
        int a = flvVar.a(this.b.a, 0, 2048);
        if (!this.h) {
            this.d.w(new fmj(-9223372036854775807L));
            this.h = true;
        }
        if (a == -1) {
            return -1;
        }
        this.b.J(0);
        this.b.I(a);
        if (!this.g) {
            this.a.b = this.e;
            this.g = true;
        }
        this.a.a(this.b);
        return 0;
    }

    public ftj(byte[] bArr) {
        this.a = new ftk(true, null, 0);
        this.b = new euf(2048);
        this.f = -1L;
        euf eufVar = new euf(10);
        this.c = eufVar;
        this.i = new fjl(eufVar.a, (byte[]) null);
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
