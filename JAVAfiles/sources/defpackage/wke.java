package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wke {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho");

    public static void a(Context context, int i, int i2) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (!yhx.h) {
            return;
        }
        Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
        c(intent, i, i2);
        alvw g = a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTycho", 58, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
        if (!xyp.h()) {
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle = shareIdentityEnabled.toBundle();
            context.sendBroadcast(intent, null, bundle);
            return;
        }
        context.sendBroadcast(intent);
    }

    public static void b(Context context, int i, int i2) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (!yhx.h) {
            return;
        }
        Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_SCHEDULED_STATUS");
        intent.putExtra("provisioning_scheduled_status", i - 1);
        intent.putExtra("sub_id", i2);
        intent.setPackage("com.google.android.apps.tycho");
        alvw g = a.g();
        g.X(alwp.a, "BugleRcsProvisioning");
        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoAboutProvisioningScheduled", 83, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Scheduled Status");
        if (!xyp.h()) {
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle = shareIdentityEnabled.toBundle();
            context.sendBroadcast(intent, null, bundle);
            return;
        }
        context.sendBroadcast(intent);
    }

    public static void c(Intent intent, int i, int i2) {
        intent.putExtra("provisioning_status", i - 1);
        intent.putExtra("sub_id", i2);
        intent.setPackage("com.google.android.apps.tycho");
    }
}
