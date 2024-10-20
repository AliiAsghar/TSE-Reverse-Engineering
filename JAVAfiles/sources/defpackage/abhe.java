package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abhe implements apak {
    UNKNOWN(0),
    DEMO(1),
    ESP(2),
    UNRECOGNIZED(-1);

    private final int f;

    abhe(int i) {
        this.f = i;
    }

    public static abhe b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return ESP;
            }
            return DEMO;
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
