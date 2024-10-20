package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnm implements flu {
    private final euf a;
    private final fmm b;
    private final /* synthetic */ int c;

    public fnm(int i, byte[] bArr) {
        this.c = i;
        this.a = new euf(4);
        this.b = new fmm(-1, -1, "image/avif");
    }

    private final boolean a(flv flvVar, int i) {
        this.a.F(4);
        flvVar.j(this.a.a, 0, 4);
        if (this.a.r() != i) {
            return false;
        }
        return true;
    }

    private final boolean b(flv flvVar, int i) {
        this.a.F(4);
        flvVar.j(this.a.a, 0, 4);
        if (this.a.r() != i) {
            return false;
        }
        return true;
    }

    @Override // defpackage.flu
    public final /* synthetic */ List d() {
        int i = this.c;
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
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                this.b.e(flwVar);
                return;
            } else {
                this.b.e(flwVar);
                return;
            }
        }
        this.b.e(flwVar);
    }

    @Override // defpackage.flu
    public final void f(long j, long j2) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                this.b.f(j, j2);
                return;
            } else {
                this.b.f(j, j2);
                return;
            }
        }
        this.b.f(j, j2);
    }

    @Override // defpackage.flu
    public final boolean g(flv flvVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                this.a.F(4);
                flvVar.j(this.a.a, 0, 4);
                if (this.a.r() == 1380533830) {
                    flvVar.g(4);
                    this.a.F(4);
                    flvVar.j(this.a.a, 0, 4);
                    if (this.a.r() == 1464156752) {
                        return true;
                    }
                }
                return false;
            }
            flvVar.g(4);
            if (b(flvVar, 1718909296) && b(flvVar, 1635150182)) {
                return true;
            }
            return false;
        }
        flvVar.g(4);
        if (a(flvVar, 1718909296) && a(flvVar, 1751476579)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.flu
    public final int i(flv flvVar, vtk vtkVar) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return this.b.i(flvVar, vtkVar);
            }
            return this.b.i(flvVar, vtkVar);
        }
        return this.b.i(flvVar, vtkVar);
    }

    public fnm(int i) {
        this.c = i;
        this.a = new euf(4);
        this.b = new fmm(-1, -1, "image/heif");
    }

    public fnm(int i, char[] cArr) {
        this.c = i;
        this.a = new euf(4);
        this.b = new fmm(-1, -1, "image/webp");
    }

    @Override // defpackage.flu
    public final /* synthetic */ void h() {
    }
}
