package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public enum amgq implements apak {
    UNKNOWN_IS_IMS(0),
    IMS(1),
    NOT_IMS(2);

    public final int d;

    amgq(int i) {
        this.d = i;
    }

    public static amgq b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return NOT_IMS;
            }
            return IMS;
        }
        return UNKNOWN_IS_IMS;
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
