package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wdf implements apak {
    RESPONSE_STATUS_UNKNOWN(0),
    RESPONSE_STATUS_OK(1),
    RESPONSE_STATUS_FAILED(2);

    public final int d;

    wdf(int i) {
        this.d = i;
    }

    public static wdf b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return RESPONSE_STATUS_FAILED;
            }
            return RESPONSE_STATUS_OK;
        }
        return RESPONSE_STATUS_UNKNOWN;
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
