package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gax extends gaz {
    public static final gax a = new gax();

    private gax() {
        super(false);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof gax) && this.c == ((gax) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.v(this.c);
    }

    public final String toString() {
        return "Loading(endOfPaginationReached=" + this.c + ')';
    }
}
