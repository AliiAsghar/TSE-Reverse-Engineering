package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abhv implements apak {
    MULTI_DEVICE_INTEGRATION_STATUS_UNSPECIFIED(0),
    INVALID_REQUEST(1),
    NOT_AVAILABLE(2),
    INTEGRATED(3),
    NOT_INTEGRATED(4),
    TYCHO_NOT_ACTIVATED(5);

    private final int h;

    abhv(int i) {
        this.h = i;
    }

    public static abhv b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return TYCHO_NOT_ACTIVATED;
                        }
                        return NOT_INTEGRATED;
                    }
                    return INTEGRATED;
                }
                return NOT_AVAILABLE;
            }
            return INVALID_REQUEST;
        }
        return MULTI_DEVICE_INTEGRATION_STATUS_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
