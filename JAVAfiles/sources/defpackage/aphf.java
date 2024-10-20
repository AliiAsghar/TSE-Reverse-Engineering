package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aphf implements apak {
    FAILURE_REASON_UNKNOWN(0),
    FAILURE_REASON_IMS_EXCEPTION(1),
    FAILURE_REASON_SECURITY_EXCEPTION(2),
    FAILURE_REASON_SIM_NOT_FOUND(3),
    FAILURE_REASON_SINGLE_REGISTRATION_DISABLED_BY_FLAG(4),
    FAILURE_REASON_INVALID_SUBSCRIPTION_ID(5),
    FAILURE_REASON_JIBE_SERVICE_EXCEPTION(6),
    FAILURE_REASON_TIMEOUT_EXCEPTION(7),
    FAILURE_REASON_RCS_SERVICE_CONNECTION_EXCEPTION(8);

    public final int j;

    aphf(int i) {
        this.j = i;
    }

    public static aphf b(int i) {
        switch (i) {
            case 0:
                return FAILURE_REASON_UNKNOWN;
            case 1:
                return FAILURE_REASON_IMS_EXCEPTION;
            case 2:
                return FAILURE_REASON_SECURITY_EXCEPTION;
            case 3:
                return FAILURE_REASON_SIM_NOT_FOUND;
            case 4:
                return FAILURE_REASON_SINGLE_REGISTRATION_DISABLED_BY_FLAG;
            case 5:
                return FAILURE_REASON_INVALID_SUBSCRIPTION_ID;
            case 6:
                return FAILURE_REASON_JIBE_SERVICE_EXCEPTION;
            case 7:
                return FAILURE_REASON_TIMEOUT_EXCEPTION;
            case 8:
                return FAILURE_REASON_RCS_SERVICE_CONNECTION_EXCEPTION;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
