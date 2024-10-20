package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vzm extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        qfn qfnVar = (qfn) obj;
        int ordinal = qfnVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return ajqo.DISPLAY;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(qfnVar.toString()));
        }
        return ajqo.POSITIVE_DELIVERY;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        ajqo ajqoVar = (ajqo) obj;
        int ordinal = ajqoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return qfn.DISPLAY;
            }
            throw new IllegalArgumentException("unknown enum value: ".concat(ajqoVar.toString()));
        }
        return qfn.POSITIVE_DELIVERY;
    }
}
