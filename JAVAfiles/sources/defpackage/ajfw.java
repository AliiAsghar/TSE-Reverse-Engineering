package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajfw extends ajkm implements Drawable.Callback, ajid {
    private ColorStateList B;
    private ColorStateList C;
    private float D;
    private ColorStateList E;
    private float F;
    private boolean G;
    private Drawable H;
    private ColorStateList I;
    private float J;
    private boolean K;
    private Drawable L;
    private ColorStateList M;
    private float N;
    private boolean O;
    private Drawable P;
    private ColorStateList Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private final Context V;
    private final Paint W;
    private final Paint.FontMetrics X;
    private final RectF Y;
    private final PointF Z;
    public float a;
    private final Path aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private int ah;
    private int ai;
    private ColorFilter aj;
    private PorterDuffColorFilter ak;
    private ColorStateList al;
    private PorterDuff.Mode am;
    private int[] an;
    private WeakReference ao;
    private boolean ap;
    public ColorStateList b;
    public CharSequence c;
    public boolean d;
    public Drawable e;
    public boolean f;
    public float g;
    public float h;
    public float i;
    public float j;
    public final ajie k;
    public TextUtils.TruncateAt l;
    public boolean m;
    public int n;
    private static final int[] z = {R.attr.state_enabled};
    private static final ShapeDrawable A = new ShapeDrawable(new OvalShape());

    private ajfw(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.D = -1.0f;
        this.W = new Paint(1);
        this.X = new Paint.FontMetrics();
        this.Y = new RectF();
        this.Z = new PointF();
        this.aa = new Path();
        this.ai = 255;
        this.am = PorterDuff.Mode.SRC_IN;
        this.ao = new WeakReference(null);
        G(context);
        this.V = context;
        ajie ajieVar = new ajie(this);
        this.k = ajieVar;
        this.c = "";
        ajieVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = z;
        setState(iArr);
        r(iArr);
        this.m = true;
        A.setTint(-1);
    }

    private final float T() {
        Drawable drawable;
        if (this.ag) {
            drawable = this.P;
        } else {
            drawable = this.H;
        }
        float f = this.J;
        if (f <= brg.a && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    private final ColorFilter U() {
        ColorFilter colorFilter = this.aj;
        if (colorFilter != null) {
            return colorFilter;
        }
        return this.ak;
    }

    private final void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.e) {
                if (drawable.isStateful()) {
                    drawable.setState(this.an);
                }
                drawable.setTintList(this.M);
                return;
            }
            Drawable drawable2 = this.H;
            if (drawable == drawable2 && this.K) {
                drawable2.setTintList(this.I);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private final void W(Rect rect, RectF rectF) {
        Drawable drawable;
        rectF.setEmpty();
        if (!ab() && !aa()) {
            return;
        }
        float f = this.g + this.R;
        float T = T();
        if (getLayoutDirection() == 0) {
            rectF.left = rect.left + f;
            rectF.right = rectF.left + T;
        } else {
            rectF.right = rect.right - f;
            rectF.left = rectF.right - T;
        }
        if (this.ag) {
            drawable = this.P;
        } else {
            drawable = this.H;
        }
        float f2 = this.J;
        if (f2 <= brg.a && drawable != null) {
            f2 = (float) Math.ceil(ajgl.i(this.V, 24));
            if (drawable.getIntrinsicHeight() <= f2) {
                f2 = drawable.getIntrinsicHeight();
            }
        }
        rectF.top = rect.exactCenterY() - (f2 / 2.0f);
        rectF.bottom = rectF.top + f2;
    }

    private final boolean X() {
        if (this.O && this.P != null && this.f) {
            return true;
        }
        return false;
    }

    private static boolean Y(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    private final boolean Z(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 != null) {
            i = colorStateList2.getColorForState(iArr, this.ab);
        } else {
            i = 0;
        }
        int x = x(i);
        boolean z6 = true;
        if (this.ab != x) {
            this.ab = x;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.C;
        if (colorStateList3 != null) {
            i2 = colorStateList3.getColorForState(iArr, this.ac);
        } else {
            i2 = 0;
        }
        int x2 = x(i2);
        if (this.ac != x2) {
            this.ac = x2;
            onStateChange = true;
        }
        int g = eap.g(x2, x);
        if (this.ad != g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (A() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 | z3) {
            this.ad = g;
            J(ColorStateList.valueOf(g));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.E;
        if (colorStateList4 != null) {
            i3 = colorStateList4.getColorForState(iArr, this.ae);
        } else {
            i3 = 0;
        }
        if (this.ae != i3) {
            this.ae = i3;
            onStateChange = true;
        }
        ajjz ajjzVar = this.k.e;
        if (ajjzVar != null && (colorStateList = ajjzVar.k) != null) {
            i4 = colorStateList.getColorForState(iArr, this.af);
        } else {
            i4 = 0;
        }
        if (this.af != i4) {
            this.af = i4;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= state.length) {
                    break;
                }
                if (state[i6] == 16842912) {
                    if (this.f) {
                        z4 = true;
                    }
                } else {
                    i6++;
                }
            }
        }
        z4 = false;
        if (this.ag != z4 && this.P != null) {
            float a = a();
            this.ag = z4;
            if (a != a()) {
                onStateChange = true;
                z5 = true;
            } else {
                z5 = false;
                onStateChange = true;
            }
        } else {
            z5 = false;
        }
        ColorStateList colorStateList5 = this.al;
        if (colorStateList5 != null) {
            i5 = colorStateList5.getColorForState(iArr, this.ah);
        } else {
            i5 = 0;
        }
        if (this.ah != i5) {
            this.ah = i5;
            this.ak = ajgl.e(this, this.al, this.am);
        } else {
            z6 = onStateChange;
        }
        if (q(this.H)) {
            z6 |= this.H.setState(iArr);
        }
        if (q(this.P)) {
            z6 |= this.P.setState(iArr);
        }
        if (q(this.e)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            z6 |= this.e.setState(iArr3);
        }
        if (q(this.L)) {
            z6 |= this.L.setState(iArr2);
        }
        if (z6) {
            invalidateSelf();
        }
        if (z5) {
            h();
        }
        return z6;
    }

    private final boolean aa() {
        if (this.O && this.P != null && this.ag) {
            return true;
        }
        return false;
    }

    private final boolean ab() {
        if (this.G && this.H != null) {
            return true;
        }
        return false;
    }

    private final boolean ac() {
        if (this.d && this.e != null) {
            return true;
        }
        return false;
    }

    private static final void ad(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x022d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ajfw f(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajfw.f(android.content.Context, android.util.AttributeSet, int, int):ajfw");
    }

    public static boolean q(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final float a() {
        if (!ab() && !aa()) {
            return brg.a;
        }
        return this.R + T() + this.S;
    }

    public final float b() {
        if (ac()) {
            return this.T + this.N + this.U;
        }
        return brg.a;
    }

    public final float c() {
        if (this.ap) {
            return u();
        }
        return this.D;
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        boolean z2;
        int i3;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i = this.ai) != 0) {
            if (i < 255) {
                i2 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.ai);
            } else {
                i2 = 0;
            }
            if (!this.ap) {
                this.W.setColor(this.ab);
                this.W.setStyle(Paint.Style.FILL);
                this.Y.set(bounds);
                canvas.drawRoundRect(this.Y, c(), c(), this.W);
            }
            if (!this.ap) {
                this.W.setColor(this.ac);
                this.W.setStyle(Paint.Style.FILL);
                this.W.setColorFilter(U());
                this.Y.set(bounds);
                canvas.drawRoundRect(this.Y, c(), c(), this.W);
            }
            if (this.ap) {
                super.draw(canvas);
            }
            if (this.F > brg.a && !this.ap) {
                this.W.setColor(this.ae);
                this.W.setStyle(Paint.Style.STROKE);
                if (!this.ap) {
                    this.W.setColorFilter(U());
                }
                this.Y.set(bounds.left + (this.F / 2.0f), bounds.top + (this.F / 2.0f), bounds.right - (this.F / 2.0f), bounds.bottom - (this.F / 2.0f));
                float f = this.D - (this.F / 2.0f);
                canvas.drawRoundRect(this.Y, f, f, this.W);
            }
            this.W.setColor(0);
            this.W.setStyle(Paint.Style.FILL);
            this.Y.set(bounds);
            if (!this.ap) {
                canvas.drawRoundRect(this.Y, c(), c(), this.W);
            } else {
                D(new RectF(bounds), this.aa);
                super.E(canvas, this.W, this.aa, this.o.a, this.w, B());
            }
            if (ab()) {
                W(bounds, this.Y);
                RectF rectF = this.Y;
                float f2 = rectF.left;
                float f3 = rectF.top;
                canvas.translate(f2, f3);
                this.H.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
                this.H.draw(canvas);
                canvas.translate(-f2, -f3);
            }
            if (aa()) {
                W(bounds, this.Y);
                RectF rectF2 = this.Y;
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                canvas.translate(f4, f5);
                this.P.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
                this.P.draw(canvas);
                canvas.translate(-f4, -f5);
            }
            if (this.m && this.c != null) {
                PointF pointF = this.Z;
                pointF.set(brg.a, brg.a);
                Paint.Align align = Paint.Align.LEFT;
                if (this.c != null) {
                    float a = this.g + a() + this.h;
                    if (getLayoutDirection() == 0) {
                        pointF.x = bounds.left + a;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - a;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    this.k.a.getFontMetrics(this.X);
                    Paint.FontMetrics fontMetrics = this.X;
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF3 = this.Y;
                rectF3.setEmpty();
                if (this.c != null) {
                    float a2 = this.g + a() + this.h;
                    float b = this.j + b() + this.i;
                    if (getLayoutDirection() == 0) {
                        rectF3.left = bounds.left + a2;
                        rectF3.right = bounds.right - b;
                    } else {
                        rectF3.left = bounds.left + b;
                        rectF3.right = bounds.right - a2;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                ajie ajieVar = this.k;
                if (ajieVar.e != null) {
                    ajieVar.a.drawableState = getState();
                    ajie ajieVar2 = this.k;
                    ajieVar2.e.c(this.V, ajieVar2.a, ajieVar2.b);
                }
                this.k.a.setTextAlign(align);
                if (Math.round(this.k.a(this.c.toString())) > Math.round(this.Y.width())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int save = canvas.save();
                    canvas.clipRect(this.Y);
                    i3 = save;
                } else {
                    i3 = 0;
                }
                CharSequence charSequence = this.c;
                if (z2 && this.l != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.k.a, this.Y.width(), this.l);
                }
                CharSequence charSequence2 = charSequence;
                PointF pointF2 = this.Z;
                canvas.drawText(charSequence2, 0, charSequence2.length(), pointF2.x, pointF2.y, this.k.a);
                if (z2) {
                    canvas.restoreToCount(i3);
                }
            }
            if (ac()) {
                RectF rectF4 = this.Y;
                rectF4.setEmpty();
                if (ac()) {
                    float f6 = this.j + this.U;
                    if (getLayoutDirection() == 0) {
                        rectF4.right = bounds.right - f6;
                        rectF4.left = rectF4.right - this.N;
                    } else {
                        rectF4.left = bounds.left + f6;
                        rectF4.right = rectF4.left + this.N;
                    }
                    rectF4.top = bounds.exactCenterY() - (this.N / 2.0f);
                    rectF4.bottom = rectF4.top + this.N;
                }
                RectF rectF5 = this.Y;
                float f7 = rectF5.left;
                float f8 = rectF5.top;
                canvas.translate(f7, f8);
                this.e.setBounds(0, 0, (int) this.Y.width(), (int) this.Y.height());
                this.L.setBounds(this.e.getBounds());
                this.L.jumpToCurrentState();
                this.L.draw(canvas);
                canvas.translate(-f7, -f8);
            }
            if (this.ai < 255) {
                canvas.restoreToCount(i2);
            }
        }
    }

    public final Drawable e() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return dza.b(drawable);
        }
        return null;
    }

    public final ajjz g() {
        return this.k.e;
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ai;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.aj;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.g + a() + this.h + this.k.a(this.c.toString()) + this.i + b() + this.j), this.n);
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.ap) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.D);
        }
        outline.setAlpha(this.ai / 255.0f);
    }

    protected final void h() {
        ajfv ajfvVar = (ajfv) this.ao.get();
        if (ajfvVar != null) {
            ajfvVar.f();
        }
    }

    @Override // defpackage.ajid
    public final void i() {
        h();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (!Y(this.B) && !Y(this.C) && !Y(this.E)) {
            ajjz ajjzVar = this.k.e;
            if ((ajjzVar == null || (colorStateList = ajjzVar.k) == null || !colorStateList.isStateful()) && !X() && !q(this.H) && !q(this.P) && !Y(this.al)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void j(boolean z2) {
        if (this.O != z2) {
            boolean aa = aa();
            this.O = z2;
            boolean aa2 = aa();
            if (aa != aa2) {
                if (aa2) {
                    V(this.P);
                } else {
                    ad(this.P);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void k(boolean z2) {
        if (this.G != z2) {
            boolean ab = ab();
            this.G = z2;
            boolean ab2 = ab();
            if (ab != ab2) {
                if (ab2) {
                    V(this.H);
                } else {
                    ad(this.H);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void l(boolean z2) {
        if (this.d != z2) {
            boolean ac = ac();
            this.d = z2;
            boolean ac2 = ac();
            if (ac != ac2) {
                if (ac2) {
                    V(this.e);
                } else {
                    ad(this.e);
                }
                invalidateSelf();
                h();
            }
        }
    }

    public final void m(ajfv ajfvVar) {
        this.ao = new WeakReference(ajfvVar);
    }

    public final void n(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.c, charSequence)) {
            this.c = charSequence;
            this.k.c = true;
            invalidateSelf();
            h();
        }
    }

    public final void o(ajjz ajjzVar) {
        ajie ajieVar = this.k;
        if (ajieVar.e != ajjzVar) {
            ajieVar.e = ajjzVar;
            if (ajjzVar != null) {
                Context context = this.V;
                ajjzVar.d(context, ajieVar.a, ajieVar.b);
                ajid ajidVar = (ajid) ajieVar.d.get();
                if (ajidVar != null) {
                    ajieVar.a.drawableState = ajidVar.getState();
                }
                ajjzVar.c(context, ajieVar.a, ajieVar.b);
                ajieVar.c = true;
            }
            ajid ajidVar2 = (ajid) ajieVar.d.get();
            if (ajidVar2 != null) {
                ajidVar2.i();
                ajidVar2.onStateChange(ajidVar2.getState());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (ab()) {
            onLayoutDirectionChanged |= this.H.setLayoutDirection(i);
        }
        if (aa()) {
            onLayoutDirectionChanged |= this.P.setLayoutDirection(i);
        }
        if (ac()) {
            onLayoutDirectionChanged |= this.e.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (ab()) {
            onLevelChange |= this.H.setLevel(i);
        }
        if (aa()) {
            onLevelChange |= this.P.setLevel(i);
        }
        if (ac()) {
            onLevelChange |= this.e.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable, defpackage.ajid
    public final boolean onStateChange(int[] iArr) {
        if (this.ap) {
            super.onStateChange(iArr);
        }
        return Z(iArr, this.an);
    }

    public final void p(int i) {
        o(new ajjz(this.V, i));
    }

    public final boolean r(int[] iArr) {
        if (!Arrays.equals(this.an, iArr)) {
            this.an = iArr;
            if (ac()) {
                return Z(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ai != i) {
            this.ai = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.aj != colorFilter) {
            this.aj = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.al != colorStateList) {
            this.al = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.ajkm, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.am != mode) {
            this.am = mode;
            this.ak = ajgl.e(this, this.al, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (ab()) {
            visible |= this.H.setVisible(z2, z3);
        }
        if (aa()) {
            visible |= this.P.setVisible(z2, z3);
        }
        if (ac()) {
            visible |= this.e.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
