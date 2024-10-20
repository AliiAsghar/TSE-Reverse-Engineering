package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akaz {
    private static final alvi a = alvi.m("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType");
    private final Context b;

    public akaz(Context context) {
        context.getClass();
        this.b = context;
    }

    public final int a() {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.b.getApplicationInfo().targetSdkVersion;
        boolean z2 = true;
        if (i2 >= 34) {
            z = true;
        } else {
            ((alvg) a.g().h("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "isTargetSdkAtLeastU", 61, "DefaultForegroundServiceType.kt")).u("targetSdk (%d) >= VERSION_CODES.UPSIDE_DOWN_CAKE (%d) == false", i2, 34);
            z = false;
        }
        if (i < 34) {
            z2 = false;
        }
        if (!z2 || !z) {
            ((alvg) a.g().h("com/google/apps/tiktok/concurrent/DefaultForegroundServiceType", "get", 33, "DefaultForegroundServiceType.kt")).I("BuildCompat.isAtLeastU()=%b, isTargetSdkAtLeastU()=%b", z2, z);
        }
        if (!z2 || !z) {
            return 0;
        }
        return 2048;
    }
}
