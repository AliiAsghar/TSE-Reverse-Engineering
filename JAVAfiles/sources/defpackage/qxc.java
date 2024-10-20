package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qxc {
    public final int a;
    public final String b;
    public final msh c;
    public final String d;
    public final String e;

    public qxc(int i, String str, msh mshVar, String str2, String str3) {
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = mshVar;
        this.d = str2;
        this.e = str3;
    }

    public final String a() {
        msh mshVar = this.c;
        if (mshVar == null) {
            return null;
        }
        String n = mshVar.n();
        if (n.length() == 0) {
            return null;
        }
        return n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxc)) {
            return false;
        }
        qxc qxcVar = (qxc) obj;
        if (this.a == qxcVar.a && d.F(this.b, qxcVar.b) && d.F(this.c, qxcVar.c) && d.F(this.d, qxcVar.d) && d.F(this.e, qxcVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a * 31) + this.b.hashCode();
        msh mshVar = this.c;
        if (mshVar == null) {
            hashCode = 0;
        } else {
            hashCode = mshVar.hashCode();
        }
        return (((((hashCode2 * 31) + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TelephonySubscription(subId=" + this.a + ", simSerialNumber=" + this.b + ", telephonyPhoneNumber=" + this.c + ", displayName=" + this.d + ", provisioningId=" + this.e + ")";
    }

    public /* synthetic */ qxc(int i, String str, msh mshVar, String str2, int i2) {
        this(i, str, mshVar, (i2 & 8) != 0 ? "" : str2, "");
    }
}
