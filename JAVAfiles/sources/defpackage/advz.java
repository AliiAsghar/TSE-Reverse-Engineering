package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class advz {
    private static final advp a = new advp("EngineBroadcaster");
    private static final acyz b = aczd.a(183130774);

    public static void a(Context context, Intent intent, advy advyVar) {
        b(context, intent, "com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver", advyVar);
    }

    public static void b(Context context, Intent intent, String str, advy advyVar) {
        PendingIntent broadcast;
        String action = intent.getAction();
        advr.l(a, "Broadcasting provisioning intent %s to Bugle with extras %s from source %s", action, advq.GENERIC.c(intent.getExtras()), advyVar.E);
        advr.w(7, 3, "Broadcasting %s, %s", action, advr.a(String.valueOf(intent.getExtras())));
        if (((Boolean) b.a()).booleanValue()) {
            broadcast = PendingIntent.getBroadcast(context, 0, intent, yhy.a(1073741824));
        } else {
            broadcast = PendingIntent.getBroadcast(context, 0, intent, 0);
        }
        intent.putExtra("pending_intent", broadcast);
        if (RcsIntents.ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE.equals(action)) {
            intent.setPackage("com.google.android.apps.messaging");
        } else {
            intent.setComponent(new ComponentName("com.google.android.apps.messaging", str));
        }
        context.sendBroadcast(intent);
    }

    public static void c(Context context, String str, Bundle bundle, advy advyVar) {
        Intent intent = new Intent(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        a(context, intent, advyVar);
    }
}
