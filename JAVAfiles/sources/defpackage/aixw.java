package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixw {
    public final String a;
    public final Class b;

    public aixw(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aixw) {
            aixw aixwVar = (aixw) obj;
            if (this.b == aixwVar.b && this.a.equals(aixwVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
