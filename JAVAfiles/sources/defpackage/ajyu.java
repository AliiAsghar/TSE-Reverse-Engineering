package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.android.vcard.VCardConfig;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyu {
    private static final alvi d = alvi.m("com/google/apps/tiktok/account/api/controller/Config");
    public final boolean a;
    public final alog b;
    public final alog c;

    public ajyu() {
        throw null;
    }

    public static ajyt a() {
        ajyt ajytVar = new ajyt();
        ajytVar.c(false);
        ajytVar.b(akaj.class);
        ajytVar.e = null;
        return ajytVar;
    }

    public static ajyt b(Activity activity) {
        if (!d()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((alvg) ((alvg) d.i()).h("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 88, "Config.java")).t("External config used on invalid activity: %s", activity.getClass());
            }
        }
        ajyt a = a();
        a.c(true);
        return a;
    }

    public static ajyt c(Activity activity) {
        if (!d()) {
            Intent intent = activity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((alvg) ((alvg) d.i()).h("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 62, "Config.java")).t("Launcher config used on invalid activity: %s", activity.getClass());
            }
        }
        ajyt a = a();
        a.c(true);
        return a;
    }

    private static boolean d() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajyu) {
            ajyu ajyuVar = (ajyu) obj;
            if (this.a == ajyuVar.a && alzz.at(this.b, ajyuVar.b)) {
                alog alogVar = this.c;
                alog alogVar2 = ajyuVar.c;
                if (alogVar != null ? alzz.at(alogVar, alogVar2) : alogVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        int hashCode2 = ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
        alog alogVar = this.c;
        if (alogVar == null) {
            hashCode = 0;
        } else {
            hashCode = alogVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        alog alogVar = this.c;
        return "Config{canSwitchAccounts=" + this.a + ", initialSelectors=" + String.valueOf(this.b) + ", overrideRequirements=" + String.valueOf(alogVar) + "}";
    }

    public ajyu(boolean z, alog alogVar, alog alogVar2) {
        this.a = z;
        this.b = alogVar;
        this.c = alogVar2;
    }
}
