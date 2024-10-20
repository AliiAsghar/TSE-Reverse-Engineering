package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mby implements apak {
    UNKNOWN_SAMPLING_MODE(0),
    ALWAYS_LOGGING(3),
    PER_EVENT_THROTTLING(1),
    ONCE_PER_APP_START(2),
    NO_LOGGING(4);

    private final int g;

    mby(int i) {
        this.g = i;
    }

    public static mby b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NO_LOGGING;
                    }
                    return ALWAYS_LOGGING;
                }
                return ONCE_PER_APP_START;
            }
            return PER_EVENT_THROTTLING;
        }
        return UNKNOWN_SAMPLING_MODE;
    }

    @Override // defpackage.apak
    public final int a() {
        return this.g;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
