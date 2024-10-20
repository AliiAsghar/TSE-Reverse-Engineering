package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum afve implements apak {
    MEDIA_QUALITY_UNKNOWN(0),
    VERY_LOW(1),
    LOW(2),
    HIGH(3),
    ORIGINAL(4),
    UNRECOGNIZED(-1);

    private final int h;

    afve(int i) {
        this.h = i;
    }

    public static afve b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return ORIGINAL;
                    }
                    return HIGH;
                }
                return LOW;
            }
            return VERY_LOW;
        }
        return MEDIA_QUALITY_UNKNOWN;
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
