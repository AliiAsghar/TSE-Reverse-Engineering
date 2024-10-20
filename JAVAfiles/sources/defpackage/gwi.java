package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwi extends gvf {
    public final int a;

    public gwi(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gwi) && this.a == ((gwi) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
