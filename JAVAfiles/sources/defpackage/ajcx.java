package defpackage;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajcx extends TouchDelegate {
    private static final Rect c = new Rect();
    public final List a;
    public TouchDelegate b;

    public ajcx(View view) {
        super(c, view);
        this.a = new ArrayList();
    }

    public final void a(TouchDelegate touchDelegate) {
        this.a.add(touchDelegate);
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        TouchDelegate touchDelegate;
        boolean onTouchEvent;
        int actionMasked = motionEvent.getActionMasked();
        boolean z = false;
        if (actionMasked == 0) {
            if (motionEvent.getPointerCount() > 1) {
                return false;
            }
            int size = this.a.size();
            do {
                size--;
                if (size < 0) {
                    return false;
                }
                touchDelegate = (TouchDelegate) this.a.get(size);
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                onTouchEvent = touchDelegate.onTouchEvent(motionEvent);
                motionEvent.setLocation(x, y);
            } while (!onTouchEvent);
            this.b = touchDelegate;
            return true;
        }
        TouchDelegate touchDelegate2 = this.b;
        if (touchDelegate2 != null && touchDelegate2.onTouchEvent(motionEvent)) {
            z = true;
        }
        if (actionMasked == 1 || actionMasked == 32) {
            this.b = null;
        }
        return z;
    }
}
