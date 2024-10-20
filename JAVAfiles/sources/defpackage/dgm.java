package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dgm {
    public static final arqv a(dhe dheVar) {
        dhn dhnVar = dgx.a;
        return (arqv) dgz.a(dheVar.c, dgx.e);
    }

    public static final void b(dhe dheVar, int i, arqr arqrVar) {
        dhe dheVar2;
        cbh cbhVar = new cbh(new dhe[16]);
        List c = c(dheVar);
        int i2 = cbhVar.b;
        while (true) {
            cbhVar.p(i2, c);
            while (true) {
                int i3 = cbhVar.b;
                if (i3 != 0) {
                    dheVar2 = (dhe) cbhVar.c(i3 - 1);
                    if (!ddx.f(dheVar2)) {
                        dgy dgyVar = dheVar2.c;
                        dhn dhnVar = dhh.a;
                        if (dgyVar.d(dhh.i)) {
                            continue;
                        } else {
                            cyn d = dheVar2.d();
                            if (d != null) {
                                drg b = drh.b(ctj.e(d));
                                if (b.b < b.d && b.c < b.e) {
                                    arqv a = a(dheVar2);
                                    dgw dgwVar = (dgw) dgz.a(dheVar2.c, dhh.r);
                                    if (a != null && dgwVar != null && ((Number) dgwVar.b.a()).floatValue() > brg.a) {
                                        int i4 = i + 1;
                                        arqrVar.a(new dgl(dheVar2, i4, b, d));
                                        b(dheVar2, i4, arqrVar);
                                    }
                                }
                            } else {
                                csg.a("Expected semantics node to have a coordinator.");
                                throw new armj();
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            c = c(dheVar2);
            i2 = cbhVar.b;
        }
    }

    private static final List c(dhe dheVar) {
        return dheVar.l(false, false);
    }
}
