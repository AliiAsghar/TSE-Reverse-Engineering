package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsu extends gvf {
    public final gsi a = gsi.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((gsu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 3182615 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
