package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum asks implements apak {
    DEFAULT_TYPE(0),
    ADMINISTRATED(1),
    UNRECOGNIZED(-1);

    private final int e;

    asks(int i) {
        this.e = i;
    }

    public static asks b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return ADMINISTRATED;
        }
        return DEFAULT_TYPE;
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
