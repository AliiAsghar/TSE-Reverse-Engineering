package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpa {
    public final jhc a;
    public final boolean b;

    public jpa(jhc jhcVar, boolean z) {
        this.a = jhcVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpa)) {
            return false;
        }
        jpa jpaVar = (jpa) obj;
        if (d.F(this.a, jpaVar.a) && this.b == jpaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        jhc jhcVar = this.a;
        if (jhcVar == null) {
            hashCode = 0;
        } else {
            hashCode = jhcVar.hashCode();
        }
        return (hashCode * 31) + a.v(this.b);
    }

    public final String toString() {
        return "Result(draft=" + this.a + ", persist=" + this.b + ")";
    }
}
