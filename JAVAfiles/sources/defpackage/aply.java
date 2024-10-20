package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aply implements apak {
    UNKNOWN_STATE(0),
    ENABLED(1),
    DISABLED(2),
    UNRECOGNIZED(-1);

    private final int f;

    aply(int i) {
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
