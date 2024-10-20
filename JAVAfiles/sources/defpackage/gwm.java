package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public gwm(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwm)) {
            return false;
        }
        gwm gwmVar = (gwm) obj;
        if (this.a == gwmVar.a && this.b == gwmVar.b && this.c == gwmVar.c && this.d == gwmVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int v = a.v(this.a);
        boolean z = this.d;
        return (((((v * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
