package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtf extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqo ajqoVar = (ajqo) obj;
        int ordinal = ajqoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return wbp.DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(ajqoVar.toString()));
        }
        return wbp.DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wbp wbpVar = (wbp) obj;
        int ordinal = wbpVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ajqo.DISPLAY;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(wbpVar.toString()));
        }
        return ajqo.POSITIVE_DELIVERY;
    }
}
