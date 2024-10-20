package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wae extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        wcb wcbVar = (wcb) obj;
        int ordinal = wcbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return qfr.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wcbVar.toString()));
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
                        return wcb.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(qfrVar.toString()));
                }
                return wcb.NORMAL;
            }
            return wcb.HIGH;
        }
        return wcb.UNKNOWN_MESSAGE_PRIORITY;
    }
}
