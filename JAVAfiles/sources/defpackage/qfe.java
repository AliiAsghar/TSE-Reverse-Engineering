package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qfe implements apak {
    UNKNOWN_STATE(0),
    JOINED(1),
    DEPARTED(2),
    PENDING(3);

    public final int e;

    qfe(int i) {
        this.e = i;
    }

    public static qfe b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PENDING;
                }
                return DEPARTED;
            }
            return JOINED;
        }
        return UNKNOWN_STATE;
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
