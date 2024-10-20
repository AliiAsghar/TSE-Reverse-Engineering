package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qef implements apak {
    UNKNOWN_STATUS(0),
    OK(1),
    PENDING(2),
    FAILED_TRANSIENTLY(3),
    FAILED_PERMANENTLY(4);

    public final int f;

    qef(int i) {
        this.f = i;
    }

    public static qef b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return FAILED_PERMANENTLY;
                    }
                    return FAILED_TRANSIENTLY;
                }
                return PENDING;
            }
            return OK;
        }
        return UNKNOWN_STATUS;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f);
    }
}
