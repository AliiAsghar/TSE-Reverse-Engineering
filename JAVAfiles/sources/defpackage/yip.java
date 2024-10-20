package defpackage;

import android.content.Context;
import j$.time.Duration;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yip {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner");

    public static void a(xnv xnvVar, Context context) {
        File[] listFiles;
        long epochMilli = xnvVar.f().toEpochMilli();
        File cacheDir = context.getCacheDir();
        if (cacheDir != null && cacheDir.exists() && (listFiles = cacheDir.listFiles()) != null) {
            for (File file : listFiles) {
                if ((file.getName().startsWith("hobbes") || file.getName().startsWith("multi_") || file.getName().startsWith("quantized_model") || file.getName().startsWith("sensitive_classifier") || file.getName().startsWith("smarts_cache_item_")) && epochMilli - file.lastModified() > Duration.ofDays(((Integer) yiq.a.e()).intValue()).toMillis()) {
                    if (file.delete()) {
                        alvw d = a.d();
                        d.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 44, "SmartsCacheCleaner.java")).t("Deleted stale file %s", file.getName());
                    } else {
                        alvw i = a.i();
                        i.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/util/p2p/common/SmartsCacheCleaner", "cleanUpOldCacheFiles", 46, "SmartsCacheCleaner.java")).t("Failed to deleted stale file %s", file.getName());
                    }
                }
            }
        }
    }
}
