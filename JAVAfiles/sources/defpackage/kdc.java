package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdc implements kaa {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final arqg d;
    public final arqg e;
    public final mxz f;

    public kdc(mxz mxzVar, boolean z, String str, boolean z2, arqg arqgVar, arqg arqgVar2) {
        this.f = mxzVar;
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = arqgVar;
        this.e = arqgVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdc)) {
            return false;
        }
        kdc kdcVar = (kdc) obj;
        if (d.F(this.f, kdcVar.f) && this.a == kdcVar.a && d.F(this.b, kdcVar.b) && this.c == kdcVar.c && d.F(this.d, kdcVar.d) && d.F(this.e, kdcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + a.v(this.a)) * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "PendingBubbleArgs(content=" + this.f + ", isHighlighted=" + this.a + ", contentDescription=" + this.b + ", isOutgoing=" + this.c + ", onCancelTransfer=" + this.d + ", onResumeTransfer=" + this.e + ")";
    }
}
