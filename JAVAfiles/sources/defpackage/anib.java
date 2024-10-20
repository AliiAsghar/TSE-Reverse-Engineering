package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum anib implements apak {
    TONE_UNSPECIFIED(0),
    TONE_FORMAL(4),
    TONE_CONCISE(6),
    TONE_SHAKESPEARE(8),
    TONE_CHILL(9),
    TONE_REPHRASE(10),
    TONE_RHYMES(11),
    TONE_EXCITED(12),
    UNRECOGNIZED(-1);

    private final int k;

    anib(int i) {
        this.k = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
