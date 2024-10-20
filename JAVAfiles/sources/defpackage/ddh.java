package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ddh {
    public static final ddh a = new ddh();

    private ddh() {
    }

    public final boolean a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        if ((Float.floatToRawIntBits(rawX) & Integer.MAX_VALUE) < 2139095040) {
            rawY = motionEvent.getRawY(i);
            if ((Float.floatToRawIntBits(rawY) & Integer.MAX_VALUE) < 2139095040) {
                return true;
            }
            return false;
        }
        return false;
    }
}
