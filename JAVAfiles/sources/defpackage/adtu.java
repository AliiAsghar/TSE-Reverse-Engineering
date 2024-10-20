package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.ims.service.JibeService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtu extends BroadcastReceiver {
    private Context a = null;
    private adom b = null;

    private static boolean c(Context context) {
        if (!adwi.d(context) && !adwi.e(context)) {
            advr.o("Skip using TelephonyChangeReceiver: it cannot start services", new Object[0]);
            return false;
        }
        return true;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context == null) {
            advr.g("TelephonyChangeReceiver is not registered.", new Object[0]);
            return;
        }
        epw.a(context).c(this);
        this.a = null;
        this.b = null;
    }

    public final synchronized void b(Context context, Intent intent, adom adomVar) {
        if (this.a != null && this.b != null) {
            advr.g("TelephonyChangeReceiver is already registered.", new Object[0]);
            return;
        }
        if (c(context)) {
            this.a = context;
            this.b = adomVar;
            egl.h(context, this, adtr.s());
            if (intent != null) {
                onReceive(context, intent);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        advr.c("TelephonyChangeReceiver triggered.", new Object[0]);
        String action = intent.getAction();
        if (!"com.google.android.ims.SIM_LOADED".equals(action) && !"com.google.android.ims.SIM_ABSENT".equals(action)) {
            advr.k("Unexpected intent: %s", intent);
            return;
        }
        if (c(context)) {
            advr.o("Sending SIM state to JibeService in Bugle", new Object[0]);
            if (this.b != null) {
                advp advpVar = JibeService.a;
                String action2 = intent.getAction();
                if ("com.google.android.ims.SIM_LOADED".equals(action2)) {
                    advr.p(JibeService.a, "SIM state changed: loaded", new Object[0]);
                    JibeService.a(context, action2, null);
                } else if ("com.google.android.ims.SIM_ABSENT".equals(action2)) {
                    advr.p(JibeService.a, "SIM state changed: absent", new Object[0]);
                    JibeService.a(context, action2, intent.getExtras());
                }
            }
        }
    }
}
