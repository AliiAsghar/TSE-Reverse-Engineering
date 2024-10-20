package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wgf implements apak {
    RESPONSE_STATUS_UNKNOWN(0),
    OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE(1),
    OTP_FORCE_VERIFICATION_THROTTLED(2),
    OTP_THROTTLED(5),
    OTP_TIMEOUT(3),
    OTP_COMPLETE(4),
    UNRECOGNIZED(-1);

    private final int i;

    wgf(int i) {
        this.i = i;
    }

    public static wgf b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return OTP_THROTTLED;
                        }
                        return OTP_COMPLETE;
                    }
                    return OTP_TIMEOUT;
                }
                return OTP_FORCE_VERIFICATION_THROTTLED;
            }
            return OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE;
        }
        return RESPONSE_STATUS_UNKNOWN;
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
