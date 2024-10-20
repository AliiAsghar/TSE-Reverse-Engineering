package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbv {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public /* synthetic */ nbv(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.a = 1 == (i2 & 1) ? null : str;
        this.h = i;
        if ((i2 & 4) != 0) {
            z7 = false;
        } else {
            z7 = true;
        }
        this.b = z7 & z;
        if ((i2 & 8) != 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.c = z8 & z2;
        if ((i2 & 16) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.d = z9 & z3;
        if ((i2 & 32) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.e = z10 & z4;
        if ((i2 & 64) != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f = z11 & z5;
        this.g = ((i2 & 128) == 0) & z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbv)) {
            return false;
        }
        nbv nbvVar = (nbv) obj;
        if (d.F(this.a, nbvVar.a) && this.h == nbvVar.h && this.b == nbvVar.b && this.c == nbvVar.c && this.d == nbvVar.d && this.e == nbvVar.e && this.f == nbvVar.f && this.g == nbvVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i = this.h;
        a.aS(i);
        return (((((((((((((hashCode * 31) + i) * 31) + a.v(this.b)) * 31) + a.v(this.c)) * 31) + a.v(this.d)) * 31) + a.v(this.e)) * 31) + a.v(this.f)) * 31) + a.v(this.g);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BugleOutgoingDisplayableStatus(text=");
        sb.append(this.a);
        sb.append(", type=");
        if (this.h != 1) {
            str = "ERROR";
        } else {
            str = "INFORMATIONAL";
        }
        boolean z = this.g;
        boolean z2 = this.f;
        boolean z3 = this.e;
        boolean z4 = this.d;
        boolean z5 = this.c;
        boolean z6 = this.b;
        sb.append((Object) str);
        sb.append(", canResend=");
        sb.append(z6);
        sb.append(", canFallback=");
        sb.append(z5);
        sb.append(", canDelete=");
        sb.append(z4);
        sb.append(", sentAsFallback=");
        sb.append(z3);
        sb.append(", canResendImmediately=");
        sb.append(z2);
        sb.append(", canShowPremiumOptions=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
