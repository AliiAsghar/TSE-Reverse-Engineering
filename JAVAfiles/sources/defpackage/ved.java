package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum ved implements apak {
    UNSET_TACHYON_STATE(0),
    NOT_REGISTERED(1),
    REGISTERED_WITHOUT_PREKEYS(2),
    REGISTERED_WITH_PREKEYS(3),
    UNRECOGNIZED(-1);

    private final int g;

    ved(int i) {
        this.g = i;
    }

    public static ved b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return REGISTERED_WITH_PREKEYS;
                }
                return REGISTERED_WITHOUT_PREKEYS;
            }
            return NOT_REGISTERED;
        }
        return UNSET_TACHYON_STATE;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
