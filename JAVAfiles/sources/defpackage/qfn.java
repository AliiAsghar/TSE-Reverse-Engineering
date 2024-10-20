package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qfn implements apak {
    UNKNOWN_REQUESTED_REPORT(0),
    POSITIVE_DELIVERY(1),
    DISPLAY(2);

    public final int d;

    qfn(int i) {
        this.d = i;
    }

    public static qfn b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DISPLAY;
            }
            return POSITIVE_DELIVERY;
        }
        return UNKNOWN_REQUESTED_REPORT;
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
