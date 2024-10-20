package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wle extends BroadcastReceiver {
    private static final alvi a = alvi.m("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver");
    private final armf b;
    private final armf c;

    public wle(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.c = armfVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        alvw g = a.g();
        g.X(alwp.a, "Bugle");
        ((alvg) g.h("com/google/android/apps/messaging/shared/receiver/CarrierConfigChangeReceiver", "onReceive", 21, "CarrierConfigChangeReceiver.kt")).q("Carrier config changed. Reloading MMS config.");
        xbf xbfVar = (xbf) this.b.b();
        xbh xbhVar = (xbh) this.c.b();
        rzx rzxVar = xbfVar.e;
        qjb.a(new wnc(xbfVar, xbhVar, 7, null), xbfVar.c);
    }
}
