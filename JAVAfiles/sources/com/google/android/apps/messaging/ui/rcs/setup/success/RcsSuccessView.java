package com.google.android.apps.messaging.ui.rcs.setup.success;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.abac;
import defpackage.brg;
import defpackage.ztg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RcsSuccessView extends View {
    public final AnimatorSet a;
    public int b;
    public int c;
    public final abac d;
    private final Paint e;
    private final Paint f;
    private final RectF g;
    private float h;
    private float i;
    private float j;
    private float k;
    private final ztg l;
    private final ztg m;

    public RcsSuccessView(Context context) {
        super(context);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.a = new AnimatorSet();
        this.d = new abac();
        this.g = new RectF();
        this.l = new ztg(this, 5, null);
        this.m = new ztg(this, 6, null);
        this.b = 180;
        this.c = 0;
        a(this);
    }

    private static void a(RcsSuccessView rcsSuccessView) {
        rcsSuccessView.g.getClass();
        rcsSuccessView.f.getClass();
        rcsSuccessView.e.getClass();
        rcsSuccessView.d.getClass();
        rcsSuccessView.a.getClass();
        rcsSuccessView.l.getClass();
        rcsSuccessView.m.getClass();
        Resources resources = rcsSuccessView.getResources();
        float dimension = resources.getDimension(R.dimen.rcs_success_arc_stroke_width);
        rcsSuccessView.k = dimension;
        rcsSuccessView.g.left = dimension;
        rcsSuccessView.g.top = rcsSuccessView.k;
        rcsSuccessView.f.setStyle(Paint.Style.STROKE);
        rcsSuccessView.f.setColor(-1);
        rcsSuccessView.f.setStrokeWidth(rcsSuccessView.k);
        rcsSuccessView.e.setStyle(Paint.Style.STROKE);
        rcsSuccessView.e.setColor(-1);
        rcsSuccessView.h = resources.getDimension(R.dimen.rcs_success_check_mark_stroke_width);
        rcsSuccessView.i = resources.getDimension(R.dimen.rcs_success_check_mark_long_bar);
        rcsSuccessView.j = resources.getDimension(R.dimen.rcs_success_check_mark_short_bar);
        rcsSuccessView.e.setStrokeWidth(rcsSuccessView.h);
        ValueAnimator ofInt = ValueAnimator.ofInt(rcsSuccessView.c, 360);
        int integer = resources.getInteger(R.integer.rcs_success_arc_animation_duration_ms);
        ofInt.setStartDelay(resources.getInteger(R.integer.rcs_success_animation_start_delay_ms));
        ofInt.setDuration(integer);
        ofInt.addUpdateListener(rcsSuccessView.l);
        int integer2 = resources.getInteger(R.integer.rcs_success_check_mark_animation_duration_ms);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(brg.a, 1.0f);
        ofFloat.setDuration(integer2);
        ofFloat.addUpdateListener(rcsSuccessView.m);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 0);
        ofInt2.setDuration(resources.getInteger(R.integer.rcs_success_animation_end_delay_ms));
        rcsSuccessView.a.playSequentially(ofInt, ofFloat, ofInt2);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.g, this.b, this.c, false, this.f);
        canvas.drawPath((Path) this.d.a, this.e);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size - this.k;
        this.g.bottom = f;
        this.g.right = f;
        Path path = new Path();
        PointF pointF = new PointF(size / 3, size2 / 2);
        path.moveTo(pointF.x, pointF.y);
        PointF pointF2 = new PointF(pointF.x + this.j, pointF.y + this.j);
        path.lineTo(pointF2.x, pointF2.y);
        PointF pointF3 = new PointF(pointF2.x + this.i, pointF2.y - this.i);
        path.lineTo(pointF3.x, pointF3.y);
        ((PathMeasure) this.d.b).setPath(path, false);
        setMeasuredDimension(size, size2);
    }

    public RcsSuccessView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.a = new AnimatorSet();
        this.d = new abac();
        this.g = new RectF();
        this.l = new ztg(this, 5, null);
        this.m = new ztg(this, 6, null);
        this.b = 180;
        this.c = 0;
        a(this);
    }

    public RcsSuccessView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Paint(1);
        this.f = new Paint(1);
        this.a = new AnimatorSet();
        this.d = new abac();
        this.g = new RectF();
        this.l = new ztg(this, 5, null);
        this.m = new ztg(this, 6, null);
        this.b = 180;
        this.c = 0;
        a(this);
    }
}
