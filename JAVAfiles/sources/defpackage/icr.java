package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class icr {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final icq d;
    private final int e;

    public /* synthetic */ icr(boolean z, int i, boolean z2, boolean z3, icq icqVar, int i2) {
        int i3;
        boolean z4;
        this.a = z;
        if ((i2 & 2) != 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        this.e = i3 & i;
        if ((i2 & 4) != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.b = (!z4) | z2;
        this.c = ((i2 & 8) == 0) & z3;
        this.d = icqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icr)) {
            return false;
        }
        icr icrVar = (icr) obj;
        if (this.a == icrVar.a && this.e == icrVar.e && this.b == icrVar.b && this.c == icrVar.c && d.F(this.d, icrVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.e == 0) {
            i = 0;
        } else {
            i = 1;
            a.bm(1);
        }
        return (((((((a.v(this.a) * 31) + i) * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("GetCustomD2DItemResult(isSuccess=");
        sb.append(this.a);
        sb.append(", failureReason=");
        if (this.e != 0) {
            str = akec.P(1);
        } else {
            str = "null";
        }
        sb.append((Object) str);
        sb.append(", shouldLog=");
        sb.append(this.b);
        sb.append(", pfdSent=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
