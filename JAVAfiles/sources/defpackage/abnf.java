package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abnf implements apak {
    D2D_NOT_SET(0),
    D2D_TEST_APPLICATION(1),
    D2D_GOOGLE_MESSAGES(2),
    D2D_IOS_MESSAGES(3),
    UNRECOGNIZED(-1);

    private final int g;

    abnf(int i) {
        this.g = i;
    }

    public static abnf b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return D2D_IOS_MESSAGES;
                }
                return D2D_GOOGLE_MESSAGES;
            }
            return D2D_TEST_APPLICATION;
        }
        return D2D_NOT_SET;
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
