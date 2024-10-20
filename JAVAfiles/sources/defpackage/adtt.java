package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtt extends BroadcastReceiver {
    private static final advp c = new advp("ShutdownReceiver");
    static boolean a = false;
    private static final adtt d = new adtt();
    private static adod e = null;
    public static final acyz b = acyy.b("catch_unregistering_shutdown_receiver_error");

    public static synchronized void a(Context context, adod adodVar) {
        synchronized (adtt.class) {
            adodVar.getClass();
            e = adodVar;
            if (!a) {
                context.registerReceiver(d, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
                a = true;
            }
        }
    }

    public static synchronized void b(Context context) {
        synchronized (adtt.class) {
            if (a) {
                if (((Boolean) b.a()).booleanValue()) {
                    try {
                        context.unregisterReceiver(d);
                    } catch (IllegalArgumentException e2) {
                        advr.j(e2, c, "ShutdownReceiver unregisterReceiver failed", new Object[0]);
                    }
                } else {
                    context.unregisterReceiver(d);
                }
                a = false;
            }
            e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((String) Optional.ofNullable(intent.getAction()).orElse("")).equals("android.intent.action.ACTION_SHUTDOWN")) {
            advr.c("ShutdownReceiver SHUTDOWN received - closing down Jibe service", new Object[0]);
            adod adodVar = e;
            if (adodVar != null) {
                adodVar.shutdown();
            }
            b(context);
        }
    }
}
