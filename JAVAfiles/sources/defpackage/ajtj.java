package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajtj extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        ajqw ajqwVar = (ajqw) obj;
        int ordinal = ajqwVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return wco.MESSAGING_METHOD_SLM;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(ajqwVar.toString()));
            }
            return wco.MESSAGING_METHOD_CHAT;
        }
        return wco.MESSAGING_METHOD_UNKNOWN;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        wco wcoVar = (wco) obj;
        int ordinal = wcoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return ajqw.MESSAGING_METHOD_SLM;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(wcoVar.toString()));
            }
            return ajqw.MESSAGING_METHOD_CHAT;
        }
        return ajqw.MESSAGING_METHOD_UNKNOWN;
    }
}
