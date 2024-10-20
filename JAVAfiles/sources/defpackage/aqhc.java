package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqhc implements apak {
    UNKNOWN_GROUP_ICON_MODIFICATION_POLICY(0),
    NO_GROUP_ICON_MODIFICATION_ALLOWED(1),
    GROUP_ICON_MODIFICATION_ALLOWED(2),
    UNRECOGNIZED(-1);

    private final int f;

    aqhc(int i) {
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
