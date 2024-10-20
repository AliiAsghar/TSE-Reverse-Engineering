package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxv {
    private final Object a;
    private final Object b;

    public bxv(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    private static final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxv)) {
            return false;
        }
        bxv bxvVar = (bxv) obj;
        if (d.F(this.a, bxvVar.a) && d.F(this.b, bxvVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a(this.a) * 31) + a(this.b);
    }

    public final String toString() {
        return "JoinedKey(left=" + this.a + ", right=" + this.b + ')';
    }
}
