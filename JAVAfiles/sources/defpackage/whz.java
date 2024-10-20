package defpackage;

import android.text.SpannableString;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class whz {
    public final int a;
    public final int b;
    public final String c;
    public final SpannableString d;
    public final SpannableString e;

    public whz(int i, int i2, String str, SpannableString spannableString, SpannableString spannableString2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = spannableString;
        this.e = spannableString2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whz)) {
            return false;
        }
        whz whzVar = (whz) obj;
        if (this.a == whzVar.a && this.b == whzVar.b && d.F(this.c, whzVar.c) && d.F(this.d, whzVar.d) && d.F(this.e, whzVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TermsAndConditionsData(activeSubscriptionCount=" + this.a + ", simSlot=" + this.b + ", carrierName=" + this.c + ", title=" + ((Object) this.d) + ", message=" + ((Object) this.e) + ")";
    }
}
