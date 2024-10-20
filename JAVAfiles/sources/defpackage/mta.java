package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mta implements apak {
    UNSPECIFIED(0),
    NOT_MODIFIED(1),
    MODIFIED_AREA_CODE(2),
    MODIFIED_COUNTRY_CODE(3),
    MODIFIED_AND_INFORMED(4),
    UNRECOGNIZED(-1);

    private final int h;

    mta(int i) {
        this.h = i;
    }

    public static mta b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return MODIFIED_AND_INFORMED;
                    }
                    return MODIFIED_COUNTRY_CODE;
                }
                return MODIFIED_AREA_CODE;
            }
            return NOT_MODIFIED;
        }
        return UNSPECIFIED;
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
