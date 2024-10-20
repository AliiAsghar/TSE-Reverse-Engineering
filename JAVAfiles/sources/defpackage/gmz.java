package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmz extends gmr {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public gmx b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public gmz() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new gmx();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static gmz b(Resources resources, int i, Resources.Theme theme) {
        gmz gmzVar = new gmz();
        WeakHashMap weakHashMap = ean.a;
        gmzVar.e = resources.getDrawable(i, theme);
        return gmzVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.j);
        if (this.j.width() > 0 && this.j.height() > 0) {
            ColorFilter colorFilter = this.f;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.h);
            float abs = Math.abs(this.h[0]);
            float abs2 = Math.abs(this.h[4]);
            float abs3 = Math.abs(this.h[1]);
            float abs4 = Math.abs(this.h[3]);
            if (abs3 != brg.a || abs4 != brg.a) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (this.j.width() * abs));
            int min2 = Math.min(2048, (int) (this.j.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(this.j.left, this.j.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(this.j.width(), brg.a);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.j.offsetTo(0, 0);
                gmx gmxVar = this.b;
                Bitmap bitmap = gmxVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != gmxVar.f.getHeight()) {
                    gmxVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    gmxVar.k = true;
                }
                if (!this.c) {
                    this.b.a(min, min2);
                } else {
                    gmx gmxVar2 = this.b;
                    if (gmxVar2.k || gmxVar2.g != gmxVar2.c || gmxVar2.h != gmxVar2.d || gmxVar2.j != gmxVar2.e || gmxVar2.i != gmxVar2.b.getRootAlpha()) {
                        this.b.a(min, min2);
                        gmx gmxVar3 = this.b;
                        gmxVar3.g = gmxVar3.c;
                        gmxVar3.h = gmxVar3.d;
                        gmxVar3.i = gmxVar3.b.getRootAlpha();
                        gmxVar3.j = gmxVar3.e;
                        gmxVar3.k = false;
                    }
                }
                gmx gmxVar4 = this.b;
                Rect rect = this.j;
                if (gmxVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (gmxVar4.l == null) {
                        gmxVar4.l = new Paint();
                        gmxVar4.l.setFilterBitmap(true);
                    }
                    gmxVar4.l.setAlpha(gmxVar4.b.getRootAlpha());
                    gmxVar4.l.setColorFilter(colorFilter);
                    paint = gmxVar4.l;
                }
                canvas.drawBitmap(gmxVar4.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new gmy(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        gmx gmxVar = this.b;
        if (gmxVar != null) {
            if (gmxVar.b()) {
                return true;
            }
            ColorStateList colorStateList = this.b.c;
            if (colorStateList != null) {
                if (colorStateList.isStateful()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new gmx(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.gmr, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        gmx gmxVar = this.b;
        ColorStateList colorStateList = gmxVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = gmxVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (gmxVar.b()) {
            boolean f = gmxVar.b.d.f(iArr);
            gmxVar.k |= f;
            if (f) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        gmx gmxVar = this.b;
        if (gmxVar.c != colorStateList) {
            gmxVar.c = colorStateList;
            this.d = c(colorStateList, gmxVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        gmx gmxVar = this.b;
        if (gmxVar.d != mode) {
            gmxVar.d = mode;
            this.d = c(gmxVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        boolean z;
        int i2;
        int i3;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        gmx gmxVar = this.b;
        gmxVar.b = new gmw();
        TypedArray g = dyv.g(resources, theme, attributeSet, gmk.a);
        gmx gmxVar2 = this.b;
        gmw gmwVar = gmxVar2.b;
        gmxVar2.d = a.u(dyv.e(g, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList p = dyv.p(g, xmlPullParser, theme);
        if (p != null) {
            gmxVar2.c = p;
        }
        gmxVar2.e = dyv.n(g, xmlPullParser, gmxVar2.e);
        gmwVar.g = dyv.c(g, xmlPullParser, "viewportWidth", 7, gmwVar.g);
        float c = dyv.c(g, xmlPullParser, "viewportHeight", 8, gmwVar.h);
        gmwVar.h = c;
        if (gmwVar.g <= brg.a) {
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (c > brg.a) {
            int i4 = 3;
            gmwVar.e = g.getDimension(3, gmwVar.e);
            int i5 = 2;
            float dimension = g.getDimension(2, gmwVar.f);
            gmwVar.f = dimension;
            if (gmwVar.e <= brg.a) {
                throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > brg.a) {
                gmwVar.setAlpha(dyv.c(g, xmlPullParser, "alpha", 4, gmwVar.getAlpha()));
                boolean z2 = false;
                String string = g.getString(0);
                if (string != null) {
                    gmwVar.j = string;
                    gmwVar.l.put(string, gmwVar);
                }
                g.recycle();
                gmxVar.a = getChangingConfigurations();
                int i6 = 1;
                gmxVar.k = true;
                gmx gmxVar3 = this.b;
                gmw gmwVar2 = gmxVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(gmwVar2.d);
                int eventType = xmlPullParser.getEventType();
                boolean z3 = true;
                for (int depth = xmlPullParser.getDepth() + 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4); depth = i) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        gmu gmuVar = (gmu) arrayDeque.peek();
                        if (gmuVar != null) {
                            i = depth;
                            if ("path".equals(name)) {
                                gmt gmtVar = new gmt();
                                TypedArray g2 = dyv.g(resources, theme, attributeSet, gmk.c);
                                gmtVar.a = null;
                                if (dyv.k(xmlPullParser, "pathData")) {
                                    String string2 = g2.getString(0);
                                    if (string2 != null) {
                                        gmtVar.n = string2;
                                    }
                                    String string3 = g2.getString(2);
                                    if (string3 != null) {
                                        gmtVar.m = dyw.c(string3);
                                    }
                                    gmtVar.l = dyv.t(g2, xmlPullParser, theme, "fillColor", 1);
                                    gmtVar.d = dyv.c(g2, xmlPullParser, "fillAlpha", 12, gmtVar.d);
                                    int e = dyv.e(g2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = gmtVar.h;
                                    if (e == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (e == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (e == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    gmtVar.h = cap;
                                    int e2 = dyv.e(g2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = gmtVar.i;
                                    if (e2 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (e2 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (e2 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    gmtVar.i = join;
                                    gmtVar.j = dyv.c(g2, xmlPullParser, "strokeMiterLimit", 10, gmtVar.j);
                                    gmtVar.k = dyv.t(g2, xmlPullParser, theme, "strokeColor", 3);
                                    gmtVar.c = dyv.c(g2, xmlPullParser, "strokeAlpha", 11, gmtVar.c);
                                    gmtVar.b = dyv.c(g2, xmlPullParser, "strokeWidth", 4, gmtVar.b);
                                    gmtVar.f = dyv.c(g2, xmlPullParser, "trimPathEnd", 6, gmtVar.f);
                                    gmtVar.g = dyv.c(g2, xmlPullParser, "trimPathOffset", 7, gmtVar.g);
                                    gmtVar.e = dyv.c(g2, xmlPullParser, "trimPathStart", 5, gmtVar.e);
                                    gmtVar.o = dyv.e(g2, xmlPullParser, "fillType", 13, gmtVar.o);
                                }
                                g2.recycle();
                                gmuVar.b.add(gmtVar);
                                if (gmtVar.getPathName() != null) {
                                    gmwVar2.l.put(gmtVar.getPathName(), gmtVar);
                                }
                                int i7 = gmxVar3.a;
                                i2 = 3;
                                i3 = 2;
                                z = false;
                                z3 = false;
                            } else if ("clip-path".equals(name)) {
                                gms gmsVar = new gms();
                                if (dyv.k(xmlPullParser, "pathData")) {
                                    TypedArray g3 = dyv.g(resources, theme, attributeSet, gmk.d);
                                    String string4 = g3.getString(0);
                                    if (string4 != null) {
                                        gmsVar.n = string4;
                                    }
                                    String string5 = g3.getString(1);
                                    if (string5 != null) {
                                        gmsVar.m = dyw.c(string5);
                                    }
                                    gmsVar.o = dyv.e(g3, xmlPullParser, "fillType", 2, 0);
                                    g3.recycle();
                                }
                                gmuVar.b.add(gmsVar);
                                if (gmsVar.getPathName() != null) {
                                    gmwVar2.l.put(gmsVar.getPathName(), gmsVar);
                                }
                                int i8 = gmxVar3.a;
                                i2 = 3;
                                i3 = 2;
                                z = false;
                            } else if ("group".equals(name)) {
                                gmu gmuVar2 = new gmu();
                                TypedArray g4 = dyv.g(resources, theme, attributeSet, gmk.b);
                                gmuVar2.l = null;
                                gmuVar2.c = dyv.c(g4, xmlPullParser, "rotation", 5, gmuVar2.c);
                                gmuVar2.d = g4.getFloat(1, gmuVar2.d);
                                gmuVar2.e = g4.getFloat(2, gmuVar2.e);
                                gmuVar2.f = dyv.c(g4, xmlPullParser, "scaleX", 3, gmuVar2.f);
                                gmuVar2.g = dyv.c(g4, xmlPullParser, "scaleY", 4, gmuVar2.g);
                                gmuVar2.h = dyv.c(g4, xmlPullParser, "translateX", 6, gmuVar2.h);
                                gmuVar2.i = dyv.c(g4, xmlPullParser, "translateY", 7, gmuVar2.i);
                                z = false;
                                String string6 = g4.getString(0);
                                if (string6 != null) {
                                    gmuVar2.m = string6;
                                }
                                gmuVar2.d();
                                g4.recycle();
                                gmuVar.b.add(gmuVar2);
                                arrayDeque.push(gmuVar2);
                                if (gmuVar2.getGroupName() != null) {
                                    gmwVar2.l.put(gmuVar2.getGroupName(), gmuVar2);
                                }
                                int i9 = gmxVar3.a;
                                i2 = 3;
                                i3 = 2;
                            } else {
                                z = false;
                            }
                        } else {
                            i = depth;
                            z = z2;
                        }
                        i2 = 3;
                        i3 = 2;
                    } else {
                        i = depth;
                        z = z2;
                        i2 = i4;
                        i3 = i5;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    i6 = 1;
                    i4 = i2;
                    z2 = z;
                }
                if (!z3) {
                    this.d = c(gmxVar.c, gmxVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(g.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public gmz(gmx gmxVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = gmxVar;
        this.d = c(gmxVar.c, gmxVar.d);
    }
}
