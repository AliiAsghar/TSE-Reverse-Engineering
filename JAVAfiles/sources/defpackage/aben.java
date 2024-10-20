package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aben implements yxa {
    private static final alwo a = alwo.o("BugleWearable");
    private final Context b;
    private final armf c;

    public aben(Context context, armf armfVar) {
        this.b = context;
        this.c = armfVar;
    }

    private final boolean c(String str) {
        try {
            this.b.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r11.b.getPackageManager().getPackageInfo("com.google.android.apps.wear.companion", 0).versionCode >= 330837029) goto L12;
     */
    @Override // defpackage.yxa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r11 = this;
            java.lang.String r0 = "companionHasMissingHapticsBugFix"
            java.lang.String r1 = "com/google/android/apps/messaging/wearable/util/WearableCompanionAppInstalledImpl"
            java.lang.String r2 = "WearableCompanionAppInstalledImpl.java"
            java.lang.String r3 = "WearableCompanionAppInstalledImpl"
            r4 = 0
            boolean r5 = defpackage.yhx.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            r6 = 1
            r7 = 330837029(0x13b82c25, double:1.634552104E-315)
            java.lang.String r9 = "com.google.android.apps.wear.companion"
            if (r5 == 0) goto L26
            android.content.Context r5 = r11.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            long r9 = defpackage.cok$$ExternalSyntheticApiModelOutline0.m(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 < 0) goto L53
            goto L37
        L26:
            android.content.Context r5 = r11.b     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r9, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            int r5 = r5.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            long r9 = (long) r5
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 < 0) goto L53
        L37:
            r4 = r6
            goto L53
        L39:
            alwo r5 = defpackage.aben.a
            alvw r5 = r5.g()
            alwl r5 = (defpackage.alwl) r5
            alvz r6 = defpackage.ydl.M
            r5.X(r6, r3)
            r6 = 98
            alvw r5 = r5.h(r1, r0, r6, r2)
            alwl r5 = (defpackage.alwl) r5
            java.lang.String r6 = "Denali not installed. Assuming companion app doesn't have notification haptics fix."
            r5.q(r6)
        L53:
            alwo r5 = defpackage.aben.a
            alvw r5 = r5.m()
            alvz r6 = defpackage.ydl.M
            r5.X(r6, r3)
            r3 = 106(0x6a, float:1.49E-43)
            alvw r0 = r5.h(r1, r0, r3, r2)
            alwl r0 = (defpackage.alwl) r0
            java.lang.String r1 = "Computed companionHasMissingHapticsBugFix with value=%s"
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r0.t(r1, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aben.a():boolean");
    }

    @Override // defpackage.yxa
    public final boolean b() {
        boolean c = c("com.google.android.wearable.app");
        if (!c) {
            Iterator it = ((Set) this.c.b()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (c((String) it.next())) {
                    c = true;
                    break;
                }
            }
        }
        alvw m = a.m();
        m.X(ydl.M, "WearableCompanionAppInstalledImpl");
        ((alwl) m.h("com/google/android/apps/messaging/wearable/util/WearableCompanionAppInstalledImpl", "isWearCompanionAppInstalled", 65, "WearableCompanionAppInstalledImpl.java")).t("Computed isWearCompanionAppInstalled with value=%s", Boolean.valueOf(c));
        return c;
    }
}
