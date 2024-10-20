package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajjj extends ajjn {
    public static final /* synthetic */ int h = 0;
    private static final ejr p = new ajji();
    public final ajjp a;
    public final ajjo b;
    public float c;
    public ValueAnimator d;
    public TimeInterpolator e;
    public TimeInterpolator f;
    public TimeInterpolator g;
    private final ejs q;
    private boolean r;
    private final ValueAnimator s;
    private final ejq t;

    public ajjj(Context context, ajiv ajivVar, ajjp ajjpVar) {
        super(context, ajivVar);
        this.r = false;
        this.a = ajjpVar;
        ajjo ajjoVar = new ajjo();
        this.b = ajjoVar;
        ajjoVar.h = true;
        ejs ejsVar = new ejs();
        this.q = ejsVar;
        ejsVar.c(1.0f);
        ejsVar.e(50.0f);
        ejq ejqVar = new ejq(this, p);
        this.t = ejqVar;
        ejqVar.r = ejsVar;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.s = valueAnimator;
        valueAnimator.setDuration(1000L);
        valueAnimator.setFloatValues(brg.a, 1.0f);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.addUpdateListener(new ajjh(this, ajivVar, 0));
        if (ajivVar.b(true) && ajivVar.k != 0) {
            valueAnimator.start();
        }
        i(1.0f);
    }

    public final float a(int i) {
        float f = i;
        if (f >= 1000.0f && f <= 9000.0f) {
            return 1.0f;
        }
        return brg.a;
    }

    public final float b() {
        return this.b.b;
    }

    public final void c(float f) {
        this.b.e = f;
        invalidateSelf();
    }

    public final void d(float f) {
        this.b.b = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.a.a(canvas, getBounds(), f(), k(), j());
            this.b.f = g();
            this.m.setStyle(Paint.Style.FILL);
            this.m.setAntiAlias(true);
            ajjo ajjoVar = this.b;
            ajiv ajivVar = this.j;
            ajjoVar.c = ajivVar.c[0];
            int i = ajivVar.g;
            if (i > 0) {
                this.a.d(canvas, this.m, b(), 1.0f, this.j.d, this.n, (int) ((i * dze.b(b(), brg.a, 0.01f)) / 0.01f));
            } else {
                this.a.d(canvas, this.m, brg.a, 1.0f, ajivVar.d, this.n, 0);
            }
            this.a.c(canvas, this.m, this.b, this.n);
            int i2 = this.j.c[0];
            canvas.restore();
        }
    }

    @Override // defpackage.ajjn
    public final boolean e(boolean z, boolean z2, boolean z3) {
        Context context = this.i;
        boolean e = super.e(z, z2, z3);
        float k = ajgk.k(context.getContentResolver());
        if (k == brg.a) {
            this.r = true;
        } else {
            this.r = false;
            this.q.e(50.0f / k);
        }
        return e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.b();
    }

    @Override // defpackage.ajjn, android.graphics.drawable.Drawable
    public final /* bridge */ /* synthetic */ int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.t.e();
        d(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        float f = i;
        if (this.r) {
            float a = a(i);
            this.t.e();
            d(f / 10000.0f);
            c(a);
            return true;
        }
        this.t.c(b() * 10000.0f);
        this.t.d(f);
        return true;
    }
}
