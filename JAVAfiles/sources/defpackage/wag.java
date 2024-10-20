package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class wag extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        qfe qfeVar = (qfe) obj;
        int ordinal = qfeVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return wby.PENDING;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(qfeVar.toString()));
                }
                return wby.ABSENT;
            }
            return wby.PRESENT;
        }
        return wby.UNKNOWN_TYPE;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wby wbyVar = (wby) obj;
        int ordinal = wbyVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return qfe.PENDING;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wbyVar.toString()));
                }
                return qfe.DEPARTED;
            }
            return qfe.JOINED;
        }
        return qfe.UNKNOWN_STATE;
    }
}
