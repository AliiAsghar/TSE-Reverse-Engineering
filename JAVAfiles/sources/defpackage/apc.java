package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apc {
    public final long a = 1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof apc)) {
            return false;
        }
        long j = ((apc) obj).a;
        return true;
    }

    public final int hashCode() {
        return a.A(1L);
    }

    public final String toString() {
        return "GridItemSpan(packedValue=1)";
    }
}
