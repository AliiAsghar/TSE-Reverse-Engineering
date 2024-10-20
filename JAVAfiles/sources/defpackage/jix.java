package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jix {
    public final boolean a;
    public final jji b;

    public jix(boolean z, jji jjiVar) {
        this.a = z;
        this.b = jjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jix)) {
            return false;
        }
        jix jixVar = (jix) obj;
        if (this.a == jixVar.a && d.F(this.b, jixVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        jji jjiVar = this.b;
        if (jjiVar == null) {
            hashCode = 0;
        } else {
            hashCode = jjiVar.hashCode();
        }
        return (a.v(this.a) * 31) + hashCode;
    }

    public final String toString() {
        return "SimpleMessagePropertiesTextData(lengthRequiresMms=" + this.a + ", textCounterData=" + this.b + ")";
    }
}
