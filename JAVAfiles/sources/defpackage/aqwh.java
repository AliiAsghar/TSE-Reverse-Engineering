package defpackage;

import android.content.BroadcastReceiver;
import android.net.ConnectivityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqwh implements Runnable {
    final /* synthetic */ aqwk a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public aqwh(aqwk aqwkVar, Object obj, int i) {
        this.c = i;
        this.b = obj;
        this.a = aqwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            this.a.c.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.b);
        } else {
            this.a.b.unregisterReceiver((BroadcastReceiver) this.b);
        }
    }
}
