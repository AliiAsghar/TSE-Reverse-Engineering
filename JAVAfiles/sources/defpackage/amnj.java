package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amnj implements apak {
    UNKNOWN_SIGNAL_STRENGTH(0),
    SIGNAL_STRENGTH_NONE_OR_UNKNOWN(5),
    SIGNAL_STRENGTH_POOR(1),
    SIGNAL_STRENGTH_MODERATE(2),
    SIGNAL_STRENGTH_GOOD(3),
    SIGNAL_STRENGTH_GREAT(4);

    public final int g;

    amnj(int i) {
        this.g = i;
    }

    public static amnj b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return SIGNAL_STRENGTH_NONE_OR_UNKNOWN;
                        }
                        return SIGNAL_STRENGTH_GREAT;
                    }
                    return SIGNAL_STRENGTH_GOOD;
                }
                return SIGNAL_STRENGTH_MODERATE;
            }
            return SIGNAL_STRENGTH_POOR;
        }
        return UNKNOWN_SIGNAL_STRENGTH;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
