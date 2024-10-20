package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chd {
    public static final cmb a = clw.a;
    public final cmb b;

    public final boolean equals(Object obj) {
        if ((obj instanceof chd) && d.F(this.b, ((chd) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "BlurredEdgeTreatment(shape=" + this.b + ')';
    }
}
