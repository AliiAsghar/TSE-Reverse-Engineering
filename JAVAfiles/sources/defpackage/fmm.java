package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmm implements flu {
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private int e;
    private flw f;
    private fmq g;

    public fmm(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        this.f = flwVar;
        fmq p = flwVar.p(1024, 4);
        this.g = p;
        eqm eqmVar = new eqm();
        eqmVar.b(this.c);
        p.h(new eqn(eqmVar));
        this.f.r();
        this.f.w(new fmn());
        this.e = 1;
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        if (j != 0 && this.e != 1) {
            return;
        }
        this.e = 1;
        this.d = 0;
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        boolean z;
        if (this.a != -1 && this.b != -1) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        euf eufVar = new euf(this.b);
        flvVar.j(eufVar.a, 0, this.b);
        if (eufVar.n() == this.a) {
            return true;
        }
        return false;
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        fmq fmqVar = this.g;
        dzg.g(fmqVar);
        int d = fmqVar.d(flvVar, 1024, true);
        if (d == -1) {
            this.e = 2;
            this.g.n(0L, 1, this.d, 0, null);
            this.d = 0;
        } else {
            this.d += d;
        }
        return 0;
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
