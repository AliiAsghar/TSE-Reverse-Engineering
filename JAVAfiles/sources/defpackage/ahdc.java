package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahdc implements ahcd {
    private final ahcc a;

    public ahdc(ahcc ahccVar) {
        this.a = ahccVar;
    }

    @Override // defpackage.ahcd
    public final ListenableFuture a(ahci ahciVar) {
        apae checkIsLite;
        apae checkIsLite2;
        Object c;
        if (ahciVar instanceof ahdu) {
            ahdu ahduVar = (ahdu) ahciVar;
            ahcw a = ahduVar.a();
            checkIsLite = apag.checkIsLite(ahde.a);
            a.b(checkIsLite);
            if (a.l.o(checkIsLite.d)) {
                ahcw a2 = ahduVar.a();
                checkIsLite2 = apag.checkIsLite(ahde.a);
                a2.b(checkIsLite2);
                Object l = a2.l.l(checkIsLite2.d);
                if (l == null) {
                    c = checkIsLite2.b;
                } else {
                    c = checkIsLite2.c(l);
                }
                ahdd ahddVar = (ahdd) c;
                int U = a.U(ahddVar.d);
                if (U == 0) {
                    U = 1;
                }
                int i = U - 1;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                return albo.bI(this.a);
                            }
                            throw new IllegalArgumentException("Unknown type");
                        }
                        return albo.bI(new ahcc(2, null));
                    }
                    return albo.bI(new ahcc(3, null));
                }
                if ((ahddVar.b & 1) != 0) {
                    String str = ahddVar.c;
                    str.getClass();
                    return albo.bI(new ahcc(1, str));
                }
                throw new IllegalArgumentException("GAIA type must have a name");
            }
        }
        return albo.bI(null);
    }
}
