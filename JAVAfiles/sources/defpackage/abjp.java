package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abjp implements apak {
    UNKNOWN(0),
    STARTUP(1),
    TELEDOCTOR(2),
    UNRECOGNIZED(-1);

    private final int f;

    abjp(int i) {
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
