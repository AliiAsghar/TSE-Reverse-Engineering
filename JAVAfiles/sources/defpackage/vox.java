package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vox implements apak {
    PROFILE_UNSPECIFIED_SOURCE(0),
    PROFILE_CONTACT_SOURCE(1),
    PROFILE_PEOPLE_SHARING_SOURCE(2),
    UNRECOGNIZED(-1);

    private final int f;

    vox(int i) {
        this.f = i;
    }

    public static vox b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PROFILE_PEOPLE_SHARING_SOURCE;
            }
            return PROFILE_CONTACT_SOURCE;
        }
        return PROFILE_UNSPECIFIED_SOURCE;
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
