package defpackage;

import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgd implements fhb, fdq {
    final /* synthetic */ fge a;
    private final Object b;
    private apuv c;
    private apuv d;

    public fgd(fge fgeVar, Object obj) {
        this.a = fgeVar;
        this.c = fgeVar.r(null);
        this.d = fgeVar.s(null);
        this.b = obj;
    }

    private final boolean k(fgv fgvVar) {
        fgv fgvVar2;
        if (fgvVar != null) {
            fgvVar2 = this.a.x(this.b, fgvVar);
            if (fgvVar2 == null) {
                return false;
            }
        } else {
            fgvVar2 = null;
        }
        this.a.A(this.b);
        apuv apuvVar = this.c;
        int i = apuvVar.a;
        if (!Objects.equals(apuvVar.b, fgvVar2)) {
            this.c = this.a.b.D(fgvVar2);
        }
        apuv apuvVar2 = this.d;
        int i2 = apuvVar2.a;
        if (!Objects.equals(apuvVar2.b, fgvVar2)) {
            this.d = this.a.c.E(fgvVar2);
            return true;
        }
        return true;
    }

    private final fgr l(fgr fgrVar) {
        this.a.B(this.b);
        this.a.B(this.b);
        long j = fgrVar.c;
        long j2 = fgrVar.c;
        long j3 = fgrVar.d;
        if (j == j2 && j3 == fgrVar.d) {
            return fgrVar;
        }
        return new fgr(fgrVar.a, fgrVar.b, j, j3);
    }

    @Override // defpackage.fdq
    public final void b(int i, fgv fgvVar) {
        if (k(fgvVar)) {
            this.d.x();
        }
    }

    @Override // defpackage.fdq
    public final void c(int i, fgv fgvVar) {
        if (k(fgvVar)) {
            this.d.y();
        }
    }

    @Override // defpackage.fdq
    public final void d(int i, fgv fgvVar, int i2) {
        if (k(fgvVar)) {
            this.d.z(i2);
        }
    }

    @Override // defpackage.fdq
    public final void e(int i, fgv fgvVar, Exception exc) {
        if (k(fgvVar)) {
            this.d.A(exc);
        }
    }

    @Override // defpackage.fhb
    public final void eA(int i, fgv fgvVar, fgr fgrVar) {
        if (k(fgvVar)) {
            this.c.s(l(fgrVar));
        }
    }

    @Override // defpackage.fdq
    public final void f(int i, fgv fgvVar) {
        if (k(fgvVar)) {
            this.d.B();
        }
    }

    @Override // defpackage.fhb
    public final void g(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        if (k(fgvVar)) {
            this.c.t(fgmVar, l(fgrVar));
        }
    }

    @Override // defpackage.fhb
    public final void h(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        if (k(fgvVar)) {
            this.c.u(fgmVar, l(fgrVar));
        }
    }

    @Override // defpackage.fhb
    public final void i(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar, IOException iOException, boolean z) {
        if (k(fgvVar)) {
            this.c.v(fgmVar, l(fgrVar), iOException, z);
        }
    }

    @Override // defpackage.fhb
    public final void j(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        if (k(fgvVar)) {
            this.c.w(fgmVar, l(fgrVar));
        }
    }
}
