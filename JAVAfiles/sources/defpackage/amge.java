package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amge implements apak {
    UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON(0),
    INSTANT_MESSAGING_ALWAYS_ON(1),
    INSTANT_MESSAGING_NOT_ALWAYS_ON(2);

    public final int d;

    amge(int i) {
        this.d = i;
    }

    public static amge b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return INSTANT_MESSAGING_NOT_ALWAYS_ON;
            }
            return INSTANT_MESSAGING_ALWAYS_ON;
        }
        return UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
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
