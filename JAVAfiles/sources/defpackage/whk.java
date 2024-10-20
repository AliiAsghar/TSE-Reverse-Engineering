package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum whk implements apak {
    RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED(0),
    LEGAL_FYI_SEEN(1),
    OOB_CONSENT(2),
    NO_OOB_CONSENT(3),
    UNRECOGNIZED(-1);

    private final int g;

    whk(int i) {
        this.g = i;
    }

    public static whk b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return NO_OOB_CONSENT;
                }
                return OOB_CONSENT;
            }
            return LEGAL_FYI_SEEN;
        }
        return RCS_DEFAULT_ON_CONSENT_STATE_UNSPECIFIED;
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
