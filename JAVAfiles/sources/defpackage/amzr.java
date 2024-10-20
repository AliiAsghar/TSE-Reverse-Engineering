package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amzr implements apak {
    UNKNOWN_DESTINATION_TYPE(0),
    LONG_CODE(1),
    SHORT_CODE(2),
    ALPHA_CODE(3),
    EMAIL(4),
    BOT(5),
    UNRECOGNIZED(-1);

    private final int i;

    amzr(int i) {
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
