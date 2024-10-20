package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ene {
    public static final enf a(eng engVar) {
        engVar.getClass();
        int ordinal = engVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    return null;
                }
                return enf.ON_RESUME;
            }
            return enf.ON_START;
        }
        return enf.ON_CREATE;
    }

    public static final eni b(enm enmVar) {
        eni eniVar;
        enh N = enmVar.N();
        N.getClass();
        while (true) {
            eniVar = (eni) N.a.get();
            if (eniVar != null) {
                break;
            }
            aryj aryjVar = new aryj(null);
            arwb arwbVar = arws.a;
            eniVar = new eni(N, arhi.n(aryjVar, asfh.a.i()));
            if (a.bE(N.a, eniVar)) {
                arrn.J(eniVar, asfh.a.i(), null, new enj(eniVar, (arpe) null, 0), 2);
                break;
            }
        }
        return eniVar;
    }
}
