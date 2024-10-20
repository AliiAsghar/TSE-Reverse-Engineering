package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqwi extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ aqwk a;

    public aqwi(aqwk aqwkVar) {
        this.a = aqwkVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a.a.e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            this.a.a.e();
        }
    }
}
