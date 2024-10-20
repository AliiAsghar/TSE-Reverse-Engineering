package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsw extends gvf {
    public final gsi a;

    public gsw(gsi gsiVar) {
        this.a = gsiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((gsw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3182677 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public gsw() {
        this(gsi.a);
    }
}
