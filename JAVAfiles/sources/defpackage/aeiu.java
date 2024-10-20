package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeiu {
    public final boolean a = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aeiu)) {
            return false;
        }
        boolean z = ((aeiu) obj).a;
        return true;
    }

    public final int hashCode() {
        return a.v(false);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=false)";
    }
}
