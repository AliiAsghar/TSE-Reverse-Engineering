package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public enum amgo implements apak {
    UNKNOWN_HANDLED_BY(0),
    HANDLED_BY_CARRIER_APP(1),
    NOT_HANDLED_BY_CARRIER_APP(2);

    public final int d;

    amgo(int i) {
        this.d = i;
    }

    public static amgo b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return NOT_HANDLED_BY_CARRIER_APP;
            }
            return HANDLED_BY_CARRIER_APP;
        }
        return UNKNOWN_HANDLED_BY;
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
