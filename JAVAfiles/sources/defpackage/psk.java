package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum psk implements apak {
    NOT_SET(0),
    HIDE(1),
    SHOW(2),
    UNRECOGNIZED(-1);

    private final int f;

    psk(int i) {
        this.f = i;
    }

    public static psk b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SHOW;
            }
            return HIDE;
        }
        return NOT_SET;
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
