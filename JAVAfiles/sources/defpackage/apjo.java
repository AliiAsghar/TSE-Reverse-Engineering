package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apjo implements apak {
    UNKNOWN_MSISDN_SOURCE(0),
    SIM(1),
    MANUAL_MSISDN(2);

    public final int d;

    apjo(int i) {
        this.d = i;
    }

    public static apjo b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return MANUAL_MSISDN;
            }
            return SIM;
        }
        return UNKNOWN_MSISDN_SOURCE;
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
