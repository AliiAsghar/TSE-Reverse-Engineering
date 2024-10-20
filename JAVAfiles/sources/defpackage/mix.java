package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum mix {
    SENDING,
    SENT,
    DELIVERED,
    SEEN,
    ERROR,
    RETRYING;

    public final boolean a(mix mixVar) {
        if (this == mixVar) {
            return false;
        }
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 4 && ordinal != 5) {
                        return false;
                    }
                } else {
                    if (mixVar != ERROR && mixVar != SEEN) {
                        return false;
                    }
                    return true;
                }
            } else if (mixVar != ERROR && mixVar != DELIVERED && mixVar != RETRYING && mixVar != SEEN) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        if (this == SEEN) {
            return true;
        }
        return false;
    }
}
