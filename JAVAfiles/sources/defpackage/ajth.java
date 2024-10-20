package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajth extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqs ajqsVar = (ajqs) obj;
        int ordinal = ajqsVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return wcb.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(ajqsVar.toString()));
                }
                return wcb.NORMAL;
            }
            return wcb.HIGH;
        }
        return wcb.UNKNOWN_MESSAGE_PRIORITY;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wcb wcbVar = (wcb) obj;
        int ordinal = wcbVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return ajqs.LOW;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wcbVar.toString()));
                }
                return ajqs.NORMAL;
            }
            return ajqs.HIGH;
        }
        return ajqs.UNKNOWN_MESSAGE_PRIORITY;
    }
}
