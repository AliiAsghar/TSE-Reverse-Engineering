package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgi implements apak {
    UNKNOWN_RESEND_ATTEMPT(0),
    RESEND_ATTEMPT(1),
    FIRST_ATTEMPT_TO_SEND(2);

    public final int d;

    amgi(int i) {
        this.d = i;
    }

    public static amgi b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return FIRST_ATTEMPT_TO_SEND;
            }
            return RESEND_ATTEMPT;
        }
        return UNKNOWN_RESEND_ATTEMPT;
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
