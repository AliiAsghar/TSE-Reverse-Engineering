package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amfg implements apak {
    UNKNOWN_BUGLE_CONVERSATION_TYPE(0),
    CONVERSATION_TYPE_ONE_ON_ONE(1),
    CONVERSATION_TYPE_GROUP_MMS(2),
    CONVERSATION_TYPE_GROUP_RCS(3),
    CONVERSATION_TYPE_GROUP_BROADCAST(4);

    public final int f;

    amfg(int i) {
        this.f = i;
    }

    public static amfg b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CONVERSATION_TYPE_GROUP_BROADCAST;
                    }
                    return CONVERSATION_TYPE_GROUP_RCS;
                }
                return CONVERSATION_TYPE_GROUP_MMS;
            }
            return CONVERSATION_TYPE_ONE_ON_ONE;
        }
        return UNKNOWN_BUGLE_CONVERSATION_TYPE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
