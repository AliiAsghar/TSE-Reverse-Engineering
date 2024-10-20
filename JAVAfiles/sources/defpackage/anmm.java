package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anmm implements apak {
    UNKNOWN_TYPE(0),
    NOT_YET_KNOWN(1),
    RCS(2),
    C11N(3),
    C11N_RCS(4),
    UNRECOGNIZED(-1);

    private final int h;

    anmm(int i) {
        this.h = i;
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
