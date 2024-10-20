package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wby implements apak {
    UNKNOWN_TYPE(0),
    PRESENT(1),
    ABSENT(2),
    PENDING(3);

    public final int e;

    wby(int i) {
        this.e = i;
    }

    public static wby b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return PENDING;
                }
                return ABSENT;
            }
            return PRESENT;
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
