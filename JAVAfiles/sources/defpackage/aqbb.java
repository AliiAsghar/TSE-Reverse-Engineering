package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqbb implements apak {
    UNKNOWN_STATE(0),
    UNCONSUMED(1),
    CONSUMED(2),
    UNRECOGNIZED(-1);

    private final int f;

    aqbb(int i) {
        this.f = i;
    }

    public static aqbb b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONSUMED;
            }
            return UNCONSUMED;
        }
        return UNKNOWN_STATE;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
