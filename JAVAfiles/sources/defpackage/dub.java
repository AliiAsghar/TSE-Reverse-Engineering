package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dub {
    public final Object a;
    public final int b;
    private final dui c;

    public dub(Object obj, int i, dui duiVar) {
        this.a = obj;
        this.b = i;
        this.c = duiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dub)) {
            return false;
        }
        dub dubVar = (dub) obj;
        if (d.F(this.a, dubVar.a) && this.b == dubVar.b && d.F(this.c, dubVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "VerticalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
