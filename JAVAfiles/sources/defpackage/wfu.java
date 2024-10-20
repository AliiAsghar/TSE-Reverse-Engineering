package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wfu {
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public wfu(int i, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfu)) {
            return false;
        }
        wfu wfuVar = (wfu) obj;
        if (this.a == wfuVar.a && d.F(this.b, wfuVar.b) && this.c == wfuVar.c && this.d == wfuVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b.hashCode()) * 31) + a.v(this.c)) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "PhoneNumberInputData(simSlot=" + this.a + ", carrierName=" + this.b + ", isDefaultCall=" + this.c + ", isDefaultSms=" + this.d + ")";
    }
}
