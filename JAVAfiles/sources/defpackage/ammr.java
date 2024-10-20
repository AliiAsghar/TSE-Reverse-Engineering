package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum ammr implements apak {
    UNKNOWN_REPLY_MODE(0),
    REPLY(1),
    CONTINUATION(2);

    public final int d;

    ammr(int i) {
        this.d = i;
    }

    public static ammr b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return CONTINUATION;
            }
            return REPLY;
        }
        return UNKNOWN_REPLY_MODE;
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
