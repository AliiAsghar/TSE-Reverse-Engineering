package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yuk {
    public final String a;
    public final String b;
    public final String c;

    public yuk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yuk) {
            yuk yukVar = (yuk) obj;
            if (this.a.equals(yukVar.a) && this.b.equals(yukVar.b) && this.c.equals(yukVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PhoneNumber{msisdn=" + this.a + ", imsi=" + this.b + ", c11nToken=" + this.c + "}";
    }

    public yuk(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null msisdn");
        }
        this.a = str;
        this.b = str2;
        if (str3 != null) {
            this.c = str3;
            return;
        }
        throw new NullPointerException("Null c11nToken");
    }
}
