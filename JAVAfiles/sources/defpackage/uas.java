package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum uas implements apak {
    UNKNOWN(0),
    NONE(1),
    ONE_ON_ONE_ENCRYPTION(2),
    GROUP_ENCRYPTION(3);

    public final int e;

    uas(int i) {
        this.e = i;
    }

    public static uas b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return GROUP_ENCRYPTION;
                }
                return ONE_ON_ONE_ENCRYPTION;
            }
            return NONE;
        }
        return UNKNOWN;
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
