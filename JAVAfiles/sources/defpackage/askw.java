package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum askw implements apak {
    UNKNOWN(0),
    VERSION_CHECK_UPGRADE_APP(1),
    VERSION_CHECK_BLOCK_APP(2),
    SPAM_SUSPEND_ACCOUNT(3),
    UNRECOGNIZED(-1);

    private final int g;

    askw(int i) {
        this.g = i;
    }

    public static askw b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SPAM_SUSPEND_ACCOUNT;
                }
                return VERSION_CHECK_BLOCK_APP;
            }
            return VERSION_CHECK_UPGRADE_APP;
        }
        return UNKNOWN;
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
