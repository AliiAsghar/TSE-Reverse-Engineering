package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgj implements apak {
    UNKNOWN_BUGLE_MESSAGE_SOURCE(0),
    INCOMING(1),
    CONVERSATION_ACTIVITY(2),
    OBSOLETE_WEARABLE_REPLY(3),
    NOTIFICATION_REPLY(4),
    WIDGET_REPLY(5),
    PHONE_QUICK_REPLY(6),
    BUGLE_MESSAGE_SOURCE_NA(7),
    PHONE_SMART_REPLY(8),
    ASSISTANT_REPLY(9),
    ASSISTANT_DICTATION(15),
    MESSAGE_REACTION(10),
    MESSAGE_SEND_RETRY(11),
    SCHEDULED_SEND(12),
    EXTERNAL_MESSAGING_API(13),
    BUBBLE(14),
    MAPI_SEND_MSG(16),
    MULTI_SHARE_SEND(17),
    ANDROID_AUTO_REPLY(18),
    RBM_SUGGESTION_REPLY(19),
    MEDIA_FULL_SCREEN(20),
    DIRECT_SEND_FULL_SCREEN(21);

    public final int w;

    amgj(int i) {
        this.w = i;
    }

    public static amgj b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_BUGLE_MESSAGE_SOURCE;
            case 1:
                return INCOMING;
            case 2:
                return CONVERSATION_ACTIVITY;
            case 3:
                return OBSOLETE_WEARABLE_REPLY;
            case 4:
                return NOTIFICATION_REPLY;
            case 5:
                return WIDGET_REPLY;
            case 6:
                return PHONE_QUICK_REPLY;
            case 7:
                return BUGLE_MESSAGE_SOURCE_NA;
            case 8:
                return PHONE_SMART_REPLY;
            case 9:
                return ASSISTANT_REPLY;
            case 10:
                return MESSAGE_REACTION;
            case 11:
                return MESSAGE_SEND_RETRY;
            case 12:
                return SCHEDULED_SEND;
            case 13:
                return EXTERNAL_MESSAGING_API;
            case 14:
                return BUBBLE;
            case 15:
                return ASSISTANT_DICTATION;
            case 16:
                return MAPI_SEND_MSG;
            case 17:
                return MULTI_SHARE_SEND;
            case 18:
                return ANDROID_AUTO_REPLY;
            case 19:
                return RBM_SUGGESTION_REPLY;
            case 20:
                return MEDIA_FULL_SCREEN;
            case 21:
                return DIRECT_SEND_FULL_SCREEN;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.w;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.w);
    }
}
