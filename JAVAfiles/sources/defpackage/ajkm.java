package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajkm extends Drawable implements ajlc {
    private static final String a = "ajkm";
    private static final Paint b;
    private static final ajkl[] c;
    public static final /* synthetic */ int y = 0;
    private PorterDuffColorFilter A;
    private PorterDuffColorFilter B;
    private final RectF C;
    private boolean D;
    private ajkr E;
    private ejs F;
    private float[] G;
    private final asqc H;
    private final ajkq d;
    private final Matrix e;
    private final Path f;
    private final Path g;
    private final RectF h;
    private final RectF i;
    private final Region j;
    private final Region k;
    private final Paint l;
    private final Paint m;
    private final ajkc n;
    public ajkk o;
    public final ajla[] p;
    public final ajla[] q;
    public final BitSet r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public float[] w;
    ejq[] x;
    private final ajkt z;

    static {
        akct akctVar = new akct((char[]) null);
        int i = 0;
        ajki s = ajgl.s(0);
        akctVar.n(s);
        akctVar.o(s);
        akctVar.m(s);
        akctVar.l(s);
        akctVar.k(brg.a);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new ajkl[4];
        while (true) {
            ajkl[] ajklVarArr = c;
            int length = ajklVarArr.length;
            if (i < 4) {
                ajklVarArr[i] = new ajkl(i);
                i++;
            } else {
                return;
            }
        }
    }

    public ajkm() {
        this(new ajkr());
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = x(colorForState);
            }
            this.u = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z) {
            int color = paint.getColor();
            int x = x(color);
            this.u = x;
            if (x != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(x, PorterDuff.Mode.SRC_IN);
            }
        }
        return porterDuffColorFilter;
    }

    private final RectF c() {
        this.i.set(B());
        RectF rectF = this.i;
        float t = t();
        rectF.inset(t, t);
        return this.i;
    }

    private final void e(RectF rectF, Path path) {
        D(rectF, path);
        if (this.o.j != 1.0f) {
            this.e.reset();
            Matrix matrix = this.e;
            float f = this.o.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.e);
        }
        path.computeBounds(this.C, true);
    }

    private final void f(Canvas canvas) {
        if (this.r.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.o.s != 0) {
            canvas.drawPath(this.f, this.n.e);
        }
        for (int i = 0; i < 4; i++) {
            this.p[i].c(this.n, this.o.r, canvas);
            this.q[i].c(this.n, this.o.r, canvas);
        }
        if (this.v) {
            int y2 = y();
            int z = z();
            canvas.translate(-y2, -z);
            canvas.drawPath(this.f, b);
            canvas.translate(y2, z);
        }
    }

    private final void g(int[] iArr, boolean z) {
        boolean z2;
        boolean z3;
        RectF B = B();
        if (this.o.w != null && !B.isEmpty()) {
            if (this.F == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = z | z2;
            if (this.w == null) {
                this.w = new float[4];
            }
            aksr aksrVar = this.o.w;
            int h = aksrVar.h(iArr);
            if (h < 0) {
                h = aksrVar.h(StateSet.WILD_CARD);
            }
            ajkr ajkrVar = ((ajkr[]) aksrVar.d)[h];
            for (int i = 0; i < 4; i++) {
                float a2 = ajkt.b(i, ajkrVar).a(B);
                if (z4) {
                    this.w[i] = a2;
                    z3 = true;
                } else {
                    z3 = false;
                }
                ejq ejqVar = this.x[i];
                if (ejqVar != null) {
                    ejqVar.d(a2);
                    if (z3) {
                        this.x[i].e();
                    }
                }
            }
            if (z4) {
                invalidateSelf();
            }
        }
    }

    private final boolean h() {
        if ((this.o.v == Paint.Style.FILL_AND_STROKE || this.o.v == Paint.Style.STROKE) && this.m.getStrokeWidth() > brg.a) {
            return true;
        }
        return false;
    }

    private final boolean i(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.o.d != null && color2 != (colorForState2 = this.o.d.getColorForState(iArr, (color2 = this.l.getColor())))) {
            this.l.setColor(colorForState2);
            z = true;
        }
        if (this.o.e != null && color != (colorForState = this.o.e.getColorForState(iArr, (color = this.m.getColor())))) {
            this.m.setColor(colorForState);
            return true;
        }
        return z;
    }

    private final boolean j() {
        PorterDuffColorFilter porterDuffColorFilter = this.A;
        PorterDuffColorFilter porterDuffColorFilter2 = this.B;
        ajkk ajkkVar = this.o;
        this.A = b(ajkkVar.g, ajkkVar.h, this.l, true);
        ajkk ajkkVar2 = this.o;
        ColorStateList colorStateList = ajkkVar2.f;
        this.B = b(null, ajkkVar2.h, this.m, false);
        boolean z = this.o.u;
        if (!Objects.equals(porterDuffColorFilter, this.A) || !Objects.equals(porterDuffColorFilter2, this.B)) {
            return true;
        }
        return false;
    }

    private static final float k(RectF rectF, ajkr ajkrVar, float[] fArr) {
        if (fArr == null) {
            if (ajkrVar.e(rectF)) {
                return ajkrVar.b.a(rectF);
            }
            return -1.0f;
        }
        if (ajgk.n(fArr) && ajkrVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final ColorStateList A() {
        return this.o.d;
    }

    public final RectF B() {
        this.h.set(getBounds());
        return this.h;
    }

    public final ajkr C() {
        return this.o.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void D(RectF rectF, Path path) {
        ajkk ajkkVar = this.o;
        this.z.c(ajkkVar.a, this.w, ajkkVar.k, rectF, this.H, path);
    }

    public final void E(Canvas canvas, Paint paint, Path path, ajkr ajkrVar, float[] fArr, RectF rectF) {
        float k = k(rectF, ajkrVar, fArr);
        if (k >= brg.a) {
            float f = k * this.o.k;
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(Canvas canvas) {
        E(canvas, this.m, this.g, this.E, this.G, c());
    }

    public final void G(Context context) {
        this.o.b = new ajgm(context);
        P();
    }

    public final void H(ejs ejsVar) {
        if (this.F != ejsVar) {
            this.F = ejsVar;
            int i = 0;
            while (true) {
                ejq[] ejqVarArr = this.x;
                int length = ejqVarArr.length;
                if (i < 4) {
                    if (ejqVarArr[i] == null) {
                        ejqVarArr[i] = new ejq(this, c[i]);
                    }
                    ejq ejqVar = this.x[i];
                    ejs ejsVar2 = new ejs();
                    ejsVar2.c((float) ejsVar.b);
                    double d = ejsVar.a;
                    ejsVar2.e((float) (d * d));
                    ejqVar.r = ejsVar2;
                    i++;
                } else {
                    g(getState(), true);
                    invalidateSelf();
                    return;
                }
            }
        }
    }

    public final void I(float f) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.o != f) {
            ajkkVar.o = f;
            P();
        }
    }

    public final void J(ColorStateList colorStateList) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.d != colorStateList) {
            ajkkVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.k != f) {
            ajkkVar.k = f;
            this.s = true;
            this.t = true;
            invalidateSelf();
        }
    }

    public final void L(float f, int i) {
        O(f);
        N(ColorStateList.valueOf(i));
    }

    public final void M(float f, ColorStateList colorStateList) {
        O(f);
        N(colorStateList);
    }

    public final void N(ColorStateList colorStateList) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.e != colorStateList) {
            ajkkVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void O(float f) {
        this.o.l = f;
        invalidateSelf();
    }

    public final void P() {
        float w = w();
        this.o.r = (int) Math.ceil(0.75f * w);
        this.o.s = (int) Math.ceil(w * 0.25f);
        j();
        super.invalidateSelf();
    }

    public final boolean Q() {
        if (this.o.a.e(B())) {
            return true;
        }
        float[] fArr = this.w;
        if (fArr == null || !ajgk.n(fArr)) {
            return false;
        }
        if (this.o.a.d()) {
            return true;
        }
        return false;
    }

    public final void R() {
        this.n.a(-12303292);
        this.o.u = false;
        super.invalidateSelf();
    }

    public final void S(aksr aksrVar) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.w != aksrVar) {
            ajkkVar.w = aksrVar;
            g(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        this.l.setColorFilter(this.A);
        int alpha = this.l.getAlpha();
        this.l.setAlpha(a(alpha, this.o.m));
        this.m.setColorFilter(this.B);
        this.m.setStrokeWidth(this.o.l);
        int alpha2 = this.m.getAlpha();
        this.m.setAlpha(a(alpha2, this.o.m));
        if (this.o.v == Paint.Style.FILL_AND_STROKE || this.o.v == Paint.Style.FILL) {
            if (this.s) {
                e(B(), this.f);
                this.s = false;
            }
            ajkk ajkkVar = this.o;
            int i2 = ajkkVar.q;
            if (ajkkVar.r > 0 && !Q() && !this.f.isConvex() && Build.VERSION.SDK_INT < 29) {
                canvas.save();
                canvas.translate(y(), z());
                if (!this.v) {
                    f(canvas);
                    canvas.restore();
                } else {
                    float width = this.C.width() - getBounds().width();
                    float height = this.C.height() - getBounds().height();
                    int i3 = (int) width;
                    if (i3 >= 0 && (i = (int) height) >= 0) {
                        int width2 = (int) this.C.width();
                        int i4 = this.o.r;
                        int height2 = (int) this.C.height();
                        int i5 = this.o.r;
                        Bitmap createBitmap = Bitmap.createBitmap(width2 + i4 + i4 + i3, height2 + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f = (getBounds().left - this.o.r) - i3;
                        float f2 = (getBounds().top - this.o.r) - i;
                        canvas2.translate(-f, -f2);
                        f(canvas2);
                        canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
            E(canvas, this.l, this.f, this.o.a, this.w, B());
        }
        if (h()) {
            if (this.t) {
                this.E = C().c(this.d);
                if (this.w == null) {
                    this.G = null;
                } else {
                    if (this.G == null) {
                        this.G = new float[4];
                    }
                    float t = t();
                    int i6 = 0;
                    while (true) {
                        float[] fArr = this.w;
                        int length = fArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.G[i6] = Math.max(brg.a, fArr[i6] - t);
                        i6++;
                    }
                }
                this.z.c(this.E, this.G, this.o.k, c(), null, this.g);
                this.t = false;
            }
            F(canvas);
        }
        this.l.setAlpha(alpha);
        this.m.setAlpha(alpha2);
    }

    @Override // defpackage.ajlc
    public final void fn(ajkr ajkrVar) {
        ajkk ajkkVar = this.o;
        ajkkVar.a = ajkrVar;
        ajkkVar.w = null;
        this.w = null;
        this.G = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.o.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = this.o.q;
        RectF B = B();
        if (B.isEmpty()) {
            return;
        }
        float k = k(B, this.o.a, this.w);
        if (k >= brg.a) {
            outline.setRoundRect(getBounds(), k * this.o.k);
            return;
        }
        if (this.s) {
            e(B, this.f);
            this.s = false;
        }
        ajgl.g(outline, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.o.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.j.set(getBounds());
        e(B(), this.f);
        this.k.setPath(this.f, this.j);
        this.j.op(this.k, Region.Op.DIFFERENCE);
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.s = true;
        this.t = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.o.g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ajkk ajkkVar = this.o;
        ColorStateList colorStateList2 = ajkkVar.f;
        ColorStateList colorStateList3 = ajkkVar.e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.o.d;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        aksr aksrVar = this.o.w;
        if (aksrVar != null && aksrVar.a > 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.o = new ajkk(this.o);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.s = true;
        this.t = true;
        super.onBoundsChange(rect);
        if (this.o.w != null && !rect.isEmpty()) {
            g(getState(), this.D);
        }
        this.D = rect.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, defpackage.ajid
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        if (this.o.w != null) {
            g(iArr, false);
        }
        boolean i = i(iArr);
        boolean j = j();
        if (i || j) {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final float s() {
        return this.o.o;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.m != i) {
            ajkkVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.o.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.o.g = colorStateList;
        j();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ajkk ajkkVar = this.o;
        if (ajkkVar.h != mode) {
            ajkkVar.h = mode;
            j();
            super.invalidateSelf();
        }
    }

    public final float t() {
        if (h()) {
            return this.m.getStrokeWidth() / 2.0f;
        }
        return brg.a;
    }

    public final float u() {
        float[] fArr = this.w;
        if (fArr != null) {
            return fArr[3];
        }
        return this.o.a.b.a(B());
    }

    public final float v() {
        float[] fArr = this.w;
        if (fArr != null) {
            return fArr[0];
        }
        return this.o.a.c.a(B());
    }

    public final float w() {
        float s = s();
        float f = this.o.p;
        return s + brg.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int x(int i) {
        float w = w();
        ajkk ajkkVar = this.o;
        float f = w + ajkkVar.n;
        ajgm ajgmVar = ajkkVar.b;
        if (ajgmVar != null) {
            return ajgmVar.b(i, f);
        }
        return i;
    }

    public final int y() {
        ajkk ajkkVar = this.o;
        double d = ajkkVar.s;
        int i = ajkkVar.t;
        return (int) (d * Math.sin(Math.toRadians(0.0d)));
    }

    public final int z() {
        ajkk ajkkVar = this.o;
        double d = ajkkVar.s;
        int i = ajkkVar.t;
        return (int) (d * Math.cos(Math.toRadians(0.0d)));
    }

    public ajkm(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new ajkr(ajkr.h(context, attributeSet, i, i2)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ajkm(ajkk ajkkVar) {
        ajkt ajktVar;
        this.d = new ajkj(this);
        this.p = new ajla[4];
        this.q = new ajla[4];
        this.r = new BitSet(8);
        this.e = new Matrix();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Region();
        this.k = new Region();
        Paint paint = new Paint(1);
        this.l = paint;
        Paint paint2 = new Paint(1);
        this.m = paint2;
        this.n = new ajkc();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ajktVar = ajks.a;
        } else {
            ajktVar = new ajkt();
        }
        this.z = ajktVar;
        this.C = new RectF();
        this.v = true;
        this.D = true;
        this.x = new ejq[4];
        this.o = ajkkVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        j();
        i(getState());
        this.H = new asqc(this, null);
    }

    public ajkm(ajkr ajkrVar) {
        this(new ajkk(ajkrVar));
    }
}
