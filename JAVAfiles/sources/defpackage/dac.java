package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dac implements dab {
    private final AccessibilityManager a;

    public dac(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }

    @Override // defpackage.dab
    public final long a(long j, boolean z) {
        int i;
        int recommendedTimeoutMillis;
        if (j >= 2147483647L) {
            return j;
        }
        if (z) {
            i = 7;
        } else {
            i = 3;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.a.getRecommendedTimeoutMillis((int) j, i);
            if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            return recommendedTimeoutMillis;
        }
        if (z && this.a.isTouchExplorationEnabled()) {
            return Long.MAX_VALUE;
        }
        return j;
    }
}
