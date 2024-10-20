package defpackage;

import defpackage.cga;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cwr extends cga.c {
    public final int A = cyp.b(this);
    public cga.c B;

    private final void a(int i, boolean z) {
        cga.c cVar;
        int i2 = this.q;
        this.q = i;
        if (i2 != i) {
            if (A() == this) {
                this.r = i;
            }
            if (this.z) {
                cga.c cVar2 = this.p;
                cga.c cVar3 = this;
                while (cVar3 != null) {
                    i |= cVar3.q;
                    cVar3.q = i;
                    if (cVar3 == cVar2) {
                        break;
                    } else {
                        cVar3 = cVar3.s;
                    }
                }
                if (z && cVar3 == cVar2) {
                    i = cyp.c(cVar2);
                    cVar2.q = i;
                }
                int i3 = 0;
                if (cVar3 != null && (cVar = cVar3.t) != null) {
                    i3 = cVar.r;
                }
                int i4 = i | i3;
                while (cVar3 != null) {
                    i4 |= cVar3.q;
                    cVar3.r = i4;
                    cVar3 = cVar3.s;
                }
            }
        }
    }

    @Override // cga.c
    public final void C() {
        super.C();
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.I(this.v);
            if (!cVar.z) {
                cVar.C();
            }
        }
    }

    @Override // cga.c
    public final void D() {
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.D();
        }
        super.D();
    }

    @Override // cga.c
    public final void E() {
        super.E();
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.E();
        }
    }

    @Override // cga.c
    public final void F() {
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.F();
        }
        super.F();
    }

    @Override // cga.c
    public final void G() {
        super.G();
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.G();
        }
    }

    @Override // cga.c
    public final void H(cga.c cVar) {
        this.p = cVar;
        for (cga.c cVar2 = this.B; cVar2 != null; cVar2 = cVar2.t) {
            cVar2.H(cVar);
        }
    }

    @Override // cga.c
    public final void I(cyn cynVar) {
        this.v = cynVar;
        for (cga.c cVar = this.B; cVar != null; cVar = cVar.t) {
            cVar.I(cynVar);
        }
    }

    public final void J(cwo cwoVar) {
        cga.c cVar = null;
        for (cga.c cVar2 = this.B; cVar2 != null; cVar2 = cVar2.t) {
            if (cVar2 == cwoVar) {
                if (cVar2.z) {
                    cyp.f(cVar2);
                    cVar2.G();
                    cVar2.D();
                }
                cVar2.H(cVar2);
                cVar2.r = 0;
                if (cVar == null) {
                    this.B = cVar2.t;
                } else {
                    cVar.t = cVar2.t;
                }
                cVar2.t = null;
                cVar2.s = null;
                int i = this.q;
                int c = cyp.c(this);
                a(c, true);
                if (this.z && (i & 2) != 0 && (c & 2) == 0) {
                    cyk cykVar = cwp.e(this).w;
                    this.p.I(null);
                    cykVar.i();
                    return;
                }
                return;
            }
            cVar = cVar2;
        }
        Objects.toString(cwoVar);
        throw new IllegalStateException("Could not find delegate: ".concat(String.valueOf(cwoVar)));
    }

    public final void K(cwo cwoVar) {
        cga.c A = cwoVar.A();
        cga.c cVar = null;
        if (A != cwoVar) {
            if (true != (cwoVar instanceof cga.c)) {
                cwoVar = null;
            }
            if (cwoVar != null) {
                cVar = ((cga.c) cwoVar).s;
            }
            if (A != this.p || !d.F(cVar, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (A.z) {
            csg.c("Cannot delegate to an already attached node");
        }
        A.H(this.p);
        int i = this.q;
        int c = cyp.c(A);
        A.q = c;
        int i2 = c & 2;
        int i3 = this.q;
        if (i2 != 0 && (i3 & 2) != 0 && !(this instanceof cxi)) {
            csg.c(a.cd(A, this, "Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ", "\nDelegate Node: "));
        }
        A.t = this.B;
        this.B = A;
        A.s = this;
        a(c | this.q, false);
        if (this.z) {
            if (i2 != 0 && (i & 2) == 0) {
                cyk cykVar = cwp.e(this).w;
                this.p.I(null);
                cykVar.i();
            } else {
                I(this.v);
            }
            A.C();
            A.F();
            cyp.d(A);
        }
    }
}
