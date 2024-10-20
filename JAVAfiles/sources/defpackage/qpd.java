package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum qpd implements apak {
    NONE(0),
    RCS_GROUP_SELF_ONLY(1),
    RCS_GROUP_CREATED_TOO_LARGE(2),
    RCS_GROUP_NOT_FOUND(3),
    UNRECOGNIZED(-1);

    private final int g;

    qpd(int i) {
        this.g = i;
    }

    public static qpd b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return RCS_GROUP_NOT_FOUND;
                }
                return RCS_GROUP_CREATED_TOO_LARGE;
            }
            return RCS_GROUP_SELF_ONLY;
        }
        return NONE;
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
