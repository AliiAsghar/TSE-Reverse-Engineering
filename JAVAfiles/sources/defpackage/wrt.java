package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wrt implements apak {
    OUTCOME_UNSPECIFIED(0),
    OUTCOME_SUCCESS(1),
    OUTCOME_FAILURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    wrt(int i) {
        this.f = i;
    }

    public static wrt b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return OUTCOME_FAILURE;
            }
            return OUTCOME_SUCCESS;
        }
        return OUTCOME_UNSPECIFIED;
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
