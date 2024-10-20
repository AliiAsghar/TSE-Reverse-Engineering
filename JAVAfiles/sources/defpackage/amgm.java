package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum amgm implements apak {
    UNKNOWN_EMOJI_STATUS(0),
    EMOJI_STATUS_NO_EMOJI(1),
    EMOJI_STATUS_SOME_EMOJI(2),
    EMOJI_STATUS_ALL_EMOJI(3),
    EMOJI_STATUS_NA(4),
    EMOJI_STATUS_SINGLE_EMOJI_ONLY(5);

    public final int g;

    amgm(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
