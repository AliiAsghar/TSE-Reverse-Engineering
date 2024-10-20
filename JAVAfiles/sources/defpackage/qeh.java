package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qeh implements apak {
    UNKNOWN_TYPE(0),
    PHONE(1),
    GROUP(2),
    BOT(3);

    public final int e;

    qeh(int i) {
        this.e = i;
    }

    public static qeh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return BOT;
                }
                return GROUP;
            }
            return PHONE;
        }
        return UNKNOWN_TYPE;
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
