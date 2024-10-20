package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amzp implements apak {
    UNKNOWN_SPAM_VERDICT(0),
    SPAM(1),
    NOT_SPAM(2),
    NO_VERDICT(3),
    UNRECOGNIZED(-1);

    private final int g;

    amzp(int i) {
        this.g = i;
    }

    public static amzp b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NO_VERDICT;
                }
                return NOT_SPAM;
            }
            return SPAM;
        }
        return UNKNOWN_SPAM_VERDICT;
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
