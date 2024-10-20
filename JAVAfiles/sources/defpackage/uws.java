package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum uws implements apak {
    GSOS_UNKNOWN(0),
    GSOS_INTENTIONALLY_SIGNED_OUT(1),
    GSOS_UNINTENTIONALLY_SIGNED_OUT(2);

    public final int d;

    uws(int i) {
        this.d = i;
    }

    public static uws b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return GSOS_UNINTENTIONALLY_SIGNED_OUT;
            }
            return GSOS_INTENTIONALLY_SIGNED_OUT;
        }
        return GSOS_UNKNOWN;
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
