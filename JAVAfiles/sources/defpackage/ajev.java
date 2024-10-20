package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajev {
    public static final Drawable a;
    private static final double u = Math.cos(Math.toRadians(45.0d));
    public final MaterialCardView b;
    public final ajkm d;
    public final ajkm e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public ajkr n;
    public ColorStateList o;
    public Drawable p;
    public LayerDrawable q;
    public boolean s;
    private ajkm v;
    private ValueAnimator w;
    private final TimeInterpolator x;
    private final int y;
    private final int z;
    public final Rect c = new Rect();
    public boolean r = false;
    public float t = brg.a;

    static {
        ColorDrawable colorDrawable;
        if (Build.VERSION.SDK_INT <= 28) {
            colorDrawable = new ColorDrawable();
        } else {
            colorDrawable = null;
        }
        a = colorDrawable;
    }

    public ajev(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        this.b = materialCardView;
        ajkm ajkmVar = new ajkm(materialCardView.getContext(), attributeSet, i, R.style.Widget_MaterialComponents_CardView);
        this.d = ajkmVar;
        ajkmVar.G(materialCardView.getContext());
        ajkmVar.R();
        akct akctVar = new akct(ajkmVar.C());
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ajew.a, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            akctVar.k(obtainStyledAttributes.getDimension(3, brg.a));
        }
        this.e = new ajkm();
        g(new ajkr(akctVar));
        this.x = ajgk.l(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, ajdd.a);
        this.y = ajgk.g(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.z = ajgk.g(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    private final float q() {
        float a2;
        float a3;
        float max = Math.max(s(this.n.j, this.d.u()), s(this.n.k, this.d.v()));
        ajki ajkiVar = this.n.l;
        ajkm ajkmVar = this.d;
        float[] fArr = ajkmVar.w;
        if (fArr != null) {
            a2 = fArr[1];
        } else {
            a2 = ajkmVar.o.a.d.a(ajkmVar.B());
        }
        float s = s(ajkiVar, a2);
        ajki ajkiVar2 = this.n.m;
        ajkm ajkmVar2 = this.d;
        float[] fArr2 = ajkmVar2.w;
        if (fArr2 != null) {
            a3 = fArr2[2];
        } else {
            a3 = ajkmVar2.o.a.e.a(ajkmVar2.B());
        }
        return Math.max(max, Math.max(s, s(ajkiVar2, a3)));
    }

    private final boolean r() {
        return this.d.Q();
    }

    private static final float s(ajki ajkiVar, float f) {
        if (ajkiVar instanceof ajkp) {
            return (float) ((1.0d - u) * f);
        }
        if (ajkiVar instanceof ajkh) {
            return f / 2.0f;
        }
        return brg.a;
    }

    public final float a() {
        float f;
        float gc = this.b.gc();
        if (o()) {
            f = q();
        } else {
            f = brg.a;
        }
        return gc + f;
    }

    public final float b() {
        float f;
        float gc = this.b.gc() * 1.5f;
        if (o()) {
            f = q();
        } else {
            f = brg.a;
        }
        return gc + f;
    }

    public final Drawable c() {
        if (this.p == null) {
            this.v = new ajkm(this.n);
            this.p = new RippleDrawable(this.l, null, this.v);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.e, this.k});
            this.q = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.q;
    }

    public final Drawable d(Drawable drawable) {
        int i;
        int i2;
        if (this.b.a) {
            i2 = (int) Math.ceil(b());
            i = (int) Math.ceil(a());
        } else {
            i = 0;
            i2 = 0;
        }
        return new ajeu(drawable, i, i2, i, i2);
    }

    public final void e(ColorStateList colorStateList) {
        this.d.J(colorStateList);
    }

    public final void f(boolean z, boolean z2) {
        float f;
        float f2;
        int i;
        Drawable drawable = this.k;
        if (drawable != null) {
            if (true != z) {
                f = brg.a;
            } else {
                f = 1.0f;
            }
            int i2 = 0;
            if (z2) {
                if (z) {
                    f2 = 1.0f - this.t;
                } else {
                    f2 = this.t;
                }
                ValueAnimator valueAnimator = this.w;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.w = null;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.t, f);
                this.w = ofFloat;
                ofFloat.addUpdateListener(new ztg(this, 12));
                this.w.setInterpolator(this.x);
                ValueAnimator valueAnimator2 = this.w;
                if (z) {
                    i = this.y;
                } else {
                    i = this.z;
                }
                valueAnimator2.setDuration(i * f2);
                this.w.start();
                return;
            }
            if (true == z) {
                i2 = 255;
            }
            drawable.setAlpha(i2);
            this.t = f;
        }
    }

    public final void g(ajkr ajkrVar) {
        this.n = ajkrVar;
        this.d.fn(ajkrVar);
        this.d.v = !r0.Q();
        this.e.fn(ajkrVar);
        ajkm ajkmVar = this.v;
        if (ajkmVar != null) {
            ajkmVar.fn(ajkrVar);
        }
    }

    public final void h() {
        Drawable drawable;
        Drawable drawable2 = this.j;
        if (p()) {
            drawable = c();
        } else {
            drawable = this.e;
        }
        this.j = drawable;
        if (drawable2 != drawable) {
            if (this.b.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) this.b.getForeground()).setDrawable(drawable);
            } else {
                this.b.setForeground(d(drawable));
            }
        }
    }

    public final void i() {
        float q;
        float fZ;
        boolean n = n();
        float f = brg.a;
        if (!n && !o()) {
            q = 0.0f;
        } else {
            q = q();
        }
        MaterialCardView materialCardView = this.b;
        if (materialCardView.b && materialCardView.a) {
            double d = 1.0d - u;
            fZ = super/*androidx.cardview.widget.CardView*/.fZ();
            f = (float) (d * fZ);
        }
        float f2 = q - f;
        MaterialCardView materialCardView2 = this.b;
        int i = (int) f2;
        materialCardView2.c.set(this.c.left + i, this.c.top + i, this.c.right + i, this.c.bottom + i);
        a.bR(materialCardView2.e);
    }

    public final void j() {
        this.d.I(((View) this.b.e.b).getElevation());
    }

    public final void k() {
        this.e.M(this.i, this.o);
    }

    public final boolean l() {
        if ((this.h & 80) == 80) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if ((this.h & 8388613) == 8388613) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.b.b && !r()) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (this.b.b && r() && this.b.a) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.b.isClickable()) {
            return true;
        }
        View view = this.b;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }
}
