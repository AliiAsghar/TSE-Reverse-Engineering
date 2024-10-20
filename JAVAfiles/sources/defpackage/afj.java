package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afj {
    public final long a;
    public final amj b;

    public afj(long j, amj amjVar) {
        this.a = j;
        this.b = amjVar;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!d.F(cls2, cls)) {
            return false;
        }
        obj.getClass();
        afj afjVar = (afj) obj;
        if (a.bB(this.a, afjVar.a) && d.F(this.b, afjVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = cku.a;
        return (a.A(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) cku.g(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
