package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vec implements apak {
    UNSET_PREKEYS(0),
    SUFFICIENT_PREKEYS(1),
    LOW_PREKEYS(2),
    UNRECOGNIZED(-1);

    private final int f;

    vec(int i) {
        this.f = i;
    }

    public static vec b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return LOW_PREKEYS;
            }
            return SUFFICIENT_PREKEYS;
        }
        return UNSET_PREKEYS;
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
