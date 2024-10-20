package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class waf extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wcc wccVar = (wcc) obj;
        int ordinal = wccVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return qfs.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(wccVar.toString()));
            }
            return qfs.USER;
        }
        return qfs.UNKNOWN_MESSAGE_SOURCE;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qfs qfsVar = (qfs) obj;
        int ordinal = qfsVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return wcc.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(qfsVar.toString()));
            }
            return wcc.USER;
        }
        return wcc.UNKNOWN_MESSAGE_SOURCE;
    }
}
