package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apqo implements apak {
    COMPLETION_STYLE_UNKNOWN(0),
    COMPLETION_STYLE_CARD(1),
    COMPLETION_STYLE_TOAST(2),
    UNRECOGNIZED(-1);

    private final int f;

    apqo(int i) {
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
