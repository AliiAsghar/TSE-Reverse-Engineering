package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxb extends gxe {
    public gxb(Context context, gpx gpxVar) {
        super(context, gpxVar);
    }

    @Override // defpackage.gxe
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.gxg
    public final /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            gsy.a();
            Log.e(gxc.a, "getInitialState - null intent received");
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1);
        float intExtra3 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 / intExtra3 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.gxe
    public final void c(Intent intent) {
        if (intent.getAction() != null) {
            gsy.a().c(gxc.a, "Received ".concat(String.valueOf(intent.getAction())));
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1980154005) {
                    if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                        f(false);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    f(true);
                }
            }
        }
    }
}
