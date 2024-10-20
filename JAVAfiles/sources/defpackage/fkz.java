package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkz extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, fkr {
    private final GestureDetector d;
    private final fkx f;
    private final PointF a = new PointF();
    private final PointF b = new PointF();
    private final float c = 25.0f;
    private volatile float e = 3.1415927f;

    public fkz(Context context, fkx fkxVar) {
        this.f = fkxVar;
        this.d = new GestureDetector(context, this);
    }

    @Override // defpackage.fkr
    public final void a(float[] fArr, float f) {
        this.e = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - this.a.x;
        float y = motionEvent2.getY() - this.a.y;
        this.a.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.e;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f3 = this.c;
        float f4 = y / f3;
        float f5 = x / f3;
        this.b.x -= (cos * f5) - (sin * f4);
        this.b.y += (sin * f5) + (cos * f4);
        this.b.y = Math.max(-45.0f, Math.min(45.0f, this.b.y));
        this.f.b(this.b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f.a.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.d.onTouchEvent(motionEvent);
    }
}
