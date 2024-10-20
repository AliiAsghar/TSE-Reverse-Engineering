package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xve {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents");
    private final Context b;

    public xve(Context context) {
        this.b = context;
    }

    public final Intent a(String str) {
        if (!str.startsWith("tel:")) {
            str = "tel:".concat(String.valueOf(str));
        }
        return new Intent("android.intent.action.DIAL").setData(Uri.parse(str));
    }

    public final Intent b(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public final boolean c(Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (intent != null && (queryIntentActivities = this.b.getPackageManager().queryIntentActivities(intent, 0)) != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.exported) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(Intent intent) {
        if (c(intent)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            this.b.startActivity(intent);
            return true;
        }
        alvw i = a.i();
        i.X(alwp.a, "Bugle");
        ((alvg) ((alvg) i).h("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents", "tryLaunchBusinessActionIntent", 59, "BusinessActionIntents.java")).t("Failed to launch business action intent: %s", intent.getAction());
        return false;
    }
}
