package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum yua implements apak {
    UNKNOWN_TYPE(0),
    NOT_YET_KNOWN(1),
    RCS(2),
    C11N(3),
    C11N_RCS(4),
    UNRECOGNIZED(-1);

    private final int h;

    yua(int i) {
        this.h = i;
    }

    public static yua b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return C11N_RCS;
                    }
                    return C11N;
                }
                return RCS;
            }
            return NOT_YET_KNOWN;
        }
        return UNKNOWN_TYPE;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
