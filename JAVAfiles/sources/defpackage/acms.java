package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acms extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ acmt a;

    public acms(acmt acmtVar) {
        this.a = acmtVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        advr.d(acmt.b, "onAvailable triggered.", new Object[0]);
        this.a.d(2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        int i;
        advr.d(acmt.b, "onBlockedStatusChanged triggered. Blocked=%b", Boolean.valueOf(z));
        if (true != z) {
            i = 2;
        } else {
            i = 3;
        }
        this.a.d(i);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        advr.d(acmt.b, "onCapabilitiesChanged triggered. NetworkCapabilities=%s", advq.GENERIC.c(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        advr.d(acmt.b, "onLinkPropertiesChanged triggered. LinkProperties=%s", advq.GENERIC.c(linkProperties));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        advr.d(acmt.b, "onLosing triggered.", new Object[0]);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        advr.d(acmt.b, "onLost triggered.", new Object[0]);
        this.a.d(4);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        advr.d(acmt.b, "onUnavailable triggered.", new Object[0]);
        this.a.d(4);
    }
}
