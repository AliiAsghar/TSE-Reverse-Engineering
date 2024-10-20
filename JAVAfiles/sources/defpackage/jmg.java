package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmg {
    public final jgx a;

    public jmg(jgx jgxVar) {
        this.a = jgxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jmg) && d.F(this.a, ((jmg) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Add(attachment=" + this.a + ")";
    }
}
