package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apne implements apak {
    UNKNOWN(0),
    ERROR_OPTIONS(1),
    SENT_OPTIONS(2),
    SENDING_OPTIONS(3),
    SEND_TIMEOUT_OPTIONS(4),
    ERROR_NO_RETRY_NO_FALLBACK_OPTIONS(5),
    ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS(6),
    XMS_STUCK_IN_SENDING_OPTIONS(7),
    XMS_FAILED_TO_SEND_OPTIONS(8),
    ERROR_GROUP_FTD_OPTIONS(9);

    public final int k;

    apne(int i) {
        this.k = i;
    }

    public static apne b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ERROR_OPTIONS;
            case 2:
                return SENT_OPTIONS;
            case 3:
                return SENDING_OPTIONS;
            case 4:
                return SEND_TIMEOUT_OPTIONS;
            case 5:
                return ERROR_NO_RETRY_NO_FALLBACK_OPTIONS;
            case 6:
                return ERROR_RECIPIENT_LOST_ENCRYPTION_OPTIONS;
            case 7:
                return XMS_STUCK_IN_SENDING_OPTIONS;
            case 8:
                return XMS_FAILED_TO_SEND_OPTIONS;
            case 9:
                return ERROR_GROUP_FTD_OPTIONS;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.k;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.k);
    }
}
