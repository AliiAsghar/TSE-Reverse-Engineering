package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wfp implements apak {
    UI_TYPE_UNKNOWN(0),
    BOTTOMSHEET(1),
    BANNER(2),
    OOBE(3),
    SETTINGS_DIALOG(4),
    UNRECOGNIZED(-1);

    private final int h;

    wfp(int i) {
        this.h = i;
    }

    public static wfp b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SETTINGS_DIALOG;
                    }
                    return OOBE;
                }
                return BANNER;
            }
            return BOTTOMSHEET;
        }
        return UI_TYPE_UNKNOWN;
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
