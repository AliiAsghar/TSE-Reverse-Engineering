package defpackage;

import android.util.SparseArray;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbt implements err, fhb, fdq {
    public final eti a;
    public final fbs b;
    public final SparseArray c;
    public ety d;
    public ert e;
    public etu f;
    public boolean g;
    private final erx h;
    private final ery i;

    public fbt(eti etiVar) {
        dzg.g(etiVar);
        this.a = etiVar;
        this.d = new ety(eul.E(), etiVar, new fbo(0));
        erx erxVar = new erx();
        this.h = erxVar;
        this.i = new ery();
        this.b = new fbs(erxVar);
        this.c = new SparseArray();
    }

    private final fbk G(int i, fgv fgvVar) {
        dzg.g(this.e);
        if (fgvVar != null) {
            if (this.b.a(fgvVar) != null) {
                return B(fgvVar);
            }
            return C(erz.a, i, fgvVar);
        }
        erz H = this.e.H();
        if (i >= H.c()) {
            H = erz.a;
        }
        return C(H, i, null);
    }

    private final fbk H(ern ernVar) {
        fgv fgvVar;
        if ((ernVar instanceof ezo) && (fgvVar = ((ezo) ernVar).h) != null) {
            return B(fgvVar);
        }
        return A();
    }

    public final fbk A() {
        return B(this.b.c);
    }

    public final fbk B(fgv fgvVar) {
        erz a;
        dzg.g(this.e);
        if (fgvVar == null) {
            a = null;
        } else {
            a = this.b.a(fgvVar);
        }
        if (fgvVar != null && a != null) {
            return C(a, a.o(fgvVar.a, this.h).c, fgvVar);
        }
        int u = this.e.u();
        erz H = this.e.H();
        if (u >= H.c()) {
            H = erz.a;
        }
        return C(H, u, null);
    }

    protected final fbk C(erz erzVar, int i, fgv fgvVar) {
        fgv fgvVar2;
        boolean z = true;
        if (true == erzVar.q()) {
            fgvVar2 = null;
        } else {
            fgvVar2 = fgvVar;
        }
        long a = this.a.a();
        if (!erzVar.equals(this.e.H()) || i != this.e.u()) {
            z = false;
        }
        long j = 0;
        if (fgvVar2 != null && fgvVar2.b()) {
            if (z && this.e.s() == fgvVar2.b && this.e.t() == fgvVar2.c) {
                j = this.e.A();
            }
        } else if (z) {
            j = this.e.z();
        } else if (!erzVar.q()) {
            j = erzVar.p(i, this.i).a();
        }
        fgv fgvVar3 = this.b.c;
        erz H = this.e.H();
        int u = this.e.u();
        long A = this.e.A();
        fad fadVar = (fad) this.e;
        fadVar.ag();
        return new fbk(a, erzVar, i, fgvVar2, j, H, u, fgvVar3, A, eul.z(fadVar.A.r));
    }

    public final fbk D() {
        return B(this.b.d);
    }

    public final fbk E() {
        return B(this.b.e);
    }

    public final void F(fbk fbkVar, int i, etv etvVar) {
        this.c.put(i, fbkVar);
        this.d.f(i, etvVar);
    }

    @Override // defpackage.err
    public final void a(eta etaVar) {
        F(A(), 27, new fbn(19));
    }

    @Override // defpackage.fdq
    public final void b(int i, fgv fgvVar) {
        F(G(i, fgvVar), 1023, new fbr(2));
    }

    @Override // defpackage.fdq
    public final void c(int i, fgv fgvVar) {
        F(G(i, fgvVar), 1025, new fbn(15));
    }

    @Override // defpackage.fdq
    public final void d(int i, fgv fgvVar, int i2) {
        F(G(i, fgvVar), 1022, new fbn(10));
    }

    @Override // defpackage.fdq
    public final void e(int i, fgv fgvVar, Exception exc) {
        F(G(i, fgvVar), 1024, new fbn(11));
    }

    @Override // defpackage.fhb
    public final void eA(int i, fgv fgvVar, fgr fgrVar) {
        fbk G = G(i, fgvVar);
        F(G, 1004, new fxi(G, fgrVar, 1));
    }

    @Override // defpackage.err
    public final void eB(boolean z) {
        F(A(), 7, new ezz(17));
    }

    @Override // defpackage.err
    public final void eC(int i) {
        F(A(), 4, new fbn(9));
    }

    @Override // defpackage.err
    public final void eD(ern ernVar) {
        F(H(ernVar), 10, new ezu(ernVar, 19));
    }

    @Override // defpackage.err
    public final void eE(ern ernVar) {
        F(H(ernVar), 10, new fbn(2));
    }

    @Override // defpackage.err
    public final void eG(esg esgVar) {
        F(A(), 2, new ezz(18));
    }

    @Override // defpackage.err
    public final void eH(esn esnVar) {
        F(E(), 25, new fbq(esnVar, 1));
    }

    @Override // defpackage.err
    public final void eJ() {
        F(A(), 13, new ezz(8));
    }

    @Override // defpackage.fdq
    public final void f(int i, fgv fgvVar) {
        F(G(i, fgvVar), 1027, new fbr(4));
    }

    @Override // defpackage.fhb
    public final void g(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        F(G(i, fgvVar), 1002, new fbn(7));
    }

    @Override // defpackage.fhb
    public final void h(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        F(G(i, fgvVar), 1001, new fbn(12));
    }

    @Override // defpackage.fhb
    public final void i(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar, IOException iOException, boolean z) {
        F(G(i, fgvVar), 1003, new ezu(fgrVar, 18));
    }

    @Override // defpackage.fhb
    public final void j(int i, fgv fgvVar, fgm fgmVar, fgr fgrVar) {
        F(G(i, fgvVar), 1000, new ezz(7));
    }

    @Override // defpackage.err
    public final void k() {
        F(A(), 27, new fbn(5));
    }

    @Override // defpackage.err
    public final void l() {
        F(A(), 3, new ezz(5));
    }

    @Override // defpackage.err
    public final void m() {
        F(A(), 1, new ezz(10));
    }

    @Override // defpackage.err
    public final void n() {
        F(A(), 14, new fbr(6));
    }

    @Override // defpackage.err
    public final void o() {
        F(A(), 28, new ezz(15));
    }

    @Override // defpackage.err
    public final void p() {
        F(A(), 5, new fbn(3));
    }

    @Override // defpackage.err
    public final void q() {
        F(A(), 12, new ezz(2));
    }

    @Override // defpackage.err
    public final void r() {
        F(A(), 6, new ezz(20));
    }

    @Override // defpackage.err
    public final void s() {
        F(A(), -1, new ezz(14));
    }

    @Override // defpackage.err
    public final void t(int i) {
        int i2 = 0;
        if (i == 1) {
            this.g = false;
            i = 1;
        }
        fbs fbsVar = this.b;
        ert ertVar = this.e;
        dzg.g(ertVar);
        fbsVar.c = fbs.b(ertVar, fbsVar.b, fbsVar.d, fbsVar.a);
        F(A(), 11, new fbp(i, i2));
    }

    @Override // defpackage.err
    public final void u() {
        F(A(), 8, new fbn(20));
    }

    @Override // defpackage.err
    public final void v() {
        F(A(), 9, new fbr(7));
    }

    @Override // defpackage.err
    public final void w() {
        F(E(), 23, new ezz(11));
    }

    @Override // defpackage.err
    public final void x() {
        F(E(), 24, new fbr(8));
    }

    @Override // defpackage.err
    public final void y(erz erzVar) {
        ert ertVar = this.e;
        dzg.g(ertVar);
        fbs fbsVar = this.b;
        fbsVar.c = fbs.b(ertVar, fbsVar.b, fbsVar.d, fbsVar.a);
        fbsVar.c(ertVar.H());
        F(A(), 0, new ezz(9));
    }

    @Override // defpackage.err
    public final void z() {
        F(A(), 19, new fbr(9));
    }

    @Override // defpackage.err
    public final void eF() {
    }

    @Override // defpackage.err
    public final void eI(erq erqVar) {
    }
}
