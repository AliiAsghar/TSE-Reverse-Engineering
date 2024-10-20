package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum enf {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public static final ene Companion = new ene();

    public final eng a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return eng.DESTROYED;
                            }
                            toString();
                            throw new IllegalArgumentException(toString().concat(" has no target state"));
                        }
                    }
                } else {
                    return eng.RESUMED;
                }
            }
            return eng.STARTED;
        }
        return eng.CREATED;
    }
}
