package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aphh implements apak {
    OPERATION_TYPE_UNKNOWN(0),
    OPERATION_TYPE_SETUP_VENDOR_IMS(1),
    OPERATION_TYPE_TERMINATE_VENDOR_IMS(2);

    public final int d;

    aphh(int i) {
        this.d = i;
    }

    public static aphh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return OPERATION_TYPE_TERMINATE_VENDOR_IMS;
            }
            return OPERATION_TYPE_SETUP_VENDOR_IMS;
        }
        return OPERATION_TYPE_UNKNOWN;
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
