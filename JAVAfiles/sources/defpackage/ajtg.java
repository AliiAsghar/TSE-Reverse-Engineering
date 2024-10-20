package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajtg extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqi ajqiVar = (ajqi) obj;
        int ordinal = ajqiVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return wby.PENDING;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(ajqiVar.toString()));
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
                        return ajqi.PENDING;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(wbyVar.toString()));
                }
                return ajqi.ABSENT;
            }
            return ajqi.PRESENT;
        }
        return ajqi.UNKNOWN;
    }
}
