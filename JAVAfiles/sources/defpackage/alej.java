package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum alej implements apak {
    UNSET(0),
    OCCURRENCE(8),
    INTEGER(9),
    INTEGER_HISTOGRAM(10),
    STRING(11),
    UNRECOGNIZED(-1);

    private final int h;

    alej(int i) {
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
