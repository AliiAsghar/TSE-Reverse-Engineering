package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqba implements apak {
    UNKNOWN_STATUS(0),
    RECEIVED(1),
    SHOWN(2),
    SHOWN_REPLIED(3),
    CLICKED(4),
    UNRECOGNIZED(-1);

    private final int h;

    aqba(int i) {
        this.h = i;
    }

    public static aqba b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CLICKED;
                    }
                    return SHOWN_REPLIED;
                }
                return SHOWN;
            }
            return RECEIVED;
        }
        return UNKNOWN_STATUS;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
