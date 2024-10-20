package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wfo implements apak {
    GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED(0),
    GOOGLE_TOS_CONSENTED(1),
    GOOGLE_TOS_DECLINED(2),
    UNRECOGNIZED(-1);

    private final int f;

    wfo(int i) {
        this.f = i;
    }

    public static wfo b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GOOGLE_TOS_DECLINED;
            }
            return GOOGLE_TOS_CONSENTED;
        }
        return GOOGLE_TOS_CONSENT_STATE_UNSPECIFIED;
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
