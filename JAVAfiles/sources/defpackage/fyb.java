package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fyb extends View {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final StringBuilder E;
    private final Formatter F;
    private final Runnable G;
    private final Point H;
    private final int I;
    private final long J;
    private int K;
    private Rect L;
    private long M;
    public final Rect a;
    public final Rect b;
    public final CopyOnWriteArraySet c;
    public final float d;
    public final ValueAnimator e;
    public float f;
    public boolean g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public int l;
    public long[] m;
    public boolean[] n;
    private final Rect o;
    private final Rect p;
    private final Paint q;
    private final Paint r;
    private final Paint s;
    private final Paint t;
    private final Paint u;
    private final Paint v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public fyb(Context context) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        Paint paint = new Paint();
        this.q = paint;
        Paint paint2 = new Paint();
        this.r = paint2;
        Paint paint3 = new Paint();
        this.s = paint3;
        Paint paint4 = new Paint();
        this.t = paint4;
        Paint paint5 = new Paint();
        this.u = paint5;
        Paint paint6 = new Paint();
        this.v = paint6;
        paint6.setAntiAlias(true);
        this.c = new CopyOnWriteArraySet();
        this.H = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.d = f;
        this.D = e(f, -50);
        int e = e(f, 4);
        int e2 = e(f, 26);
        int e3 = e(f, 4);
        int e4 = e(f, 12);
        int e5 = e(f, 0);
        int e6 = e(f, 16);
        this.w = e;
        this.x = e2;
        this.y = e3;
        this.z = e4;
        this.A = e5;
        this.B = e6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        StringBuilder sb = new StringBuilder();
        this.E = sb;
        this.F = new Formatter(sb, Locale.getDefault());
        this.G = new fhg(this, 20);
        this.C = (Math.max(e5, Math.max(e4, e6)) + 1) / 2;
        this.f = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.e = valueAnimator;
        valueAnimator.addUpdateListener(new qu(this, 3, null));
        this.i = -9223372036854775807L;
        this.J = -9223372036854775807L;
        this.I = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private static int e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private final long f() {
        long j = this.J;
        if (j == -9223372036854775807L) {
            long j2 = this.i;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.I;
        }
        return j;
    }

    private final long g() {
        if (this.b.width() > 0 && this.i != -9223372036854775807L) {
            return (this.p.width() * this.i) / this.b.width();
        }
        return 0L;
    }

    private final void h(float f) {
        Rect rect = this.b;
        this.p.right = eul.d((int) f, rect.left, rect.right);
    }

    private final void i(long j) {
        this.M = j;
        this.h = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fye fyeVar = (fye) it.next();
            fyj fyjVar = fyeVar.a;
            fyjVar.G = true;
            TextView textView = fyjVar.v;
            if (textView != null) {
                textView.setText(eul.J(fyjVar.w, fyjVar.x, j));
            }
            fyeVar.a.a.h();
        }
    }

    private final void j(long j) {
        if (this.M != j) {
            this.M = j;
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                fyj fyjVar = ((fye) it.next()).a;
                TextView textView = fyjVar.v;
                if (textView != null) {
                    textView.setText(eul.J(fyjVar.w, fyjVar.x, j));
                }
            }
        }
    }

    private final boolean k(long j) {
        long j2;
        long j3 = this.i;
        if (j3 > 0) {
            if (this.h) {
                j2 = this.M;
            } else {
                j2 = this.j;
            }
            long j4 = j2;
            long q = eul.q(j4 + j, 0L, j3);
            if (q != j4) {
                if (!this.h) {
                    i(q);
                } else {
                    j(q);
                }
                d();
                return true;
            }
            return false;
        }
        return false;
    }

    public final String a() {
        return eul.J(this.E, this.F, this.j);
    }

    public final void b(boolean z) {
        if (this.e.isStarted()) {
            this.e.cancel();
        }
        this.g = z;
        this.f = brg.a;
        invalidate(this.a);
    }

    public final void c(boolean z) {
        ert ertVar;
        removeCallbacks(this.G);
        this.h = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            fye fyeVar = (fye) it.next();
            long j = this.M;
            fyj fyjVar = fyeVar.a;
            fyjVar.G = false;
            if (!z && (ertVar = fyjVar.D) != null) {
                if (ertVar.l(5)) {
                    ((eqb) ertVar).q(j);
                }
                fyjVar.i();
            }
            fyeVar.a.a.i();
        }
    }

    public final void d() {
        long j;
        this.o.set(this.b);
        this.p.set(this.b);
        if (this.h) {
            j = this.M;
        } else {
            j = this.j;
        }
        if (this.i > 0) {
            this.o.right = Math.min(this.b.left + ((int) ((this.b.width() * this.k) / this.i)), this.b.right);
            this.p.right = Math.min(this.b.left + ((int) ((this.b.width() * j) / this.i)), this.b.right);
        } else {
            this.o.right = this.b.left;
            this.p.right = this.b.left;
        }
        invalidate(this.a);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        canvas.save();
        int height = this.b.height();
        int centerY = this.b.centerY() - (height / 2);
        int i2 = height + centerY;
        if (this.i <= 0) {
            canvas.drawRect(this.b.left, centerY, this.b.right, i2, this.s);
        } else {
            Rect rect = this.o;
            Rect rect2 = this.b;
            int i3 = rect.left;
            int i4 = rect.right;
            int max = Math.max(Math.max(rect2.left, i4), this.p.right);
            if (max < this.b.right) {
                canvas.drawRect(max, centerY, this.b.right, i2, this.s);
            }
            int max2 = Math.max(i3, this.p.right);
            if (i4 > max2) {
                canvas.drawRect(max2, centerY, i4, i2, this.r);
            }
            if (this.p.width() > 0) {
                canvas.drawRect(this.p.left, centerY, this.p.right, i2, this.q);
            }
            if (this.l != 0) {
                long[] jArr = this.m;
                dzg.g(jArr);
                boolean[] zArr = this.n;
                dzg.g(zArr);
                int i5 = this.y / 2;
                for (int i6 = 0; i6 < this.l; i6++) {
                    float f = i2;
                    float f2 = centerY;
                    int width = ((int) ((this.b.width() * eul.q(jArr[i6], 0L, this.i)) / this.i)) - i5;
                    Rect rect3 = this.b;
                    int min = rect3.left + Math.min(rect3.width() - this.y, Math.max(0, width));
                    if (zArr[i6]) {
                        paint = this.u;
                    } else {
                        paint = this.t;
                    }
                    canvas.drawRect(min, f2, min + this.y, f, paint);
                }
            }
        }
        if (this.i > 0) {
            Rect rect4 = this.p;
            int d = eul.d(rect4.right, rect4.left, this.b.right);
            int centerY2 = this.p.centerY();
            if (!this.h && !isFocused()) {
                if (isEnabled()) {
                    i = this.z;
                } else {
                    i = this.A;
                }
            } else {
                i = this.B;
            }
            canvas.drawCircle(d, centerY2, (int) ((i * this.f) / 2.0f), this.v);
        }
        canvas.restore();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.h && !z) {
            c(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(a());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(a());
        if (this.i <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.f()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.k(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.G
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.G
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.h
            if (r0 == 0) goto L30
            r5 = 0
            r4.c(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyb.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        Rect rect;
        int paddingLeft = getPaddingLeft();
        int i6 = i3 - i;
        int paddingRight = i6 - getPaddingRight();
        if (this.g) {
            i5 = 0;
        } else {
            i5 = this.C;
        }
        int i7 = i4 - i2;
        int i8 = this.x;
        int i9 = this.w;
        int i10 = (i7 - i8) / 2;
        this.a.set(paddingLeft, i10, paddingRight, i8 + i10);
        int i11 = (i7 - i9) / 2;
        this.b.set(this.a.left + i5, i11, this.a.right - i5, this.w + i11);
        if (eul.a >= 29 && ((rect = this.L) == null || rect.width() != i6 || this.L.height() != i7)) {
            Rect rect2 = new Rect(0, 0, i6, i7);
            this.L = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
        d();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.x;
        } else if (mode != 1073741824) {
            size = Math.min(this.x, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L88
            long r2 = r7.i
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L88
        L11:
            android.graphics.Point r0 = r7.H
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.H
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L6b
            r5 = 3
            if (r3 == r4) goto L5c
            r6 = 2
            if (r3 == r6) goto L36
            if (r3 == r5) goto L5c
            goto L88
        L36:
            boolean r8 = r7.h
            if (r8 == 0) goto L88
            int r8 = r7.D
            if (r0 >= r8) goto L48
            int r8 = r7.K
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.h(r8)
            goto L4e
        L48:
            float r8 = (float) r2
            r7.K = r2
            r7.h(r8)
        L4e:
            long r0 = r7.g()
            r7.j(r0)
            r7.d()
            r7.invalidate()
            return r4
        L5c:
            boolean r0 = r7.h
            if (r0 == 0) goto L88
            int r8 = r8.getAction()
            if (r8 != r5) goto L67
            r1 = r4
        L67:
            r7.c(r1)
            return r4
        L6b:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.a
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L88
            r7.h(r8)
            long r0 = r7.g()
            r7.i(r0)
            r7.d()
            r7.invalidate()
            return r4
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fyb.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.i <= 0) {
            return false;
        }
        if (i == 8192) {
            if (k(-f())) {
                c(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (k(f())) {
                c(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.h && !z) {
            c(true);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }
}
