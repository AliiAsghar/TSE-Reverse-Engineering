package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wkv implements apak {
    REACTION_ACTION_UNSPECIFIED(0),
    ADD_REACTION(1),
    REMOVE_REACTION(2),
    REPLACE_REACTION(3),
    UNRECOGNIZED(-1);

    private final int g;

    wkv(int i) {
        this.g = i;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
