package defpackage;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.research.xeno.effect.UserInteractionManager;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apps implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {
    final /* synthetic */ UserInteractionManager a;
    private float b = brg.a;
    private float c = brg.a;
    private float d = brg.a;
    private final arjv g = new arjv();
    private final HashMap e = new HashMap();
    private final appq f = new appq();

    public apps(UserInteractionManager userInteractionManager) {
        this.a = userInteractionManager;
    }

    private final void c(int i, MotionEvent motionEvent) {
        aozy createBuilder = appv.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((appv) apagVar).g = micros;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((appv) createBuilder.b).f = a.ak(i);
        appm a = this.a.a(motionEvent.getX(), motionEvent.getY());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appv appvVar = (appv) createBuilder.b;
        a.getClass();
        appvVar.e = a;
        appvVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appv) createBuilder.b).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            appm a2 = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            appv appvVar2 = (appv) createBuilder.b;
            a2.getClass();
            apax apaxVar = appvVar2.d;
            if (!apaxVar.c()) {
                appvVar2.d = apag.mutableCopy(apaxVar);
            }
            appvVar2.d.add(a2);
        }
        aozy createBuilder2 = appu.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        appu appuVar = (appu) createBuilder2.b;
        appv appvVar3 = (appv) createBuilder.s();
        appvVar3.getClass();
        appuVar.c = appvVar3;
        appuVar.b = 6;
        UserInteractionManager.d();
    }

    public final void a(int i, ScaleGestureDetector scaleGestureDetector) {
        if (i == 3) {
            this.b = scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan();
        } else {
            this.b += (scaleGestureDetector.getCurrentSpan() / scaleGestureDetector.getPreviousSpan()) - 1.0f;
        }
        float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
        appm a = this.a.a(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        aozy createBuilder = appu.a.createBuilder();
        aozy createBuilder2 = appx.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((appx) createBuilder2.b).f = a.ak(i);
        double d = this.b;
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar = createBuilder2.b;
        ((appx) apagVar).c = d;
        double d2 = currentSpan;
        if (!apagVar.isMutable()) {
            createBuilder2.u();
        }
        apag apagVar2 = createBuilder2.b;
        ((appx) apagVar2).d = d2;
        if (!apagVar2.isMutable()) {
            createBuilder2.u();
        }
        appx appxVar = (appx) createBuilder2.b;
        a.getClass();
        appxVar.e = a;
        appxVar.b |= 1;
        long micros = TimeUnit.MILLISECONDS.toMicros(scaleGestureDetector.getEventTime());
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        ((appx) createBuilder2.b).g = micros;
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appu appuVar = (appu) createBuilder.b;
        appx appxVar2 = (appx) createBuilder2.s();
        appxVar2.getClass();
        appuVar.c = appxVar2;
        appuVar.b = 2;
        UserInteractionManager.d();
    }

    public final void b(int i, MotionEvent motionEvent, float f, float f2) {
        if (i == 3) {
            this.c = brg.a;
            this.d = brg.a;
        }
        this.c -= f;
        this.d -= f2;
        aozy createBuilder = appw.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((appw) apagVar).g = micros;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((appw) createBuilder.b).f = a.ak(i);
        UserInteractionManager userInteractionManager = this.a;
        PointF pointF = new PointF(this.c, this.d);
        userInteractionManager.b(pointF);
        PointF pointF2 = new PointF(brg.a, brg.a);
        pointF.x -= pointF2.x;
        pointF.y -= pointF2.y;
        appm c = UserInteractionManager.c(pointF);
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appw appwVar = (appw) createBuilder.b;
        c.getClass();
        appwVar.e = c;
        appwVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appw) createBuilder.b).c = pointerCount;
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            appm a = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            appw appwVar2 = (appw) createBuilder.b;
            a.getClass();
            apax apaxVar = appwVar2.d;
            if (!apaxVar.c()) {
                appwVar2.d = apag.mutableCopy(apaxVar);
            }
            appwVar2.d.add(a);
        }
        aozy createBuilder2 = appu.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        appu appuVar = (appu) createBuilder2.b;
        appw appwVar3 = (appw) createBuilder.s();
        appwVar3.getClass();
        appuVar.c = appwVar3;
        appuVar.b = 7;
        UserInteractionManager.d();
        if (i == 5) {
            this.c = brg.a;
            this.d = brg.a;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        aozy createBuilder = appt.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appt) createBuilder.b).f = micros;
        appm a = this.a.a(motionEvent.getX(), motionEvent.getY());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        appt apptVar = (appt) createBuilder.b;
        a.getClass();
        apptVar.e = a;
        apptVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((appt) createBuilder.b).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            appm a2 = this.a.a(motionEvent.getX(i), motionEvent.getY(i));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            appt apptVar2 = (appt) createBuilder.b;
            a2.getClass();
            apax apaxVar = apptVar2.d;
            if (!apaxVar.c()) {
                apptVar2.d = apag.mutableCopy(apaxVar);
            }
            apptVar2.d.add(a2);
        }
        aozy createBuilder2 = appu.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        appu appuVar = (appu) createBuilder2.b;
        appt apptVar3 = (appt) createBuilder.s();
        apptVar3.getClass();
        appuVar.c = apptVar3;
        appuVar.b = 5;
        UserInteractionManager.d();
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        int i;
        if (motionEvent != null) {
            if (f2 != brg.a) {
                f3 = f / f2;
            } else {
                f3 = f;
            }
            float abs = Math.abs(f3);
            if (f != brg.a) {
                f4 = f2 / f;
            } else {
                f4 = f2;
            }
            float abs2 = Math.abs(f4);
            if (abs > abs2) {
                if (f < brg.a) {
                    i = 4;
                } else {
                    i = 3;
                }
            } else if (abs < abs2) {
                if (f2 < brg.a) {
                    i = 6;
                } else {
                    i = 5;
                }
            }
            aozy createBuilder = appz.a.createBuilder();
            long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent2.getEventTime());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apag apagVar = createBuilder.b;
            ((appz) apagVar).g = micros;
            if (!apagVar.isMutable()) {
                createBuilder.u();
            }
            ((appz) createBuilder.b).c = a.am(i);
            appm a = this.a.a(motionEvent.getX(), motionEvent.getY());
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            appz appzVar = (appz) createBuilder.b;
            a.getClass();
            appzVar.f = a;
            appzVar.b |= 1;
            int pointerCount = motionEvent.getPointerCount();
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((appz) createBuilder.b).d = pointerCount;
            for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
                appm a2 = this.a.a(motionEvent.getX(i2), motionEvent.getY(i2));
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                appz appzVar2 = (appz) createBuilder.b;
                a2.getClass();
                apax apaxVar = appzVar2.e;
                if (!apaxVar.c()) {
                    appzVar2.e = apag.mutableCopy(apaxVar);
                }
                appzVar2.e.add(a2);
            }
            aozy createBuilder2 = appu.a.createBuilder();
            if (!createBuilder2.b.isMutable()) {
                createBuilder2.u();
            }
            appu appuVar = (appu) createBuilder2.b;
            appz appzVar3 = (appz) createBuilder.s();
            appzVar3.getClass();
            appuVar.c = appzVar3;
            appuVar.b = 1;
            UserInteractionManager.d();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        appq appqVar = this.f;
        appqVar.a = true;
        appqVar.b = motionEvent.getActionIndex();
        c(3, motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        a(4, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        a(3, scaleGestureDetector);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        a(5, scaleGestureDetector);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null) {
            return false;
        }
        arjv arjvVar = this.g;
        if (!arjvVar.a) {
            arjvVar.a = true;
            i = 3;
        } else {
            i = 4;
        }
        b(i, motionEvent2, f, f2);
        arjv arjvVar2 = this.g;
        arjvVar2.b = motionEvent;
        arjvVar2.c = motionEvent2;
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        aozy createBuilder = apqa.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(motionEvent.getEventTime());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apqa) createBuilder.b).f = micros;
        appm a = this.a.a(motionEvent.getX(), motionEvent.getY());
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apqa apqaVar = (apqa) createBuilder.b;
        a.getClass();
        apqaVar.e = a;
        apqaVar.b |= 1;
        int pointerCount = motionEvent.getPointerCount();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((apqa) createBuilder.b).c = pointerCount;
        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
            appm a2 = this.a.a(motionEvent.getX(i), motionEvent.getY(i));
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            apqa apqaVar2 = (apqa) createBuilder.b;
            a2.getClass();
            apax apaxVar = apqaVar2.d;
            if (!apaxVar.c()) {
                apqaVar2.d = apag.mutableCopy(apaxVar);
            }
            apqaVar2.d.add(a2);
        }
        aozy createBuilder2 = appu.a.createBuilder();
        if (!createBuilder2.b.isMutable()) {
            createBuilder2.u();
        }
        appu appuVar = (appu) createBuilder2.b;
        apqa apqaVar3 = (apqa) createBuilder.s();
        apqaVar3.getClass();
        appuVar.c = apqaVar3;
        appuVar.b = 4;
        UserInteractionManager.d();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a9  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apps.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
