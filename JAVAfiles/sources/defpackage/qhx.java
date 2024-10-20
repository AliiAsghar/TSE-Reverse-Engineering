package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qhx implements apak {
    CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED(0),
    CONVERSATION_CLASSIFICATION_STATE_GENERATED(1),
    CONVERSATION_CLASSIFICATION_STATE_DISMISSED(2),
    UNRECOGNIZED(-1);

    private final int f;

    qhx(int i) {
        this.f = i;
    }

    public static qhx b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONVERSATION_CLASSIFICATION_STATE_DISMISSED;
            }
            return CONVERSATION_CLASSIFICATION_STATE_GENERATED;
        }
        return CONVERSATION_CLASSIFICATION_STATE_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
