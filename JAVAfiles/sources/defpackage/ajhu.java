package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajhu {
    public float A;
    public float B;
    public float C;
    public ColorStateList D;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    private float K;
    private float L;
    private float M;
    private float N;
    private Typeface O;
    private Typeface P;
    private Typeface Q;
    private Typeface R;
    private float T;
    private float U;
    private float V;
    private float W;
    private CharSequence X;
    public final View a;
    public float b;
    public final Rect c;
    public final Rect d;
    public final RectF e;
    public ColorStateList h;
    public ColorStateList i;
    public float j;
    public float k;
    public Typeface l;
    public Typeface m;
    public Typeface n;
    public ajjv o;
    public CharSequence p;
    public CharSequence q;
    public boolean r;
    public float s;
    public float t;
    public int[] u;
    public boolean v;
    public final TextPaint w;
    public final TextPaint x;
    public TimeInterpolator y;
    public TimeInterpolator z;
    private int I = 16;
    private int J = 16;
    public float f = 15.0f;
    public float g = 15.0f;
    private final TextUtils.TruncateAt S = TextUtils.TruncateAt.END;

    public ajhu(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.w = textPaint;
        this.x = new TextPaint(textPaint);
        this.d = new Rect();
        this.c = new Rect();
        this.e = new RectF();
        c(view.getContext().getResources().getConfiguration());
    }

    public static boolean m(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    private static float o(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = ajdd.a;
        return f + (f3 * (f2 - f));
    }

    private static int p(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int q(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.u;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private final void r() {
        Rect rect = this.c;
        float f = this.b;
        this.e.left = o(rect.left, this.d.left, f, this.y);
        this.e.top = o(this.K, this.L, f, this.y);
        this.e.right = o(this.c.right, this.d.right, f, this.y);
        this.e.bottom = o(this.c.bottom, this.d.bottom, f, this.y);
        this.j = o(this.M, this.N, f, this.y);
        this.k = o(this.K, this.L, f, this.y);
        t(f);
        o(brg.a, 1.0f, 1.0f - f, ajdd.b);
        this.a.postInvalidateOnAnimation();
        o(1.0f, brg.a, f, ajdd.b);
        this.a.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.i;
        ColorStateList colorStateList2 = this.h;
        if (colorStateList != colorStateList2) {
            this.w.setColor(p(q(colorStateList2), b(), f));
        } else {
            this.w.setColor(b());
        }
        float f2 = this.E;
        float f3 = this.F;
        if (f2 != f3) {
            this.w.setLetterSpacing(o(f3, f2, f, ajdd.b));
        } else {
            this.w.setLetterSpacing(f2);
        }
        this.T = o(brg.a, this.A, f, null);
        this.U = o(brg.a, this.B, f, null);
        this.V = o(brg.a, this.C, f, null);
        this.w.setShadowLayer(this.T, this.U, this.V, p(q(null), q(this.D), f));
        this.a.postInvalidateOnAnimation();
    }

    private final void s(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z3;
        boolean z4;
        if (this.p != null) {
            float width = this.d.width();
            float width2 = this.c.width();
            if (u(f, 1.0f)) {
                f2 = this.g;
                f3 = this.E;
                this.s = 1.0f;
                typeface = this.O;
            } else {
                float f4 = this.f;
                float f5 = this.F;
                Typeface typeface2 = this.l;
                if (u(f, brg.a)) {
                    this.s = 1.0f;
                } else {
                    this.s = o(this.f, this.g, f, this.z) / this.f;
                }
                float f6 = this.g / this.f;
                float f7 = width2 * f6;
                if (!z && f7 > width) {
                    width = Math.min(width / f6, width2);
                } else {
                    width = width2;
                }
                f2 = f4;
                f3 = f5;
                typeface = typeface2;
            }
            if (width > brg.a) {
                float f8 = this.t;
                float f9 = this.W;
                Typeface typeface3 = this.R;
                if (this.G != null && width != r8.getWidth()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (f8 == f2 && f9 == f3 && !z3 && typeface3 == typeface && !this.v) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                this.t = f2;
                this.W = f3;
                this.R = typeface;
                this.v = false;
                TextPaint textPaint = this.w;
                if (this.s != 1.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                textPaint.setLinearText(z4);
            } else {
                z2 = false;
            }
            if (this.q != null && !z2) {
                return;
            }
            this.w.setTextSize(this.t);
            this.w.setTypeface(this.R);
            this.w.setLetterSpacing(this.W);
            boolean l = l(this.p);
            this.r = l;
            try {
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                CharSequence charSequence = this.p;
                TextPaint textPaint2 = this.w;
                int i = (int) width;
                int length = charSequence.length();
                TextUtils.TruncateAt truncateAt = this.S;
                if (charSequence == null) {
                    charSequence = "";
                }
                int max = Math.max(0, i);
                CharSequence ellipsize = TextUtils.ellipsize(charSequence, textPaint2, max, truncateAt);
                int min = Math.min(ellipsize.length(), length);
                if (l) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(ellipsize, 0, min, textPaint2, max);
                obtain.setAlignment(alignment);
                obtain.setIncludePad(false);
                if (l) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                obtain.setTextDirection(textDirectionHeuristic);
                if (truncateAt != null) {
                    obtain.setEllipsize(truncateAt);
                }
                obtain.setMaxLines(1);
                staticLayout = obtain.build();
            } catch (ajib e) {
                Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
                staticLayout = null;
            }
            dye.i(staticLayout);
            this.G = staticLayout;
            this.q = staticLayout.getText();
        }
    }

    private final void t(float f) {
        s(f, false);
        this.a.postInvalidateOnAnimation();
    }

    private static boolean u(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private static final float v(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float a() {
        TextPaint textPaint = this.x;
        textPaint.setTextSize(this.g);
        textPaint.setTypeface(this.O);
        textPaint.setLetterSpacing(this.E);
        return -this.x.ascent();
    }

    public final int b() {
        return q(this.i);
    }

    public final void c(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.Q;
            if (typeface != null) {
                this.P = ajki.b(configuration, typeface);
            }
            Typeface typeface2 = this.n;
            if (typeface2 != null) {
                this.m = ajki.b(configuration, typeface2);
            }
            Typeface typeface3 = this.P;
            if (typeface3 == null) {
                typeface3 = this.Q;
            }
            this.O = typeface3;
            Typeface typeface4 = this.m;
            if (typeface4 == null) {
                typeface4 = this.n;
            }
            this.l = typeface4;
            e(true);
        }
    }

    public final void d() {
        e(false);
    }

    public final void e(boolean z) {
        float f;
        StaticLayout staticLayout;
        if (this.a.getHeight() <= 0 || this.a.getWidth() <= 0) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        s(1.0f, z);
        CharSequence charSequence = this.q;
        if (charSequence != null && (staticLayout = this.G) != null) {
            this.X = TextUtils.ellipsize(charSequence, this.w, staticLayout.getWidth(), this.S);
        }
        CharSequence charSequence2 = this.X;
        float f2 = brg.a;
        if (charSequence2 != null) {
            this.H = v(this.w, charSequence2);
        } else {
            this.H = brg.a;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.J, this.r ? 1 : 0);
        int i = absoluteGravity & 112;
        if (i != 48) {
            if (i != 80) {
                TextPaint textPaint = this.w;
                this.L = this.d.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.L = this.d.bottom + this.w.ascent();
            }
        } else {
            this.L = this.d.top;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 != 1) {
            if (i2 != 5) {
                this.N = this.d.left;
            } else {
                this.N = this.d.right - this.H;
            }
        } else {
            this.N = this.d.centerX() - (this.H / 2.0f);
        }
        s(brg.a, z);
        StaticLayout staticLayout2 = this.G;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        CharSequence charSequence3 = this.q;
        if (charSequence3 != null) {
            f2 = v(this.w, charSequence3);
        }
        StaticLayout staticLayout3 = this.G;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.I, this.r ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        if (i3 != 48) {
            if (i3 != 80) {
                this.K = this.c.centerY() - (f / 2.0f);
            } else {
                this.K = (this.c.bottom - f) + this.w.descent();
            }
        } else {
            this.K = this.c.top;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 != 1) {
            if (i4 != 5) {
                this.M = this.c.left;
            } else {
                this.M = this.c.right - f2;
            }
        } else {
            this.M = this.c.centerX() - (f2 / 2.0f);
        }
        t(this.b);
        r();
    }

    public final void f(ColorStateList colorStateList) {
        if (this.i == colorStateList && this.h == colorStateList) {
            return;
        }
        this.i = colorStateList;
        this.h = colorStateList;
        d();
    }

    public final void g(ColorStateList colorStateList) {
        if (this.i != colorStateList) {
            this.i = colorStateList;
            d();
        }
    }

    public final void h(int i) {
        if (this.J != i) {
            this.J = i;
            d();
        }
    }

    public final void i(int i) {
        if (this.I != i) {
            this.I = i;
            d();
        }
    }

    public final void j(float f) {
        if (this.f != f) {
            this.f = f;
            d();
        }
    }

    public final void k(float f) {
        float b = dze.b(f, brg.a, 1.0f);
        if (b != this.b) {
            this.b = b;
            r();
        }
    }

    public final boolean l(CharSequence charSequence) {
        atkn atknVar;
        if (this.a.getLayoutDirection() == 1) {
            atknVar = ecc.d;
        } else {
            atknVar = ecc.c;
        }
        return atknVar.d(charSequence, charSequence.length());
    }

    public final boolean n(Typeface typeface) {
        ajjv ajjvVar = this.o;
        if (ajjvVar != null) {
            ajjvVar.c();
        }
        if (this.Q != typeface) {
            this.Q = typeface;
            Typeface b = ajki.b(this.a.getContext().getResources().getConfiguration(), typeface);
            this.P = b;
            if (b == null) {
                b = this.Q;
            }
            this.O = b;
            return true;
        }
        return false;
    }
}
