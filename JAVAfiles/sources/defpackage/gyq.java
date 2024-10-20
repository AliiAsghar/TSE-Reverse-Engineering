package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyq {
    public final String a;
    public final gtk b;

    public gyq(String str, gtk gtkVar) {
        str.getClass();
        gtkVar.getClass();
        this.a = str;
        this.b = gtkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyq)) {
            return false;
        }
        gyq gyqVar = (gyq) obj;
        if (d.F(this.a, gyqVar.a) && this.b == gyqVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + this.b + ')';
    }
}
