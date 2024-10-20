package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum alew implements apak {
    UNKNOWN_ARCH(0),
    X86_64(1),
    ARM_64(2),
    X86(3),
    X86_32(4),
    ARM_32(5),
    UNRECOGNIZED(-1);

    private final int i;

    alew(int i) {
        this.i = i;
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
