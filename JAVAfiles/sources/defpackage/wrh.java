package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wrh implements apak {
    HELP_STATE_UNSPECIFIED(0),
    HELP_NOT_LONGER_NEED(1),
    WAITING_FOR_HELP(2),
    UNRECOGNIZED(-1);

    private final int f;

    wrh(int i) {
        this.f = i;
    }

    public static wrh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return WAITING_FOR_HELP;
            }
            return HELP_NOT_LONGER_NEED;
        }
        return HELP_STATE_UNSPECIFIED;
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
