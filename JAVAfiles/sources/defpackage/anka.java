package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class anka extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        asks asksVar = (asks) obj;
        int ordinal = asksVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return anjq.a;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(asksVar.toString()));
            }
            return anjq.c;
        }
        return anjq.b;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        anjq anjqVar = (anjq) obj;
        int ordinal = anjqVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return asks.ADMINISTRATED;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(anjqVar.toString()));
            }
            return asks.DEFAULT_TYPE;
        }
        return asks.UNRECOGNIZED;
    }
}
