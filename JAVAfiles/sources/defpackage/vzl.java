package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class vzl extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqt ajqtVar = (ajqt) obj;
        int ordinal = ajqtVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return qfs.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(ajqtVar.toString()));
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
                    return ajqt.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(qfsVar.toString()));
            }
            return ajqt.USER;
        }
        return ajqt.UNKNOWN_MESSAGE_SOURCE;
    }
}
