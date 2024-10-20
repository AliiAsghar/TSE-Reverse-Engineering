package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqbd implements apak {
    SUGGESTION_TAG_UNSPECIFIED(0),
    SUGGESTION_TAG_BIRTHDAY(1),
    UNRECOGNIZED(-1);

    private final int e;

    aqbd(int i) {
        this.e = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
