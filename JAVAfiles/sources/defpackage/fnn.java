package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnn implements flu {
    private final flu a;
    private final /* synthetic */ int b;

    public fnn(int i, int i2, byte[] bArr) {
        this.b = i;
        this.a = new fmm(16973, 2, "image/bmp");
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                int i2 = alog.d;
                return alsx.a;
            }
            int i3 = alog.d;
            return alsx.a;
        }
        int i4 = alog.d;
        return alsx.a;
    }

    @Override // defpackage.flu
    public final void e(flw flwVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((fmm) this.a).e(flwVar);
                return;
            } else {
                ((fmm) this.a).e(flwVar);
                return;
            }
        }
        this.a.e(flwVar);
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                ((fmm) this.a).f(j, j2);
                return;
            } else {
                ((fmm) this.a).f(j, j2);
                return;
            }
        }
        this.a.f(j, j2);
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((fmm) this.a).g(flvVar);
            }
            return ((fmm) this.a).g(flvVar);
        }
        return this.a.g(flvVar);
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return ((fmm) this.a).i(flvVar, vtkVar);
            }
            return ((fmm) this.a).i(flvVar, vtkVar);
        }
        return this.a.i(flvVar, vtkVar);
    }

    public fnn(int i, int i2, char[] cArr) {
        this.b = i;
        this.a = new fmm(35152, 2, "image/png");
    }

    public fnn(int i, int i2) {
        this.b = i2;
        this.a = i != 0 ? new fmm(65496, 2, "image/jpeg") : new fno();
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
