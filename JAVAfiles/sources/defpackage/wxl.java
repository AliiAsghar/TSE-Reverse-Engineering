package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wxl implements apak {
    FALLBACK_UNKNOWN(0),
    FALLBACK_DEFAULT(1),
    FALLBACK_REQUIRED(2),
    FALLBACK_NOT_ALLOWED(3);

    public final int e;

    wxl(int i) {
        this.e = i;
    }

    public static wxl b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return FALLBACK_NOT_ALLOWED;
                }
                return FALLBACK_REQUIRED;
            }
            return FALLBACK_DEFAULT;
        }
        return FALLBACK_UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
