package com.google.android.libraries.inputmethod.emoji.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.agkx;
import defpackage.agso;
import defpackage.agtz;
import defpackage.agxq;
import defpackage.agxr;
import defpackage.agxs;
import defpackage.agxt;
import defpackage.agxv;
import defpackage.agxz;
import defpackage.agyn;
import defpackage.agyo;
import defpackage.agys;
import defpackage.agyt;
import defpackage.agzw;
import defpackage.agzy;
import defpackage.ahaw;
import defpackage.airh;
import defpackage.albo;
import defpackage.alob;
import defpackage.alog;
import defpackage.alvg;
import defpackage.alvi;
import defpackage.brg;
import defpackage.hkz;
import defpackage.hlg;
import defpackage.hqa;
import defpackage.hyv;
import defpackage.xqt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class EmojiView extends View {
    private static final alvi f = alvi.m("com/google/android/libraries/inputmethod/emoji/view/EmojiView");
    public agxq a;
    public alog b;
    public agxv c;
    public Drawable d;
    public Typeface e;
    private final hqa g;
    private final agxt h;
    private final float i;
    private final float j;
    private agxr k;
    private Paint l;
    private agxs m;

    public EmojiView(Context context) {
        this(context, null);
    }

    private final Paint d() {
        if (this.l == null) {
            this.l = new Paint(3);
        }
        return this.l;
    }

    private final void e() {
        a();
        agxq agxqVar = this.a;
        Paint d = d();
        agxq agxqVar2 = this.a;
        agxt agxtVar = this.h;
        ListenableFuture bM = albo.bM(new xqt(agxtVar, d, agxqVar2, 19, (char[]) null), agxtVar.c);
        airh airhVar = new airh();
        ((alob) airhVar.a).h(new agzw(this, 1));
        airhVar.c = agtz.b;
        this.k = agxr.b(agxqVar, bM, airhVar.f());
    }

    public final void a() {
        this.k.close();
        this.k = agxr.a;
    }

    public final void b(agxs agxsVar) {
        agxs agxsVar2 = this.m;
        if (agxsVar2 != null) {
            this.g.d(agxsVar2.b);
        }
        this.m = agxsVar;
        invalidate();
    }

    public final void c(agxv agxvVar) {
        String charSequence;
        this.c = agxvVar;
        setSelected(agxvVar.h);
        String str = agxvVar.b;
        if (str == null) {
            charSequence = "";
        } else {
            charSequence = str.toString();
        }
        if (!TextUtils.equals(this.a.b, charSequence)) {
            this.a = this.a.a(charSequence);
            a();
            b(null);
            if (!TextUtils.isEmpty(charSequence)) {
                e();
            }
        }
        agso.e(this, agxvVar.b);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        agxs agxsVar = this.m;
        if (agxsVar != null) {
            if (this.k.a() && !this.k.b.b.equals(agxsVar.a.b)) {
                return;
            }
            Bitmap bitmap = agxsVar.b;
            Paint d = d();
            int width = bitmap.getWidth();
            float height = bitmap.getHeight();
            float f2 = width;
            float width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
            float height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (f2 < width2 && height < height2) {
                canvas.drawBitmap(bitmap, Math.round((width2 - f2) / 2.0f) + getPaddingLeft(), Math.round((height2 - height) / 2.0f) + getPaddingTop(), d);
                return;
            }
            float max = Math.max(this.i / this.j, Math.min(width2 / f2, height2 / height));
            canvas.save();
            canvas.translate((width2 / 2.0f) + getPaddingLeft(), (height2 / 2.0f) + getPaddingTop());
            canvas.scale(max, max);
            canvas.translate((-width) / 2.0f, (-r3) / 2.0f);
            canvas.drawBitmap(bitmap, brg.a, brg.a, d);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (!this.a.b.isEmpty()) {
            if (this.k.a() && !this.k.b.equals(this.a)) {
                e();
                return;
            }
            agxs agxsVar = this.m;
            if (agxsVar != null) {
                if (!agxsVar.a.equals(this.a)) {
                    e();
                    return;
                }
            }
            if (this.m == null && !this.k.a()) {
                e();
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE && size != 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(size, this.h.g), 1073741824), i2);
            return;
        }
        if (ahaw.a) {
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 0 || mode2 == 0) {
                ((alvg) ((alvg) f.h()).h("com/google/android/libraries/inputmethod/emoji/view/EmojiView", "onMeasure", 121, "EmojiView.java")).q("MeasureSpec.UNSPECIFIED is not supported yet");
            }
        }
        setMeasuredDimension(size, size2);
        agxq agxqVar = this.a;
        int max = Math.max(0, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int i3 = agxqVar.c;
        int max2 = Math.max(0, measuredHeight);
        if (max != i3 || max2 != agxqVar.d) {
            agxqVar = new agxq(agxqVar.b, max, max2);
        }
        this.a = agxqVar;
    }

    public EmojiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = agxq.a;
        this.k = agxr.a;
        this.m = null;
        this.c = agxv.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, agxz.a);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.i = dimensionPixelSize;
        float applyDimension = TypedValue.applyDimension(1, 30.0f, context.getResources().getDisplayMetrics());
        int i = (int) (applyDimension + (applyDimension >= brg.a ? 0.5f : -0.5f));
        float dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, i == 0 ? (int) Math.signum(30.0f) : i);
        this.j = dimensionPixelSize2;
        Paint d = d();
        d.setTextSize(dimensionPixelSize2);
        d.setColor(obtainStyledAttributes.getColor(1, -16777216));
        obtainStyledAttributes.recycle();
        if (a.y()) {
            if (agyn.a == null) {
                context.getApplicationContext();
                agyn.a = new agys();
                agzy.a().f(agyn.a, agyt.class, agtz.b);
            }
            if (!agyn.b.get()) {
                agkx.k();
                agyn.b.set(true);
                hkz b = hkz.b(context);
                hqa hqaVar = b.a;
                if (!(hqaVar instanceof agyo)) {
                    hlg hlgVar = hlg.NORMAL;
                    hyv.i();
                    b.b.f(hlgVar.d);
                    b.a.e(hlgVar.d);
                } else {
                    throw null;
                }
            }
        }
        hqa hqaVar2 = hkz.b(context).a;
        this.g = hqaVar2;
        this.h = new agxt(hqaVar2, dimensionPixelSize);
    }
}
