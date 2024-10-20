package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dkp implements LineHeightSpan {
    public final float a;
    public final boolean b;
    public final float c;
    public final boolean d;
    public int e;
    public int f;
    private final int g;
    private final boolean h;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;
    private int l = Integer.MIN_VALUE;

    public dkp(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.a = f;
        this.g = i;
        this.h = z;
        this.b = z2;
        this.c = f2;
        this.d = z3;
        if ((f2 >= brg.a && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        doz.c("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        double ceil;
        int i7;
        if (dkq.a(fontMetricsInt) > 0) {
            boolean z2 = true;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != this.g) {
                z2 = false;
            }
            if (z && z2 && this.h && this.b) {
                return;
            }
            if (this.i == Integer.MIN_VALUE) {
                int ceil2 = (int) Math.ceil(this.a);
                int a = ceil2 - dkq.a(fontMetricsInt);
                if (this.d && a <= 0) {
                    this.j = fontMetricsInt.ascent;
                    int i8 = fontMetricsInt.descent;
                    this.k = i8;
                    this.i = this.j;
                    this.l = i8;
                    this.e = 0;
                    this.f = 0;
                } else {
                    float f = this.c;
                    if (f == -1.0f) {
                        f = Math.abs(fontMetricsInt.ascent) / dkq.a(fontMetricsInt);
                    }
                    if (a <= 0) {
                        ceil = Math.ceil(a * f);
                    } else {
                        ceil = Math.ceil(a * (1.0f - f));
                    }
                    int i9 = fontMetricsInt.descent + ((int) ceil);
                    this.k = i9;
                    int i10 = i9 - ceil2;
                    this.j = i10;
                    if (this.h) {
                        i10 = fontMetricsInt.ascent;
                    }
                    this.i = i10;
                    if (this.b) {
                        i7 = fontMetricsInt.descent;
                    } else {
                        i7 = this.k;
                    }
                    this.l = i7;
                    this.e = fontMetricsInt.ascent - this.i;
                    this.f = this.l - fontMetricsInt.descent;
                }
            }
            if (z) {
                i5 = this.i;
            } else {
                i5 = this.j;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.l;
            } else {
                i6 = this.k;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
