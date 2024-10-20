package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqwj extends BroadcastReceiver {
    final /* synthetic */ aqwk a;
    private boolean b = false;

    public aqwj(aqwk aqwkVar) {
        this.a = aqwkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.b;
        boolean z2 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z2 = true;
        }
        this.b = z2;
        if (z2 && !z) {
            this.a.a.e();
        }
    }
}
