package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amii implements apak {
    PHONE_TYPE_NONE(0),
    PHONE_TYPE_GSM(1),
    PHONE_TYPE_CDMA(2),
    PHONE_TYPE_SIP(3);

    public final int e;

    amii(int i) {
        this.e = i;
    }

    public static amii b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PHONE_TYPE_SIP;
                }
                return PHONE_TYPE_CDMA;
            }
            return PHONE_TYPE_GSM;
        }
        return PHONE_TYPE_NONE;
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
