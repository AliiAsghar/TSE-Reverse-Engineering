package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum ymx implements apak {
    CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED(0),
    HIDE(1),
    SHOW(2),
    UNRECOGNIZED(-1);

    private final int f;

    ymx(int i) {
        this.f = i;
    }

    public static ymx b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return SHOW;
            }
            return HIDE;
        }
        return CONVERSATION_TOOLSTONE_STATE_UNSPECIFIED;
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
