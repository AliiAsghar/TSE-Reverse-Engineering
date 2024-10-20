package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum aqaz implements apak {
    UNKNOWN_CLASSIFICATION_TYPE(0),
    NUDGE_CLASSIFICATION(1),
    REACTION_CLASSIFICATION(2),
    SAVE_BIRTHDAY_CLASSIFICATION(3),
    UNRECOGNIZED(-1);

    private final int g;

    aqaz(int i) {
        this.g = i;
    }

    public static aqaz b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return SAVE_BIRTHDAY_CLASSIFICATION;
                }
                return REACTION_CLASSIFICATION;
            }
            return NUDGE_CLASSIFICATION;
        }
        return UNKNOWN_CLASSIFICATION_TYPE;
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
