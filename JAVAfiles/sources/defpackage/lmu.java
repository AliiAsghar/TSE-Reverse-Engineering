package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmu implements lkf {
    public final Spannable a;
    public final ClickableSpan b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    public lmu(Spannable spannable, ClickableSpan clickableSpan, int i, int i2, float f, float f2) {
        clickableSpan.getClass();
        this.a = spannable;
        this.b = clickableSpan;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmu)) {
            return false;
        }
        lmu lmuVar = (lmu) obj;
        if (d.F(this.a, lmuVar.a) && d.F(this.b, lmuVar.b) && this.c == lmuVar.c && this.d == lmuVar.d && Float.compare(this.e, lmuVar.e) == 0 && Float.compare(this.f, lmuVar.f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "LinkifySpanViewer{" + yyb.bh(this.b.toString()) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + "}";
    }
}
