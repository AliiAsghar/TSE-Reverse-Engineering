package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aohc extends BroadcastReceiver {
    public aohd a;

    public aohc(aohd aohdVar) {
        this.a = aohdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aohd aohdVar = this.a;
        if (aohdVar != null && aohdVar.b()) {
            if (FirebaseInstanceId.n()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            aohd aohdVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = aohdVar2.a;
            FirebaseInstanceId.p(aohdVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
