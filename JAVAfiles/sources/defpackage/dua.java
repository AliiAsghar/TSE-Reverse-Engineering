package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dua {
    public final Object a;
    public final int b;
    private final dui c;

    public dua(Object obj, int i, dui duiVar) {
        this.a = obj;
        this.b = i;
        this.c = duiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dua)) {
            return false;
        }
        dua duaVar = (dua) obj;
        if (d.F(this.a, duaVar.a) && this.b == duaVar.b && d.F(this.c, duaVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HorizontalAnchor(id=" + this.a + ", index=" + this.b + ", reference=" + this.c + ')';
    }
}
