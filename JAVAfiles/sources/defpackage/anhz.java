package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anhz implements apak {
    UPI_ELIGIBILITY_UNSPECIFIED(0),
    ELIGIBLE(1),
    INELIGIBLE(2),
    UNRECOGNIZED(-1);

    private final int f;

    anhz(int i) {
        this.f = i;
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
