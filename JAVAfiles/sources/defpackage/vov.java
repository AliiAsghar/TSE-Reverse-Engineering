package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum vov implements apak {
    PREFER_UNKNOWN(0),
    PREFER_PROFILE_PHOTO(1),
    PREFER_CONTACT_PHOTO(2),
    UNRECOGNIZED(-1);

    private final int f;

    vov(int i) {
        this.f = i;
    }

    public static vov b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return PREFER_CONTACT_PHOTO;
            }
            return PREFER_PROFILE_PHOTO;
        }
        return PREFER_UNKNOWN;
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
