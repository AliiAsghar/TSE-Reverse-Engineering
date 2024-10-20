package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amwf implements apak {
    UNKNOWN_INTENT_SOURCE(0),
    SHARE_INTENT(1),
    FORWARD(2),
    SNAP_IT(3);

    public final int e;

    amwf(int i) {
        this.e = i;
    }

    public static amwf b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SNAP_IT;
                }
                return FORWARD;
            }
            return SHARE_INTENT;
        }
        return UNKNOWN_INTENT_SOURCE;
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
