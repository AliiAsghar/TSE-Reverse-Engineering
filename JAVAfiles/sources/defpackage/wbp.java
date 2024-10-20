package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wbp implements apak {
    DISPOSITION_NOTIFICATION_TYPE_UNKNOWN(0),
    DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY(1),
    DISPOSITION_NOTIFICATION_TYPE_DISPLAY(2);

    public final int d;

    wbp(int i) {
        this.d = i;
    }

    public static wbp b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DISPOSITION_NOTIFICATION_TYPE_DISPLAY;
            }
            return DISPOSITION_NOTIFICATION_TYPE_POSITIVE_DELIVERY;
        }
        return DISPOSITION_NOTIFICATION_TYPE_UNKNOWN;
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
