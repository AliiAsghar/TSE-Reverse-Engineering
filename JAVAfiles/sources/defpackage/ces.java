package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ces {
    public cev g;
    public int h;
    public boolean i;
    public int j;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public final class a {
        public static final ces a() {
            return (ces) cex.b.a();
        }

        public static final ces b(ces cesVar) {
            if (cesVar instanceof cfk) {
                cfk cfkVar = (cfk) cesVar;
                if (cfkVar.m == cdu.a()) {
                    cfkVar.k = null;
                    return cesVar;
                }
            }
            if (cesVar instanceof cfl) {
                cfl cflVar = (cfl) cesVar;
                if (cflVar.b == cdu.a()) {
                    cflVar.a = null;
                    return cesVar;
                }
            }
            ces a = cex.a(cesVar, null, false);
            a.w();
            return a;
        }

        public static final void c() {
            cex.b().e();
        }

        public static final Object d(arqr arqrVar, arqg arqgVar) {
            ces cfkVar;
            if (arqrVar != null) {
                ces cesVar = (ces) cex.b.a();
                cem cemVar = null;
                if (cesVar instanceof cfk) {
                    cfk cfkVar2 = (cfk) cesVar;
                    if (cfkVar2.m == cdu.a()) {
                        arqr arqrVar2 = cfkVar2.k;
                        arqr arqrVar3 = cfkVar2.l;
                        try {
                            cfkVar2.k = cex.y(arqrVar, arqrVar2);
                            cfkVar2.l = cex.q(null, arqrVar3);
                            return arqgVar.a();
                        } finally {
                            cfkVar2.k = arqrVar2;
                            cfkVar2.l = arqrVar3;
                        }
                    }
                }
                if (cesVar != null && !(cesVar instanceof cem)) {
                    cfkVar = cesVar.b(arqrVar);
                } else {
                    if (cesVar instanceof cem) {
                        cemVar = (cem) cesVar;
                    }
                    cfkVar = new cfk(cemVar, arqrVar, null, true, false);
                }
                try {
                    ces w = cfkVar.w();
                    try {
                        return arqgVar.a();
                    } finally {
                        ces.E(w);
                    }
                } finally {
                    cfkVar.d();
                }
            }
            return arqgVar.a();
        }

        public static final cep e(final arqv arqvVar) {
            cex.m(cex.a);
            synchronized (cex.c) {
                cex.g = aqjn.ar(cex.g, arqvVar);
            }
            return new cep() { // from class: cer
                @Override // defpackage.cep
                public final void a() {
                    arqv arqvVar2 = arqv.this;
                    synchronized (cex.c) {
                        cex.g = aqjn.ap(cex.g, arqvVar2);
                    }
                }
            };
        }

        public static final void f(ces cesVar, ces cesVar2, arqr arqrVar) {
            if (cesVar == cesVar2) {
                if (cesVar instanceof cfk) {
                    ((cfk) cesVar).k = arqrVar;
                    return;
                } else if (cesVar instanceof cfl) {
                    ((cfl) cesVar).a = arqrVar;
                    return;
                } else {
                    Objects.toString(cesVar);
                    throw new IllegalStateException("Non-transparent snapshot was reused: ".concat(String.valueOf(cesVar)));
                }
            }
            ces.E(cesVar);
            cesVar2.d();
        }

        public static final void g() {
            boolean z;
            synchronized (cex.c) {
                vh vhVar = ((cel) cex.i.get()).f;
                z = false;
                if (vhVar != null) {
                    if (vhVar.c()) {
                        z = true;
                    }
                }
            }
            if (z) {
                cex.r();
            }
        }

        public static final cem h(arqr arqrVar, arqr arqrVar2) {
            cem cemVar;
            cem a;
            ces b = cex.b();
            if (b instanceof cem) {
                cemVar = (cem) b;
            } else {
                cemVar = null;
            }
            if (cemVar != null && (a = cemVar.a(arqrVar, arqrVar2)) != null) {
                return a;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public static final ces i(arqr arqrVar) {
            return cex.b().b(arqrVar);
        }
    }

    public ces(int i, cev cevVar) {
        int i2;
        int i3;
        int numberOfTrailingZeros;
        this.g = cevVar;
        this.h = i;
        if (i != 0) {
            cev x = x();
            arqr arqrVar = cex.a;
            int[] iArr = x.e;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = x.c;
                if (j != 0) {
                    i3 = x.d;
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
                } else {
                    long j2 = x.b;
                    if (j2 != 0) {
                        i3 = x.d + 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j2);
                    }
                }
                i = i3 + numberOfTrailingZeros;
            }
            synchronized (cex.c) {
                ceu ceuVar = cex.f;
                int i4 = ceuVar.a + 1;
                int[] iArr2 = ceuVar.b;
                int length = iArr2.length;
                if (i4 > length) {
                    int i5 = length + length;
                    int[] iArr3 = new int[i5];
                    int[] iArr4 = new int[i5];
                    aqil.A(iArr2, iArr3, 0, 0, 14);
                    aqil.A(ceuVar.c, iArr4, 0, 0, 14);
                    ceuVar.b = iArr3;
                    ceuVar.c = iArr4;
                }
                int i6 = ceuVar.a;
                ceuVar.a = i6 + 1;
                int length2 = ceuVar.d.length;
                if (ceuVar.e >= length2) {
                    int i7 = length2 + length2;
                    int[] iArr5 = new int[i7];
                    int i8 = 0;
                    while (i8 < i7) {
                        int i9 = i8 + 1;
                        iArr5[i8] = i9;
                        i8 = i9;
                    }
                    aqil.A(ceuVar.d, iArr5, 0, 0, 14);
                    ceuVar.d = iArr5;
                }
                i2 = ceuVar.e;
                int[] iArr6 = ceuVar.d;
                ceuVar.e = iArr6[i2];
                ceuVar.b[i6] = i;
                ceuVar.c[i6] = i2;
                iArr6[i2] = i6;
                ceuVar.b(i6);
            }
        } else {
            i2 = -1;
        }
        this.j = i2;
    }

    public static final void E(ces cesVar) {
        cex.b.b(cesVar);
    }

    public void A(int i) {
        this.h = i;
    }

    public void B(cev cevVar) {
        this.g = cevVar;
    }

    public final void C() {
        if (!this.i) {
            return;
        }
        byy.a("Cannot use a disposed snapshot");
    }

    public final void D() {
        this.i = true;
    }

    public abstract ces b(arqr arqrVar);

    public void d() {
        this.i = true;
        synchronized (cex.c) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract arqr i();

    public abstract arqr k();

    public void m() {
        cex.d = cex.d.b(v());
    }

    public abstract void n(cfg cfgVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public int v() {
        return this.h;
    }

    public final ces w() {
        ces cesVar = (ces) cex.b.a();
        cex.b.b(this);
        return cesVar;
    }

    public cev x() {
        return this.g;
    }

    public final void y() {
        synchronized (cex.c) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.j;
        if (i >= 0) {
            cex.v(i);
            this.j = -1;
        }
    }
}
