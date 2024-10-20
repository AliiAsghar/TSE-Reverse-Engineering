package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqt {
    public final boolean a;
    public final boolean b;

    public jqt(jhc jhcVar) {
        jhcVar.getClass();
        boolean a = jhcVar.a();
        boolean z = jhcVar.h;
        this.a = a;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqt)) {
            return false;
        }
        jqt jqtVar = (jqt) obj;
        if (this.a == jqtVar.a && this.b == jqtVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (a.v(this.a) * 31) + a.v(this.b);
    }

    public final String toString() {
        return "DraftInfo(isModified=" + this.a + ", isEncrypted=" + this.b + ")";
    }
}
