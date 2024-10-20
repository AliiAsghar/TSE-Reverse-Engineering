package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqax implements apak {
    UNKNOWN_SOURCE(0),
    NOTIFICATION_VIEW(1),
    CONVERSATIONS_LIST_VIEW(2),
    CONVERSATION_VIEW(3),
    UNRECOGNIZED(-1);

    private final int g;

    aqax(int i) {
        this.g = i;
    }

    public static aqax b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return CONVERSATION_VIEW;
                }
                return CONVERSATIONS_LIST_VIEW;
            }
            return NOTIFICATION_VIEW;
        }
        return UNKNOWN_SOURCE;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
