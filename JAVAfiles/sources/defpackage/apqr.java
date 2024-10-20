package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum apqr implements apak {
    PROMPT_STYLE_UNKNOWN(0),
    PROMPT_STYLE_FIRST_CARD_NON_MODAL(1),
    PROMPT_STYLE_FIRST_CARD_MODAL(2),
    UNRECOGNIZED(-1);

    private final int f;

    apqr(int i) {
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
