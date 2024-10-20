package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgn implements apak {
    UNKNOWN_FORMAT_TYPE(0),
    FORMAT_3GPP_GSM(1),
    FORMAT_3GPP2_CDMA(2);

    public final int d;

    amgn(int i) {
        this.d = i;
    }

    public static amgn b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FORMAT_3GPP2_CDMA;
            }
            return FORMAT_3GPP_GSM;
        }
        return UNKNOWN_FORMAT_TYPE;
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
