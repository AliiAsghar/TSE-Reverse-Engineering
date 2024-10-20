package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grt implements grr {
    private final /* synthetic */ int d;
    public static final grt c = new grt(1);
    public static final grt b = new grt(0);

    private grt(int i) {
        this.d = i;
    }

    @Override // defpackage.grr
    public final Rect a(Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        if (this.d != 0) {
            Rect rect = new Rect();
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            defaultDisplay.getRectSize(rect);
            if (!d$$ExternalSyntheticApiModelOutline0.m(activity)) {
                defaultDisplay.getClass();
                Point aF = gvf.aF(defaultDisplay);
                int aI = gvf.aI(activity);
                if (rect.bottom + aI == aF.y) {
                    rect.bottom += aI;
                } else if (rect.right + aI == aF.x) {
                    rect.right += aI;
                }
            }
            return rect;
        }
        currentWindowMetrics = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        bounds.getClass();
        return bounds;
    }
}
