package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqo {
    public static final gqo a = new gqo(0);
    public static final gqo b = new gqo(1);
    public static final gqo c = new gqo(2);
    private final int d;

    private gqo(int i) {
        this.d = i;
    }

    public final String toString() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                return "SplitSupportStatus: ERROR_SPLIT_PROPERTY_NOT_DECLARED";
            }
            return "SplitSupportStatus: UNAVAILABLE";
        }
        return "SplitSupportStatus: AVAILABLE";
    }
}
