package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wfx implements apak {
    UI_VARIANT_UNKNOWN(0),
    PROMO_BOTTOMSHEET(1),
    INPUT_BOTTOMSHEET(2),
    INPUT_FULLSCREEN(3),
    PROMO_BANNER(4),
    UNRECOGNIZED(-1);

    private final int h;

    wfx(int i) {
        this.h = i;
    }

    public static wfx b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return PROMO_BANNER;
                    }
                    return INPUT_FULLSCREEN;
                }
                return INPUT_BOTTOMSHEET;
            }
            return PROMO_BOTTOMSHEET;
        }
        return UI_VARIANT_UNKNOWN;
    }

    @Override // defpackage.apak
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
