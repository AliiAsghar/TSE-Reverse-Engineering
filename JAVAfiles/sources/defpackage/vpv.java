package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vpv {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier");
    private final Context b;

    public vpv(Context context) {
        this.b = context;
    }

    public final boolean a(int i) {
        if (Binder.getCallingUid() == Process.myUid()) {
            return true;
        }
        try {
            if (this.b.getPackageManager().getApplicationInfo("com.google.android.ims", 0).uid == i) {
                if (adwi.l(this.b)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            alvw f = a.f();
            f.X(alwp.a, "BugleRcs");
            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/rcs/ApplicationInfoVerifier", "isSelfOrCsApk", 40, "ApplicationInfoVerifier.java")).q("Carrier Services is not installed");
            return false;
        }
    }
}
