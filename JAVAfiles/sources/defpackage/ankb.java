package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ankb extends algf {
    private final anjq a;

    public ankb() {
        throw null;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        askt asktVar = (askt) obj;
        int ordinal = asktVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return anjk.a;
                    }
                    throw new IllegalArgumentException("unknown enum value: ".concat(asktVar.toString()));
                }
                if (anjq.c != this.a) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                return anjk.c;
            }
        } else {
            if (anjq.b != this.a) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return anjk.b;
    }

    @Override // defpackage.algf
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        anjk anjkVar = (anjk) obj;
        int ordinal = anjkVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return askt.ADMIN;
                }
                throw new IllegalArgumentException("unknown enum value: ".concat(anjkVar.toString()));
            }
            int ordinal2 = this.a.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        return askt.REGULAR;
                    }
                    throw new armm();
                }
                return askt.DEFAULT_ROLE;
            }
        }
        return askt.UNRECOGNIZED;
    }

    public ankb(anjq anjqVar) {
        this.a = anjqVar;
    }
}
