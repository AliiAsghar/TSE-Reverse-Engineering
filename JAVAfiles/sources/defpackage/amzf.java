package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amzf implements apak {
    UNKNOWN_DETECTION_TRIGGER_TYPE(0),
    MESSAGE_RECEIPT(1),
    RECLASSIFICATION(2),
    LINK_CLICK(3),
    REINFORCEMENT(4),
    UNRECOGNIZED(-1);

    private final int h;

    amzf(int i) {
        this.h = i;
    }

    public static amzf b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REINFORCEMENT;
                    }
                    return LINK_CLICK;
                }
                return RECLASSIFICATION;
            }
            return MESSAGE_RECEIPT;
        }
        return UNKNOWN_DETECTION_TRIGGER_TYPE;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
