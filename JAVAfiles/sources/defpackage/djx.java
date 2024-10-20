package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djx {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final Rect j = new Rect();
    private final djq k;
    private dkg l;
    private final int m;
    private final boolean n;
    private final Paint.FontMetricsInt o;
    private final int p;
    private final dkp[] q;
    private djo r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public djx(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, defpackage.djq r36) {
        /*
            Method dump skipped, instructions count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djx.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, djq):void");
    }

    public static /* synthetic */ float s(djx djxVar, int i) {
        return djxVar.e(i, false);
    }

    public final float a(int i) {
        if (i == this.f - 1) {
            return this.h + this.i;
        }
        return brg.a;
    }

    public final float b(int i) {
        float lineBaseline;
        if (i == this.f - 1 && this.o != null) {
            lineBaseline = d(i) - this.o.ascent;
        } else {
            lineBaseline = this.e.getLineBaseline(i);
        }
        return this.g + lineBaseline;
    }

    public final float c(int i) {
        int i2;
        if (i == this.f - 1 && this.o != null) {
            return this.e.getLineBottom(i - 1) + this.o.bottom;
        }
        int i3 = this.g;
        float lineBottom = this.e.getLineBottom(i);
        if (i == this.f - 1) {
            i2 = this.m;
        } else {
            i2 = 0;
        }
        return i3 + lineBottom + i2;
    }

    public final float d(int i) {
        int i2;
        float lineTop = this.e.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.g;
        }
        return lineTop + i2;
    }

    public final float e(int i, boolean z) {
        return o().a(i, true, z) + a(k(i));
    }

    public final float f(int i, boolean z) {
        return o().a(i, false, z) + a(k(i));
    }

    public final int g() {
        int height;
        if (this.d) {
            height = this.e.getLineBottom(this.f - 1);
        } else {
            height = this.e.getHeight();
        }
        return height + this.g + this.m + this.p;
    }

    public final int h(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int i(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int j(int i) {
        if (djz.c(this.e, i) && this.b == TextUtils.TruncateAt.END) {
            return this.e.getText().length();
        }
        return this.e.getLineEnd(i);
    }

    public final int k(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int l(int i) {
        return this.e.getLineForVertical(i - this.g);
    }

    public final int m(int i) {
        return this.e.getLineStart(i);
    }

    public final int n(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final djo o() {
        djo djoVar = this.r;
        if (djoVar == null) {
            djo djoVar2 = new djo(this.e);
            this.r = djoVar2;
            return djoVar2;
        }
        return djoVar;
    }

    public final dkg p() {
        dkg dkgVar = this.l;
        if (dkgVar != null) {
            return dkgVar;
        }
        Layout layout = this.e;
        dkg dkgVar2 = new dkg(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.l = dkgVar2;
        return dkgVar2;
    }

    public final CharSequence q() {
        return this.e.getText();
    }

    public final boolean r(int i) {
        return this.e.isRtlCharAt(i);
    }
}
