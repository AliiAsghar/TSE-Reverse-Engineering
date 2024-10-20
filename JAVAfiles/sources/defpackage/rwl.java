package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rwl {
    public final tqs a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public rwl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rwl) {
            rwl rwlVar = (rwl) obj;
            if (this.a.equals(rwlVar.a) && ((str = this.b) != null ? str.equals(rwlVar.b) : rwlVar.b == null) && ((str2 = this.c) != null ? str2.equals(rwlVar.c) : rwlVar.c == null) && ((str3 = this.d) != null ? str3.equals(rwlVar.d) : rwlVar.d == null) && ((str4 = this.e) != null ? str4.equals(rwlVar.e) : rwlVar.e == null) && ((str5 = this.f) != null ? str5.equals(rwlVar.f) : rwlVar.f == null)) {
                String str6 = this.g;
                String str7 = rwlVar.g;
                if (str6 != null ? str6.equals(str7) : str7 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = ((hashCode6 * 1000003) ^ hashCode) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str6 = this.g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i6 ^ i;
    }

    public final String toString() {
        return "MessageSendReceiveAttemptRowInfo{transportProtocol=" + this.a.toString() + ", currentSimNetworkCountry=" + this.b + ", currentSimCountry=" + this.c + ", settingsCountry=" + this.d + ", defaultSmsSimCountry=" + this.e + ", localeCountry=" + this.f + ", defaultSmsSimNetworkCountry=" + this.g + "}";
    }

    public rwl(tqs tqsVar, String str, String str2, String str3, String str4, String str5, String str6) {
        if (tqsVar == null) {
            throw new NullPointerException("Null transportProtocol");
        }
        this.a = tqsVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }
}
