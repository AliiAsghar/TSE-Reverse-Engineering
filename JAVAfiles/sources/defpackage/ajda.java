package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.libraries.view.zoomableimage.ZoomableImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajda extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ZoomableImageView a;

    public ajda(ZoomableImageView zoomableImageView) {
        this.a = zoomableImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.a.g()) {
            return false;
        }
        if (this.a.f()) {
            ZoomableImageView zoomableImageView = this.a;
            zoomableImageView.e(zoomableImageView.d);
            return true;
        }
        if (this.a.getDrawable() != null) {
            ZoomableImageView zoomableImageView2 = this.a;
            PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            Matrix matrix = new Matrix(zoomableImageView2.e);
            float f = pointF.x;
            float f2 = pointF.y;
            float f3 = zoomableImageView2.a;
            matrix.postScale(f3, f3, f, f2);
            zoomableImageView2.e(matrix);
            return true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.f() || this.a.g()) {
            return false;
        }
        ZoomableImageView zoomableImageView = this.a;
        float f3 = zoomableImageView.b;
        float f4 = (f2 / 1000.0f) * f3;
        float f5 = (f / 1000.0f) * f3;
        float sqrt = (float) Math.sqrt((f5 * f5) + (f4 * f4));
        ajdc ajdcVar = new ajdc(zoomableImageView.e);
        ajdc ajdcVar2 = new ajdc(zoomableImageView.e);
        float f6 = ajdcVar.a;
        float f7 = (-sqrt) / zoomableImageView.c;
        ajdcVar2.a = f6 + (f5 * f7);
        ajdcVar2.b = ajdcVar.b + (f4 * f7);
        ZoomableImageView.FlingAnimationHelper flingAnimationHelper = new ZoomableImageView.FlingAnimationHelper();
        zoomableImageView.l = new AnimatorSet();
        zoomableImageView.l.play(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateX", ajdcVar.a, ajdcVar2.a)).with(ObjectAnimator.ofFloat(flingAnimationHelper, "matrixTranslateY", ajdcVar.b, ajdcVar2.b));
        zoomableImageView.l.setDuration((int) f7);
        zoomableImageView.l.setInterpolator(new DecelerateInterpolator());
        zoomableImageView.l.start();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.a.f() && !this.a.g()) {
            AnimatorSet animatorSet = this.a.k;
            if (animatorSet != null && animatorSet.isRunning()) {
                return true;
            }
            ZoomableImageView zoomableImageView = this.a;
            zoomableImageView.e.postTranslate(-f, -f2);
            zoomableImageView.b(zoomableImageView.e);
            zoomableImageView.setImageMatrix(zoomableImageView.e);
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ZoomableImageView zoomableImageView = this.a;
        View.OnClickListener onClickListener = zoomableImageView.f;
        if (onClickListener != null) {
            onClickListener.onClick(zoomableImageView);
            return true;
        }
        return true;
    }
}
