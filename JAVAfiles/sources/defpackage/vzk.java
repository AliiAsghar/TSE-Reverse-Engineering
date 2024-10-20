package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vzk extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqs ajqsVar = (ajqs) obj;
        int ordinal = ajqsVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return qfr.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(ajqsVar.toString()));
                }
                return qfr.NORMAL;
            }
            return qfr.HIGH;
        }
        return qfr.UNKNOWN_MESSAGE_PRIORITY;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qfr qfrVar = (qfr) obj;
        int ordinal = qfrVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return ajqs.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(qfrVar.toString()));
                }
                return ajqs.NORMAL;
            }
            return ajqs.HIGH;
        }
        return ajqs.UNKNOWN_MESSAGE_PRIORITY;
    }
}
