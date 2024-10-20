package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qfr implements apak {
    UNKNOWN_MESSAGE_PRIORITY(0),
    HIGH(1),
    NORMAL(2),
    LOW(3);

    public final int e;

    qfr(int i) {
        this.e = i;
    }

    public static qfr b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return LOW;
                }
                return NORMAL;
            }
            return HIGH;
        }
        return UNKNOWN_MESSAGE_PRIORITY;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
