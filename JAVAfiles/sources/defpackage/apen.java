package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apen implements apak {
    INVALID(0),
    VISIBLE(1),
    INVISIBLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    apen(int i) {
        this.f = i;
    }

    public static apen b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return INVISIBLE;
            }
            return VISIBLE;
        }
        return INVALID;
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
