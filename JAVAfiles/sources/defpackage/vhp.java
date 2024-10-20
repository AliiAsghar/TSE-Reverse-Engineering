package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vhp extends algf {
    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        asgu asguVar = (asgu) obj;
        int ordinal = asguVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return aqeg.UNRECOGNIZED;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(asguVar.toString()));
                    }
                    return aqeg.INITIAL_PULL_MESSAGES;
                }
                return aqeg.COLLIDER_SECOND_FANOUT_ATTEMPT;
            }
            return aqeg.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        return aqeg.UNKNOWN_MESSAGE_ORIGIN;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aqeg aqegVar = (aqeg) obj;
        int ordinal = aqegVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return asgu.UNRECOGNIZED;
                        }
                        throw new IllegalArgumentException("unknown enum value: ".concat(aqegVar.toString()));
                    }
                    return asgu.INITIAL_PULL_MESSAGES;
                }
                return asgu.COLLIDER_SECOND_FANOUT_ATTEMPT;
            }
            return asgu.COLLIDER_FIRST_FANOUT_ATTEMPT;
        }
        return asgu.UNKNOWN_MESSAGE_ORIGIN;
    }
}
