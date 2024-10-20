package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aoiu extends BroadcastReceiver {
    public aoiv a;

    public aoiu(aoiv aoivVar) {
        this.a = aoivVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aoiv aoivVar = this.a;
        if (aoivVar != null && aoivVar.c()) {
            if (aoiv.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            aoiv aoivVar2 = this.a;
            FirebaseMessaging firebaseMessaging = aoivVar2.a;
            FirebaseMessaging.j(aoivVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
