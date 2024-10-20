package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum ywt {
    LIST_CONVERSATIONS_REQUEST,
    LIST_MESSAGES_REQUEST,
    SEND_REACTION_REQUEST,
    REQUESTPAYLOAD_NOT_SET;

    public static ywt a(int i) {
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return null;
                    }
                    return SEND_REACTION_REQUEST;
                }
                return LIST_MESSAGES_REQUEST;
            }
            return LIST_CONVERSATIONS_REQUEST;
        }
        return REQUESTPAYLOAD_NOT_SET;
    }
}
