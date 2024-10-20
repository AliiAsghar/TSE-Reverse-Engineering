package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amuk implements apak {
    TRANSPORT_UNKNOWN(0),
    TRANSPORT_RCS(1),
    TRANSPORT_TACHYGRAM(2),
    TRANSPORT_SINGLE_REGISTRATION(3);

    public final int e;

    amuk(int i) {
        this.e = i;
    }

    public static amuk b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TRANSPORT_SINGLE_REGISTRATION;
                }
                return TRANSPORT_TACHYGRAM;
            }
            return TRANSPORT_RCS;
        }
        return TRANSPORT_UNKNOWN;
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
