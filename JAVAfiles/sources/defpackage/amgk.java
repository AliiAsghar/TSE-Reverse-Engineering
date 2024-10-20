package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgk implements apak {
    UNKNOWN_WAS_RCS_CONVERSATION(0),
    WAS_RCS_CONVERSATION(1),
    HAS_ALWAYS_BEEN_XMS_CONVERSATION(2);

    public final int d;

    amgk(int i) {
        this.d = i;
    }

    public static amgk b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return HAS_ALWAYS_BEEN_XMS_CONVERSATION;
            }
            return WAS_RCS_CONVERSATION;
        }
        return UNKNOWN_WAS_RCS_CONVERSATION;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.d;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.d);
    }
}
