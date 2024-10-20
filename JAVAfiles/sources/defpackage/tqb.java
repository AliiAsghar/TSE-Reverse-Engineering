package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum tqb implements apak {
    UNKNOWN_WORKER(0),
    PHONE_NUMBER_NORMALIZATION(1),
    PARTICIPANTS_TABLE_MY_IDENTITY(2),
    MY_IDENTITY_FOREIGN_KEY(3),
    UNRECOGNIZED(-1);

    private final int g;

    tqb(int i) {
        this.g = i;
    }

    public static tqb b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return MY_IDENTITY_FOREIGN_KEY;
                }
                return PARTICIPANTS_TABLE_MY_IDENTITY;
            }
            return PHONE_NUMBER_NORMALIZATION;
        }
        return UNKNOWN_WORKER;
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
