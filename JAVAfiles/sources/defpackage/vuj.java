package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vuj implements apak {
    DELETION_STRATEGY_UNSPECIFIED(0),
    DELETE(1),
    DELETE_IF_EMPTY(2),
    DO_NOT_DELETE(3),
    UNRECOGNIZED(-1);

    private final int g;

    vuj(int i) {
        this.g = i;
    }

    public static vuj b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return DO_NOT_DELETE;
                }
                return DELETE_IF_EMPTY;
            }
            return DELETE;
        }
        return DELETION_STRATEGY_UNSPECIFIED;
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
