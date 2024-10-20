package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykl {
    public final int a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final int o;

    public ykl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ykl) {
            ykl yklVar = (ykl) obj;
            if (this.a == yklVar.a && this.b == yklVar.b && ((str = this.c) != null ? str.equals(yklVar.c) : yklVar.c == null) && this.d == yklVar.d && this.e.equals(yklVar.e) && this.f.equals(yklVar.f) && this.g.equals(yklVar.g) && this.h.equals(yklVar.h) && this.i.equals(yklVar.i) && this.j == yklVar.j && this.k == yklVar.k && this.l.equals(yklVar.l) && this.m.equals(yklVar.m) && this.n.equals(yklVar.n) && this.o == yklVar.o) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = this.a;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((((((((((((((((((((((hashCode ^ ((((i2 ^ 1000003) * 1000003) ^ i) * 1000003)) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 583896283) ^ this.i.hashCode()) * (-721379959)) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o;
    }

    public final String toString() {
        return "SubData{subId=" + this.a + ", isAvailable=" + this.b + ", iccId=" + this.c + ", simSlotIndex=" + this.d + ", displayName=" + this.e + ", preferredName=" + this.f + ", carrierName=" + this.g + ", simCarrierName=" + this.h + ", simCarrierId=0, iconTint=0, phoneNumber=" + this.i + ", roaming=0, mcc=" + this.j + ", mnc=" + this.k + ", simCountryIso=" + this.l + ", networkCountryIso=" + this.m + ", subscriptionId=" + this.n + ", simState=" + this.o + "}";
    }

    public ykl(int i, boolean z, String str, int i2, String str2, String str3, String str4, String str5, String str6, int i3, int i4, String str7, String str8, String str9, int i5) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = i2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = i3;
        this.k = i4;
        this.l = str7;
        this.m = str8;
        this.n = str9;
        this.o = i5;
    }
}
