package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wrz implements apak {
    CODE_UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);

    private final int f;

    wrz(int i) {
        this.f = i;
    }

    public static wrz b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FAILURE;
            }
            return SUCCESS;
        }
        return CODE_UNSPECIFIED;
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
