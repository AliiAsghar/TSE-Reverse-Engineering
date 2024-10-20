package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apzk implements apak {
    UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION(0),
    SHOW_WARNING(1),
    MOVE_TO_SPAM_FOLDER(2),
    DO_NOTHING(3),
    SKIPPED(4),
    ALLOW(5),
    UNRECOGNIZED(-1);

    private final int i;

    apzk(int i) {
        this.i = i;
    }

    public static apzk b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return ALLOW;
                        }
                        return SKIPPED;
                    }
                    return DO_NOTHING;
                }
                return MOVE_TO_SPAM_FOLDER;
            }
            return SHOW_WARNING;
        }
        return UNKNOWN_SPAM_VERDICT_ENFORCEMENT_ACTION;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
