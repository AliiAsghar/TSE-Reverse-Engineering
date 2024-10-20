package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amku implements apak {
    UNKNOWN_TRIGGER_SOURCE(0),
    CREATE_GROUP_CHAT_COMPLETE_CALLBACK(1),
    GROUP_NOTIFICATION(2),
    GROUP_NOTIFICATION_VANILLA_RCS(3),
    INCOMING_IS_COMPOSING(4),
    INCOMING_GROUP_INVITE_HANDLER(5),
    INCOMING_FILE_TRANSFER(6),
    INCOMING_FILE_TRANSFER_VANILLA_RCS(7),
    INCOMING_MESSAGE(8),
    RESET_SESSION_ID_EVENT(9),
    GROUP_SESSION_STARTED_EVENT(10),
    TACHYGRAM_TO_CHAT_API_INCOMING_MESSAGE_ADAPTER(11),
    MESSAGE_SENDING_THREAD_ID_VERIFICATION(12),
    TACHYGRAM_GET_ROUTING_TOKEN(13),
    GET_OR_CREATE_CONVERSATION_ACTION(14);

    public final int p;

    amku(int i) {
        this.p = i;
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
