package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amfd implements apak {
    UNKNOWN_LATCH_REASON(0),
    DELIVERY_MESSAGE_TIMEOUT(1),
    SEND_MESSAGE_FAILED(2),
    DEBUG_MENU_COMMAND_FAIL_SEND(3),
    MANUAL_RETRY_FORCES_FALLBACK(4),
    DITTO_CHANNEL_RESEND(5),
    RCS_FILE_TRANSFER_METADATA_UPDATE(6),
    SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK(7);

    public final int i;

    amfd(int i) {
        this.i = i;
    }

    public static amfd b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_LATCH_REASON;
            case 1:
                return DELIVERY_MESSAGE_TIMEOUT;
            case 2:
                return SEND_MESSAGE_FAILED;
            case 3:
                return DEBUG_MENU_COMMAND_FAIL_SEND;
            case 4:
                return MANUAL_RETRY_FORCES_FALLBACK;
            case 5:
                return DITTO_CHANNEL_RESEND;
            case 6:
                return RCS_FILE_TRANSFER_METADATA_UPDATE;
            case 7:
                return SEND_MESSAGE_TIMEOUT_AUTO_FALLBACK;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        return this.i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.i);
    }
}
