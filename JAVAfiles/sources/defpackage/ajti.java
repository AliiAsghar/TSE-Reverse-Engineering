package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajti extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqt ajqtVar = (ajqt) obj;
        int ordinal = ajqtVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return wcc.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(ajqtVar.toString()));
            }
            return wcc.USER;
        }
        return wcc.UNKNOWN_MESSAGE_SOURCE;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wcc wccVar = (wcc) obj;
        int ordinal = wccVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ajqt.CONTROL;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(wccVar.toString()));
            }
            return ajqt.USER;
        }
        return ajqt.UNKNOWN_MESSAGE_SOURCE;
    }
}
