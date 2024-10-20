package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wad extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        qfn qfnVar = (qfn) obj;
        int ordinal = qfnVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return wbp.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(qfnVar.toString()));
            }
            return wbp.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        return wbp.DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wbp wbpVar = (wbp) obj;
        int ordinal = wbpVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return qfn.DISPLAY;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(wbpVar.toString()));
            }
            return qfn.POSITIVE_DELIVERY;
        }
        return qfn.UNKNOWN_REQUESTED_REPORT;
    }
}
