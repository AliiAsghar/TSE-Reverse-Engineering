package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xdk extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        pvj pvjVar = (pvj) obj;
        int ordinal = pvjVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return anlt.a;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(pvjVar.toString()));
            }
            return anlt.b;
        }
        return anlt.c;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        anlt anltVar = (anlt) obj;
        int ordinal = anltVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new IllegalArgumentException("unknown enum value: ".concat(anltVar.toString()));
                    }
                } else {
                    return pvj.ONLINE;
                }
            } else {
                return pvj.OFFLINE;
            }
        }
        return pvj.NOT_RCS;
    }
}
