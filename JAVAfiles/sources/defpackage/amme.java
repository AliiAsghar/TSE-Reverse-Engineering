package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amme implements apak {
    UNKNOWN_ISSUE_TYPE(0),
    DEBUG_ISSUE(1),
    GENERIC_ISSUE(2),
    MESSAGE_DOWNLOAD_FAILURE(3),
    MESSAGE_SENDING_FAILURE(4),
    MESSAGE_STUCK_IN_SENDING(5),
    PERSISTENT_FOREGROUND_NOTIFICATION(6),
    SMS_REJECTED(7),
    SILENT_CRASH(8),
    TELEPHONY_DB_RECREATED(9),
    LOST_ETOUFFEE(10),
    MESSAGE_DELIVERY_FAILURE_RECIPIENT_LOST_RCS(11),
    RCS_GROUP_CREATION_ERROR(12),
    SLOW_PERFORMANCE(13);

    public final int o;

    amme(int i) {
        this.o = i;
    }

    public static amme b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_ISSUE_TYPE;
            case 1:
                return DEBUG_ISSUE;
            case 2:
                return GENERIC_ISSUE;
            case 3:
                return MESSAGE_DOWNLOAD_FAILURE;
            case 4:
                return MESSAGE_SENDING_FAILURE;
            case 5:
                return MESSAGE_STUCK_IN_SENDING;
            case 6:
                return PERSISTENT_FOREGROUND_NOTIFICATION;
            case 7:
                return SMS_REJECTED;
            case 8:
                return SILENT_CRASH;
            case 9:
                return TELEPHONY_DB_RECREATED;
            case 10:
                return LOST_ETOUFFEE;
            case 11:
                return MESSAGE_DELIVERY_FAILURE_RECIPIENT_LOST_RCS;
            case 12:
                return RCS_GROUP_CREATION_ERROR;
            case 13:
                return SLOW_PERFORMANCE;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.o;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.o);
    }
}
