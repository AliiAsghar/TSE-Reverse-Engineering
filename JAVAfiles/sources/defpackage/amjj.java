package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amjj implements apak {
    UNKNOWN_SEND_MODE(0),
    SEND_MODE_AUTO(1),
    SEND_MODE_XMS(2),
    SEND_MODE_XMS_LATCH(3);

    public final int e;

    amjj(int i) {
        this.e = i;
    }

    public static amjj b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SEND_MODE_XMS_LATCH;
                }
                return SEND_MODE_XMS;
            }
            return SEND_MODE_AUTO;
        }
        return UNKNOWN_SEND_MODE;
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
