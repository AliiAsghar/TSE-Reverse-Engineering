package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqed {
    INBOX_MESSAGE,
    PONG,
    START_OF_BATCH,
    END_OF_BATCH,
    REFRESH_RESULT,
    FAST_PATH_READY,
    BODY_NOT_SET;

    public static aqed a(int i) {
        if (i != 0) {
            switch (i) {
                case 2:
                    return INBOX_MESSAGE;
                case 3:
                    return PONG;
                case 4:
                    return START_OF_BATCH;
                case 5:
                    return END_OF_BATCH;
                case 6:
                    return REFRESH_RESULT;
                case 7:
                    return FAST_PATH_READY;
                default:
                    return null;
            }
        }
        return BODY_NOT_SET;
    }
}
