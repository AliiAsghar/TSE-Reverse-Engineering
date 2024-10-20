package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum pqz implements apak {
    UNKNOWN(0),
    CREATED(1),
    REPLIED_BY_USER(2),
    UNRECOGNIZED(-1);

    private final int f;

    pqz(int i) {
        this.f = i;
    }

    public static pqz b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return REPLIED_BY_USER;
            }
            return CREATED;
        }
        return UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
