package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wco implements apak {
    MESSAGING_METHOD_UNKNOWN(0),
    MESSAGING_METHOD_CHAT(1),
    MESSAGING_METHOD_SLM(2);

    public final int d;

    wco(int i) {
        this.d = i;
    }

    public static wco b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return MESSAGING_METHOD_SLM;
            }
            return MESSAGING_METHOD_CHAT;
        }
        return MESSAGING_METHOD_UNKNOWN;
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
