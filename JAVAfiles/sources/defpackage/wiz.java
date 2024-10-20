package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum wiz implements apak {
    TOGGLE_STATE_UNSPECIFIED(0),
    TOGGLE_STATE_ENABLED(1),
    TOGGLE_STATE_USER_DISABLED(2),
    TOGGLE_STATE_AUTOMATICALLY_DISABLED(3);

    public final int e;

    wiz(int i) {
        this.e = i;
    }

    public static wiz b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return TOGGLE_STATE_AUTOMATICALLY_DISABLED;
                }
                return TOGGLE_STATE_USER_DISABLED;
            }
            return TOGGLE_STATE_ENABLED;
        }
        return TOGGLE_STATE_UNSPECIFIED;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
