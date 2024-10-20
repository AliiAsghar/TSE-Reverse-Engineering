package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahr {
    public final SpannableStringBuilder a;
    public final String b;
    public final Integer c;
    public final boolean d;

    public aahr(SpannableStringBuilder spannableStringBuilder, String str, Integer num, boolean z) {
        this.a = spannableStringBuilder;
        this.b = str;
        this.c = num;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aahr)) {
            return false;
        }
        aahr aahrVar = (aahr) obj;
        if (d.F(this.a, aahrVar.a) && d.F(this.b, aahrVar.b) && d.F(this.c, aahrVar.c) && this.d == aahrVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return (((hashCode2 * 31) + hashCode) * 31) + a.v(this.d);
    }

    public final String toString() {
        return "ToolstoneUiData(text=" + ((Object) this.a) + ", linkText=" + this.b + ", iconRes=" + this.c + ", hasCloseButton=" + this.d + ")";
    }
}
