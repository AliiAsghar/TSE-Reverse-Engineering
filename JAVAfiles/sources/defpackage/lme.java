package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lme implements lkg {
    public final Uri a;
    public final String b;
    public final String c;
    public final boolean d;
    public final int e;

    public lme(Uri uri, String str, int i, String str2, boolean z) {
        str.getClass();
        this.a = uri;
        this.b = str;
        this.e = i;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lme)) {
            return false;
        }
        lme lmeVar = (lme) obj;
        if (d.F(this.a, lmeVar.a) && d.F(this.b, lmeVar.b) && this.e == lmeVar.e && d.F(this.c, lmeVar.c) && this.d == lmeVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.e;
        a.bm(i);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (((((hashCode2 * 31) + i) * 31) + hashCode) * 31) + a.v(this.d);
    }

    public final String toString() {
        CharSequence charSequence;
        String str;
        String str2 = this.c;
        String bf = yyb.bf(this.a);
        if (str2 != null) {
            charSequence = yyb.be(str2);
        } else {
            charSequence = null;
        }
        int i = this.e;
        String str3 = this.b;
        boolean z = this.d;
        StringBuilder sb = new StringBuilder("DirectSendViewer(uri=");
        sb.append(bf);
        sb.append(", contentType=");
        sb.append(str3);
        sb.append(", primaryButtonType=");
        if (i != 1) {
            str = "ADD";
        } else {
            str = "SEND";
        }
        sb.append((Object) str);
        sb.append(", textCaption=");
        sb.append((Object) charSequence);
        sb.append(", useEncryptedIcon=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
