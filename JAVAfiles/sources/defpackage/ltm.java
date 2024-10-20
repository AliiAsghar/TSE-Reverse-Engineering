package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ltm implements apak {
    UNSPECIFIED(0),
    REPLIED_TO_MESSAGE_NOT_FOUND(1),
    UNRECOGNIZED(-1);

    private final int e;

    ltm(int i) {
        this.e = i;
    }

    public static ltm b(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return REPLIED_TO_MESSAGE_NOT_FOUND;
        }
        return UNSPECIFIED;
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
