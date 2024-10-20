package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arzn {
    public static final arzm a = new arzm();
    public final Object b;

    public static final Object a(Object obj) {
        if (!(obj instanceof arzm)) {
            return obj;
        }
        return null;
    }

    public static final Throwable b(Object obj) {
        arzl arzlVar;
        if (obj instanceof arzl) {
            arzlVar = (arzl) obj;
        } else {
            arzlVar = null;
        }
        if (arzlVar == null) {
            return null;
        }
        return arzlVar.a;
    }

    public static final boolean c(Object obj) {
        if (!(obj instanceof arzm)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof arzn) && d.F(this.b, ((arzn) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof arzl) {
            return ((arzl) obj).toString();
        }
        return a.cc(obj, "Value(", ")");
    }
}
