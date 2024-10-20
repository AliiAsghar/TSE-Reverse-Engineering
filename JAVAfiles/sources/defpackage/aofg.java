package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aofg {
    private final Class a;
    private final Class b;

    public aofg(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aofg aofgVar = (aofg) obj;
        if (!this.b.equals(aofgVar.b)) {
            return false;
        }
        return this.a.equals(aofgVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        if (cls == aoff.class) {
            return this.b.getName();
        }
        Class cls2 = this.b;
        return "@" + cls.getName() + " " + cls2.getName();
    }
}
