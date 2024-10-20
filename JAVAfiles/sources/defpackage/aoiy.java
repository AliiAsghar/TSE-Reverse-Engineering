package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoiy extends BroadcastReceiver {
    final /* synthetic */ aoiz a;
    private aoiz b;

    public aoiy(aoiz aoizVar, aoiz aoizVar2) {
        this.a = aoizVar;
        this.b = aoizVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        aoiz aoizVar = this.b;
        if (aoizVar != null && aoizVar.a()) {
            if (aoiz.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            aoiz aoizVar2 = this.b;
            aoizVar2.b.b(aoizVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
