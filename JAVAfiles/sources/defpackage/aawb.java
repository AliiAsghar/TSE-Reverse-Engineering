package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawb extends View {
    final /* synthetic */ RenderOverlay a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawb(RenderOverlay renderOverlay, Context context) {
        super(context);
        this.a = renderOverlay;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        List<aawc> list = this.a.b;
        if (list != null) {
            loop0: while (true) {
                z = false;
                for (aawc aawcVar : list) {
                    aawcVar.a(canvas);
                    if (z || ((aavv) aawcVar).b) {
                        z = true;
                    }
                }
            }
            if (z) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        RenderOverlay renderOverlay = this.a;
        renderOverlay.getLocationInWindow(renderOverlay.d);
        super.onLayout(z, i, i2, i3, i4);
        List list = this.a.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((aawc) it.next()).b(i, i2, i3, i4);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        List list = this.a.c;
        boolean z = false;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                z |= ((aawc) it.next()).e(motionEvent);
            }
        }
        return z;
    }
}
