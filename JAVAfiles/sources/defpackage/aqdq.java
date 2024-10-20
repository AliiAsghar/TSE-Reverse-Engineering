package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqdq implements apak {
    USER(0),
    SIGNALING(1),
    NOTIFY(4),
    STATUS(3),
    EPHEMERAL(2),
    PUSH_ONLY(5),
    EPH_PUSH(7),
    UNRECOGNIZED(-1);

    private final int j;

    aqdq(int i2) {
        this.j = i2;
    }

    public static aqdq b(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                if (i2 != 7) {
                                    return null;
                                }
                                return EPH_PUSH;
                            }
                            return PUSH_ONLY;
                        }
                        return NOTIFY;
                    }
                    return STATUS;
                }
                return EPHEMERAL;
            }
            return SIGNALING;
        }
        return USER;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
