package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yxe extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        tqu tquVar = (tqu) obj;
        int ordinal = tquVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 6) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return yxq.TELEPHONY_UNSPECIFIED;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(tquVar.toString()));
                }
                return yxq.SLM;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        yxq yxqVar = (yxq) obj;
        int ordinal = yxqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return tqu.SLM;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(yxqVar.toString()));
        }
        return tqu.TELEPHONY_UNSPECIFIED;
    }
}
