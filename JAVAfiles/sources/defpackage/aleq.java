package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aleq implements apak {
    RELEASE_STAGE_NOT_SET(0),
    DEBUG(10),
    FISHFOOD(20),
    DOGFOOD(40),
    OPEN_BETA(60),
    GA(99),
    UNRECOGNIZED(-1);

    private final int i;

    aleq(int i) {
        this.i = i;
    }

    public static aleq b(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 40) {
                        if (i != 60) {
                            if (i != 99) {
                                return null;
                            }
                            return GA;
                        }
                        return OPEN_BETA;
                    }
                    return DOGFOOD;
                }
                return FISHFOOD;
            }
            return DEBUG;
        }
        return RELEASE_STAGE_NOT_SET;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
