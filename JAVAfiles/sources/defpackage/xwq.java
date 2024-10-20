package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwq {
    public final Resources a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final int m;
    public final int n;

    public xwq() {
        throw null;
    }

    public static xwp a() {
        xwp xwpVar = new xwp();
        xwpVar.f(0);
        return xwpVar;
    }

    public final boolean equals(Object obj) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof xwq) {
            xwq xwqVar = (xwq) obj;
            if (this.a.equals(xwqVar.a) && this.b == xwqVar.b && this.c == xwqVar.c && this.d == xwqVar.d && ((str = this.e) != null ? str.equals(xwqVar.e) : xwqVar.e == null) && ((i = this.n) != 0 ? i == xwqVar.n : xwqVar.n == 0) && this.f == xwqVar.f && ((str2 = this.g) != null ? str2.equals(xwqVar.g) : xwqVar.g == null) && ((str3 = this.h) != null ? str3.equals(xwqVar.h) : xwqVar.h == null) && ((str4 = this.i) != null ? str4.equals(xwqVar.i) : xwqVar.i == null) && ((str5 = this.j) != null ? str5.equals(xwqVar.j) : xwqVar.j == null) && ((str6 = this.k) != null ? str6.equals(xwqVar.k) : xwqVar.k == null) && ((str7 = this.l) != null ? str7.equals(xwqVar.l) : xwqVar.l == null) && this.m == xwqVar.m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7 = this.a.hashCode() ^ 1000003;
        String str = this.e;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        boolean z = this.d;
        boolean z2 = this.c;
        int i3 = hashCode7 * 1000003;
        int i4 = this.b;
        int i5 = 1237;
        if (true != z) {
            i = 1237;
        } else {
            i = 1231;
        }
        if (true == z2) {
            i5 = 1231;
        }
        int i6 = (((((((i3 ^ i4) * 1000003) ^ i5) * 1000003) ^ i) * 1000003) ^ hashCode) * 1000003;
        int i7 = this.n;
        if (i7 == 0) {
            i7 = 0;
        } else {
            a.aS(i7);
        }
        int i8 = (((i6 ^ i7) * 1000003) ^ this.f) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i9 = (i8 ^ hashCode2) * 1000003;
        String str3 = this.h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i9 ^ hashCode3) * 1000003;
        String str4 = this.i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i11 = (i10 ^ hashCode4) * 1000003;
        String str5 = this.j;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        String str6 = this.k;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i13 = (i12 ^ hashCode6) * 1000003;
        String str7 = this.l;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return ((i13 ^ i2) * 1000003) ^ this.m;
    }

    public final String toString() {
        String str;
        int i = this.n;
        String valueOf = String.valueOf(this.a);
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "UNSPECIFIED_SENDER";
            }
        } else {
            str = "SELF";
        }
        String str2 = this.e;
        boolean z = this.d;
        boolean z2 = this.c;
        return "ContentDescriptionArgs{resources=" + valueOf + ", statusCode=" + this.b + ", isOutgoing=" + z2 + ", useSentToFormat=" + z + ", contact=" + str2 + ", specialContactType=" + str + ", attachmentCount=" + this.f + ", attachmentContentType=" + this.g + ", subject=" + this.h + ", text=" + this.i + ", timestamp=" + this.j + ", conversationName=" + this.k + ", caption=" + this.l + ", unreadMessageCount=" + this.m + "}";
    }

    public xwq(Resources resources, int i, boolean z, boolean z2, String str, int i2, int i3, String str2, String str3, String str4, String str5, String str6, String str7, int i4) {
        this.a = resources;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = str;
        this.n = i2;
        this.f = i3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = i4;
    }
}
