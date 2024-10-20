package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxt {
    public final String a;
    public final Long b;

    public gxt(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxt)) {
            return false;
        }
        gxt gxtVar = (gxt) obj;
        if (d.F(this.a, gxtVar.a) && d.F(this.b, gxtVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
