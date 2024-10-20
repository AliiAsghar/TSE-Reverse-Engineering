package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgh implements apak {
    UNKNOWN_RCS_STATUS_REASON(0),
    OTHER_REASON(1),
    CONVERSATION_DATA_NOT_LOADED(2),
    GROUP_CONVERSATION(3),
    SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES(4),
    SENDER_NOT_AVAILABLE_NOT_CONNECTED_TO_RCS_SERVICE(5),
    SENDER_NOT_AVAILABLE_RCS_NOT_CONNECTED_TO_SERVER(6),
    SENDER_OFFLINE(7),
    RECEIVER_NOT_AVAILABLE(8),
    RECEIVER_OFFLINE(9),
    CONVERSATION_SET_TO_XMS_ONLY(10),
    CONVERSATION_LATCHED_TO_XMS(11),
    MANUAL_FALLBACK(12),
    REVOCATION_TIMER_EXPIRED(13),
    MISSING_SELF_IDENTITY(14);

    public final int p;

    amgh(int i) {
        this.p = i;
    }

    public static amgh b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_RCS_STATUS_REASON;
            case 1:
                return OTHER_REASON;
            case 2:
                return CONVERSATION_DATA_NOT_LOADED;
            case 3:
                return GROUP_CONVERSATION;
            case 4:
                return SENDER_NOT_AVAILABLE_RCS_AVAILABILITIES_ISSUES;
            case 5:
                return SENDER_NOT_AVAILABLE_NOT_CONNECTED_TO_RCS_SERVICE;
            case 6:
                return SENDER_NOT_AVAILABLE_RCS_NOT_CONNECTED_TO_SERVER;
            case 7:
                return SENDER_OFFLINE;
            case 8:
                return RECEIVER_NOT_AVAILABLE;
            case 9:
                return RECEIVER_OFFLINE;
            case 10:
                return CONVERSATION_SET_TO_XMS_ONLY;
            case 11:
                return CONVERSATION_LATCHED_TO_XMS;
            case 12:
                return MANUAL_FALLBACK;
            case 13:
                return REVOCATION_TIMER_EXPIRED;
            case 14:
                return MISSING_SELF_IDENTITY;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.p);
    }
}
