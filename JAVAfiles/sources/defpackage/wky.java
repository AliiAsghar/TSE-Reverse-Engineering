package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wky implements apak {
    REACTION_TYPE_UNSPECIFIED(0),
    LIKE(1),
    LOVE(2),
    LAUGH(3),
    SURPRISED(4),
    SAD(5),
    ANGRY(6),
    DISLIKE(7),
    CUSTOM(8),
    QUESTIONING(9),
    CRYING_FACE(10),
    POUTING_FACE(11),
    RED_HEART(12),
    EMOTIFY(13),
    UNRECOGNIZED(-1);

    private final int q;

    wky(int i) {
        this.q = i;
    }

    public static wky b(int i) {
        switch (i) {
            case 0:
                return REACTION_TYPE_UNSPECIFIED;
            case 1:
                return LIKE;
            case 2:
                return LOVE;
            case 3:
                return LAUGH;
            case 4:
                return SURPRISED;
            case 5:
                return SAD;
            case 6:
                return ANGRY;
            case 7:
                return DISLIKE;
            case 8:
                return CUSTOM;
            case 9:
                return QUESTIONING;
            case 10:
                return CRYING_FACE;
            case 11:
                return POUTING_FACE;
            case 12:
                return RED_HEART;
            case 13:
                return EMOTIFY;
            default:
                return null;
        }
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.q;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
