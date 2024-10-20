package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zsx implements apak {
    UNKNOWN(0),
    CONVERSATION(1),
    CONVERSATION_DETAILS(2);

    public final int d;

    zsx(int i) {
        this.d = i;
    }

    public static zsx b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONVERSATION_DETAILS;
            }
            return CONVERSATION;
        }
        return UNKNOWN;
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
