package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aovh implements apak {
    UNKNOWN(0),
    ENFORCE(1),
    DO_NOT_ENFORCE(2);

    public final int d;

    aovh(int i) {
        this.d = i;
    }

    public static aovh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return DO_NOT_ENFORCE;
            }
            return ENFORCE;
        }
        return UNKNOWN;
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
