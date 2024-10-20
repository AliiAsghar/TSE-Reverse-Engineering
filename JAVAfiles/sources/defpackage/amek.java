package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amek implements apak {
    BUGLE_ADVANCED_FEEDBACK_SOURCE_UNKNOWN(0),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU(1),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_SHAKE_GESTURE(2),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_P2P_SUGGESTION(3),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC(4),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_FAILED_TO_SEND_OR_DOWNLOAD(5),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_FAILED_RECEIVE(6),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_STUCK_IN_SENDING(7),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_SMS_REJECTED(8),
    BUGLE_ADVANCED_FEEDBACK_SOURCE_MESSAGE_DETAIL(9);

    public final int k;

    amek(int i) {
        this.k = i;
    }

    public static amek b(int i) {
        switch (i) {
            case 0:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_UNKNOWN;
            case 1:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU;
            case 2:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_SHAKE_GESTURE;
            case 3:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_P2P_SUGGESTION;
            case 4:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC;
            case 5:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_FAILED_TO_SEND_OR_DOWNLOAD;
            case 6:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_FAILED_RECEIVE;
            case 7:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_ACTION_MESSAGES_STUCK_IN_SENDING;
            case 8:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_SMS_REJECTED;
            case 9:
                return BUGLE_ADVANCED_FEEDBACK_SOURCE_MESSAGE_DETAIL;
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
