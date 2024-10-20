package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pst extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        amwy amwyVar = (amwy) obj;
        int ordinal = amwyVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return qef.FAILED_PERMANENTLY;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(amwyVar.toString()));
                    }
                    return qef.FAILED_TRANSIENTLY;
                }
                return qef.PENDING;
            }
            return qef.OK;
        }
        return qef.UNKNOWN_STATUS;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        qef qefVar = (qef) obj;
        int ordinal = qefVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return amwy.CHAT_API_FAILED_PERMANENTLY;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(qefVar.toString()));
                    }
                    return amwy.CHAT_API_FAILED_TRANSIENTLY;
                }
                return amwy.CHAT_API_PENDING;
            }
            return amwy.CHAT_API_OK;
        }
        return amwy.CHAT_API_UNKNOWN;
    }
}
