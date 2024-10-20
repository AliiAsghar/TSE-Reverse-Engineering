package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qfh implements apak {
    UNKNOWN_STATE(0),
    MEMBERSHIP_CONFIRMED(1),
    LEFT_GROUP(2),
    KICKED_OUT(3);

    public final int e;

    qfh(int i) {
        this.e = i;
    }

    public static qfh b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return KICKED_OUT;
                }
                return LEFT_GROUP;
            }
            return MEMBERSHIP_CONFIRMED;
        }
        return UNKNOWN_STATE;
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
