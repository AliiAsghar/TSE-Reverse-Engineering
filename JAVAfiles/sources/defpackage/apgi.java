package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apgi implements apak {
    IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED(0),
    IMS_EXCEPTION_CODE_ERROR_SERVICE_UNAVAILABLE(1),
    IMS_EXCEPTION_CODE_ERROR_UNSUPPORTED_OPERATION(2),
    IMS_EXCEPTION_CODE_ERROR_INVALID_SUBSCRIPTION(3);

    public final int e;

    apgi(int i) {
        this.e = i;
    }

    public static apgi b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return IMS_EXCEPTION_CODE_ERROR_INVALID_SUBSCRIPTION;
                }
                return IMS_EXCEPTION_CODE_ERROR_UNSUPPORTED_OPERATION;
            }
            return IMS_EXCEPTION_CODE_ERROR_SERVICE_UNAVAILABLE;
        }
        return IMS_EXCEPTION_CODE_ERROR_UNSPECIFIED;
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
