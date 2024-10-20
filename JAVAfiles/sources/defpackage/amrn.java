package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amrn implements apak {
    UNKNOWN_RETRY_TYPE(0),
    NO_RETRY(1),
    RETRY_AFTER_DELAY(2),
    RETRY_AFTER_REPROVISIONING(3),
    RETRY_AFTER_REGISTRATION_REFRESH(4);

    public final int f;

    amrn(int i) {
        this.f = i;
    }

    public static amrn b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return RETRY_AFTER_REGISTRATION_REFRESH;
                    }
                    return RETRY_AFTER_REPROVISIONING;
                }
                return RETRY_AFTER_DELAY;
            }
            return NO_RETRY;
        }
        return UNKNOWN_RETRY_TYPE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
