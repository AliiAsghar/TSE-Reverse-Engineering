package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gay extends gaz {
    public static final gay a = new gay(true);
    public static final gay b = new gay(false);

    public gay(boolean z) {
        super(z);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gay) && this.c == ((gay) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.c);
    }

    public final String toString() {
        return "NotLoading(endOfPaginationReached=" + this.c + ')';
    }
}
