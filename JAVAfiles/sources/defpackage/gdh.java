package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gdh extends dyi {
    public final Throwable a;

    public gdh(Throwable th) {
        super(null);
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gdh) && d.F(this.a, ((gdh) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return arsd.s("LoadResult.Error(\n                    |   throwable: " + this.a + "\n                    |) ");
    }
}
