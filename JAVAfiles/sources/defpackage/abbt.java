package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbt extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public final boolean c;
    public boolean d;
    public View e;
    public int f;
    public View g;
    public int h;
    public int i;
    private final int[] j;
    private final Path k;
    private final RectF l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private Rect u;
    private int v;

    public abbt(Context context) {
        super(context);
        this.v = 0;
        this.i = 0;
        this.j = new int[2];
        this.k = new Path();
        this.l = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_horizontal);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_vertical);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_offset);
        this.p = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_radius);
        this.t = dimensionPixelSize2;
        this.q = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_length);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_base_width);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_corner_radius);
        int color = context.getColor(R.color.tooltip_background_color);
        int color2 = context.getColor(R.color.tooltip_shadow_color);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setShadowLayer(dimensionPixelSize2, brg.a, dimensionPixelSize, color2);
        this.c = true;
        this.d = false;
    }

    private final Point g() {
        return h(false);
    }

    private final Point h(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (z) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
        }
        return point;
    }

    private final void i(Canvas canvas) {
        getLocationOnScreen(this.j);
        canvas.save();
        canvas.translate(this.o - this.j[0], brg.a);
        canvas.drawPath(this.k, this.a);
        canvas.restore();
    }

    private final void j(int i, int i2) {
        int i3 = this.m;
        int size = View.MeasureSpec.getSize(i) - (i3 + i3);
        int i4 = this.n;
        int size2 = View.MeasureSpec.getSize(i2) - (i4 + i4);
        int i5 = size - this.p;
        int min = Math.min(g().x, i5);
        View view = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        int i6 = (size2 - this.p) - this.q;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, 0));
        if (this.e.getMeasuredHeight() > i6) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        }
        int measuredWidth = this.e.getMeasuredWidth();
        int i7 = this.m;
        int i8 = measuredWidth + i7 + i7;
        int measuredHeight = this.e.getMeasuredHeight();
        int i9 = this.n;
        this.l.set(brg.a, brg.a, i8, measuredHeight + i9 + i9);
        setMeasuredDimension(((int) this.l.width()) + this.p, ((int) this.l.height()) + this.p + this.q);
    }

    public final int a() {
        int i;
        int i2;
        int width;
        int measuredWidth = getMeasuredWidth();
        int[] iArr = eek.a;
        int layoutDirection = getLayoutDirection();
        int i3 = this.h;
        boolean z = true;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    if (layoutDirection == 1) {
                        i = this.u.left;
                    } else {
                        i2 = this.u.left;
                        width = this.u.width();
                        i = (i2 + width) - measuredWidth;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else {
                i = this.u.left - ((measuredWidth - this.u.width()) / 2);
            }
        } else if (layoutDirection == 1) {
            i2 = this.u.left;
            width = this.u.width();
            i = (i2 + width) - measuredWidth;
        } else {
            i = this.u.left;
        }
        int i4 = this.o;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        if (windowManager == null || windowManager.getDefaultDisplay().getRotation() != 3) {
            z = false;
        }
        return Math.min((h(z).x - this.o) - measuredWidth, Math.max(i4, i));
    }

    public final int b() {
        int i;
        int i2 = this.f;
        if (i2 == 1) {
            i = -getMeasuredHeight();
        } else if (i2 == 2) {
            i = this.u.height();
        } else {
            i = 0;
        }
        return this.u.top + i;
    }

    public final void c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d() {
        int width;
        int height;
        View view = this.g;
        int[] iArr = this.j;
        view.getLocationInWindow(iArr);
        if (view.getWidth() == 0) {
            width = view.getMeasuredWidth();
        } else {
            width = view.getWidth();
        }
        if (view.getHeight() == 0) {
            height = view.getMeasuredHeight();
        } else {
            height = view.getHeight();
        }
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.v;
        this.u = new Rect(i, i2 + i3, width + i, i2 + height + i3);
    }

    public final void e() {
        this.b.update(a(), b(), getMeasuredWidth(), getMeasuredHeight(), true);
    }

    public final void f() {
        Point g = g();
        int i = g.x;
        int i2 = g.y;
        int i3 = this.i;
        if (i3 == 0) {
            int i4 = this.o;
            i3 = i - (i4 + i4);
        }
        if (this.f == 2) {
            i2 = ((i2 - this.u.top) - this.u.height()) - this.o;
        }
        j(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f == 2) {
            canvas.translate(brg.a, this.q);
            i(canvas);
        }
        RectF rectF = this.l;
        float f = this.s;
        canvas.drawRoundRect(rectF, f, f, this.a);
        if (this.f == 1) {
            i(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        View view = this.e;
        int i8 = this.f;
        if (i8 == 2) {
            i5 = this.q;
        } else {
            i5 = 0;
        }
        int i9 = this.n;
        int i10 = i3 - i;
        int i11 = this.m;
        int i12 = i4 - i2;
        if (i8 == 1) {
            i6 = this.q;
        } else {
            i6 = 0;
        }
        view.layout(i11, i9 + i5, i10 - i11, (i12 - i9) - i6);
        e();
        int i13 = this.h;
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    int width = this.u.width() - (this.r / 2);
                    int i14 = this.o;
                    i7 = width - (i14 + i14);
                } else {
                    throw new IllegalStateException("Tooltip has invalid alignment.");
                }
            } else {
                i7 = this.u.width() / 2;
            }
        } else {
            int i15 = this.r / 2;
            int i16 = this.o;
            i7 = i15 + i16 + i16;
        }
        int[] iArr = eek.a;
        if (getLayoutDirection() == 1) {
            i7 = this.u.width() - i7;
        }
        this.g.getLocationOnScreen(this.j);
        int i17 = i7 + this.j[0];
        this.k.reset();
        int i18 = this.f;
        if (i18 == 1) {
            this.k.moveTo((i17 - this.o) - (this.r / 2), this.l.bottom);
            this.k.rLineTo(this.r, brg.a);
            this.k.rLineTo((-this.r) / 2, this.q);
            this.k.rLineTo((-this.r) / 2, -this.q);
            this.k.close();
            return;
        }
        if (i18 == 2) {
            this.k.moveTo((i17 - this.o) + (this.r / 2), this.l.top);
            this.k.rLineTo(-this.r, brg.a);
            this.k.rLineTo(this.r / 2, -this.q);
            this.k.rLineTo(this.r / 2, this.q);
            this.k.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        j(i, i2);
        if (this.g != null) {
            d();
            f();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.v = (int) f;
        d();
    }
}
