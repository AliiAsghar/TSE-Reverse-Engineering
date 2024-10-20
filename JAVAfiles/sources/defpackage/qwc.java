package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qwc {
    public final qwe a;
    public final boolean b;

    public qwc(qwe qweVar, boolean z) {
        qweVar.getClass();
        this.a = qweVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwc)) {
            return false;
        }
        qwc qwcVar = (qwc) obj;
        if (d.F(this.a, qwcVar.a) && this.b == qwcVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + a.v(this.b);
    }

    public final String toString() {
        return "MyIdentityUpdateResult(token=" + this.a + ", hasChanges=" + this.b + ")";
    }
}
