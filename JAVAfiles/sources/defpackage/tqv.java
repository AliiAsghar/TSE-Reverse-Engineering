package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum tqv implements apak {
    UNKNOWN_TRIGGER(0),
    TEST_TRIGGER(1),
    UNRECOGNIZED(-1);

    private final int e;

    tqv(int i) {
        this.e = i;
    }

    public static tqv b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return TEST_TRIGGER;
        }
        return UNKNOWN_TRIGGER;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
