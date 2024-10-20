package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawa extends aavv {
    private final int A;
    private final int B;
    private final Point C;
    private final Handler D;
    public volatile int c;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aavy j;
    private final Point l;
    private final int m;
    private final int n;
    private final int o;
    private final List p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final int t;
    private final int u;
    private final RectF v;
    private final RectF w;
    private final Point x;
    private final Point y;
    private final int z;
    private final aavz k = new aavz(this);
    public final Runnable d = new aaqk(this, 16, null);

    public aawa(Context context) {
        int i = aavx.a;
        this.D = new aavw();
        d(false);
        this.p = new ArrayList();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.pie_radius_start);
        this.m = dimensionPixelSize;
        this.u = dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.focus_radius_offset);
        this.n = resources.getDimensionPixelSize(R.dimen.pie_radius_increment);
        this.o = resources.getDimensionPixelSize(R.dimen.pie_touch_offset);
        this.l = new Point(0, 0);
        Paint paint = new Paint();
        this.q = paint;
        paint.setColor(Color.argb(255, 51, 181, 229));
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.r = paint2;
        paint2.setAntiAlias(true);
        paint2.setColor(Color.argb(BasePaymentResult.ERROR_REQUEST_FAILED, 250, 230, 128));
        Paint paint3 = new Paint();
        this.s = paint3;
        paint3.setAntiAlias(true);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.STROKE);
        this.t = -65536;
        this.v = new RectF();
        this.w = new RectF();
        this.x = new Point();
        this.y = new Point();
        this.z = resources.getDimensionPixelSize(R.dimen.focus_inner_offset);
        this.A = resources.getDimensionPixelSize(R.dimen.focus_outer_stroke);
        this.B = resources.getDimensionPixelSize(R.dimen.focus_inner_stroke);
        this.c = 0;
        ViewConfiguration.get(context).getScaledTouchSlop();
        this.C = new Point();
    }

    private static float h(double d) {
        return (float) (360.0d - ((d * 180.0d) / 3.141592653589793d));
    }

    private static void i(int i, int i2, Point point) {
        double d = ((i % 360) * 6.283185307179586d) / 360.0d;
        double d2 = i2;
        point.x = (int) ((Math.cos(d) * d2) + 0.5d);
        point.y = (int) ((d2 * Math.sin(d)) + 0.5d);
    }

    private final void j(Canvas canvas, int i, Paint paint) {
        i(i, this.u - this.z, this.x);
        int i2 = this.u;
        int i3 = this.z;
        i(i, (i2 - i3) + (i3 / 3), this.y);
        canvas.drawLine(this.x.x + this.e, this.x.y + this.f, this.y.x + this.e, this.y.y + this.f, paint);
    }

    private final void k() {
        List list = this.p;
        float size = list.size();
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int i = this.n;
            int i2 = this.m;
            float f = 1.8325958f / size;
            Point point = this.l;
            int i3 = (i + i2) - 2;
            RectF rectF = new RectF(point.x - i3, point.y - i3, point.x + i3, point.y + i3);
            int i4 = i2 + 2;
            RectF rectF2 = new RectF(point.x - i4, point.y - i4, point.x + i4, point.y + i4);
            Path path = new Path();
            float h = h(0.0d) - 1.0f;
            float h2 = h(f) + 1.0f;
            path.arcTo(rectF, h, h2 - h, true);
            path.arcTo(rectF2, h2, h - h2);
            path.close();
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                return;
            }
            throw null;
        }
        throw null;
    }

    private final void l(int i, int i2) {
        this.l.x = i;
        this.l.y = i2;
        this.a.removeCallbacks(this.d);
        this.k.cancel();
        this.k.reset();
        this.e = i;
        this.f = i2;
        this.i = 157;
        f(i, i2);
    }

    @Override // defpackage.aavv, defpackage.aawc
    public final void b(int i, int i2, int i3, int i4) {
        int i5 = (i3 - i) / 2;
        this.g = i5;
        int i6 = (i4 - i2) / 2;
        this.h = i6;
        this.e = i5;
        this.f = i6;
        f(i5, i6);
        if (this.b && this.c == 8) {
            l(this.g, this.h);
            k();
        }
    }

    @Override // defpackage.aavv
    public final void c(Canvas canvas) {
        float f;
        aavy aavyVar = this.j;
        if (aavyVar != null) {
            f = aavyVar.a;
        } else {
            f = 1.0f;
        }
        int save = canvas.save();
        if (this.j != null) {
            float f2 = (f * 0.1f) + 0.9f;
            canvas.scale(f2, f2, this.l.x, this.l.y);
        }
        this.s.setStrokeWidth(this.A);
        canvas.drawCircle(this.e, this.f, this.u, this.s);
        if (this.c != 8) {
            int color = this.s.getColor();
            if (this.c == 2) {
                this.s.setColor(this.t);
            }
            this.s.setStrokeWidth(this.B);
            j(canvas, this.i, this.s);
            j(canvas, this.i + 45, this.s);
            j(canvas, this.i + 180, this.s);
            j(canvas, this.i + 225, this.s);
            canvas.save();
            canvas.rotate(this.i, this.e, this.f);
            canvas.drawArc(this.w, brg.a, 45.0f, false, this.s);
            canvas.drawArc(this.w, 180.0f, 45.0f, false, this.s);
            canvas.restore();
            this.s.setColor(color);
        }
        if (this.c == 2) {
            canvas.restoreToCount(save);
            return;
        }
        for (aajv aajvVar : this.p) {
            if (this.c == 8) {
                throw null;
            }
        }
        canvas.restoreToCount(save);
    }

    @Override // defpackage.aavv, defpackage.aawc
    public final boolean e(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        PointF pointF = new PointF();
        pointF.x = 1.5707964f;
        float f = x - this.l.x;
        double d = f;
        double d2 = this.l.y - y;
        pointF.y = (float) Math.hypot(d, d2);
        if (f != brg.a) {
            pointF.x = (float) Math.atan2(d2, d);
            if (pointF.x < brg.a) {
                pointF.x = (float) (pointF.x + 6.283185307179586d);
            }
        }
        pointF.y += this.o;
        if (actionMasked == 0) {
            this.C.x = (int) motionEvent.getX();
            this.C.y = (int) motionEvent.getY();
            l((int) x, (int) y);
            g(true);
            return true;
        }
        if (actionMasked == 1) {
            if (this.b) {
                g(false);
                return true;
            }
        } else if (actionMasked == 3) {
            if (this.b) {
                g(false);
            }
        } else if (actionMasked == 2 && pointF.y >= this.m) {
            Iterator it = this.p.iterator();
            if (!it.hasNext()) {
                motionEvent.getX();
                int i = this.C.x;
                motionEvent.getX();
                int i2 = this.C.x;
                motionEvent.getY();
                int i3 = this.C.y;
                motionEvent.getY();
                int i4 = this.C.y;
            } else {
                throw null;
            }
        }
        return false;
    }

    public final void f(int i, int i2) {
        int i3 = this.u;
        int i4 = i2 - i3;
        this.v.set(i - i3, i4, i + i3, i2 + i3);
        int i5 = this.u;
        int i6 = this.z;
        int i7 = (i2 + i5) - i6;
        this.w.set((i - i5) + i6, (i2 - i5) + i6, (i + i5) - i6, i7);
    }

    public final void g(boolean z) {
        if (z) {
            this.c = 8;
            Iterator it = this.p.iterator();
            if (!it.hasNext()) {
                k();
                aavy aavyVar = new aavy();
                this.j = aavyVar;
                aavyVar.setDuration(200L);
                this.j.setAnimationListener(new aaot(this, 2));
                this.j.startNow();
                this.a.startAnimation(this.j);
            } else {
                throw null;
            }
        } else {
            this.c = 0;
        }
        d(z);
        this.D.sendEmptyMessage(!z ? 1 : 0);
    }
}
