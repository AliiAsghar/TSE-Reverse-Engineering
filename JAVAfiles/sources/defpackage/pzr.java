package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pzr {
    public pzr(armf armfVar, armf armfVar2, armf armfVar3) {
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
    }

    public static String a(Context context) {
        if (yhx.d) {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.provider.Telephony.SMS_CB_RECEIVED"), 1048576);
            if (resolveActivity == null) {
                pso.a.q("getDefaultCellBroadcastReceiverPackageName: no package found");
                return "com.android.cellbroadcastreceiver";
            }
            String str = resolveActivity.activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "com.android.cellbroadcastreceiver";
    }

    public static boolean b() {
        return anfi.a("bugle.enable_network_status_in_rcs_settings", "bugle");
    }

    public pzr(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
    }
}
